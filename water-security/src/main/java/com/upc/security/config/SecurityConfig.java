package com.upc.security.config;

import com.upc.security.service.UserService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

/**
 * @Author: waiter
 * @Date: 2019/8/29 23:56
 * @Version 1.0
 */
@Configuration
@EnableWebSecurity
@AllArgsConstructor
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/swagger-ui.html","/v2/api-docs","/webjars/**").permitAll()
                //静态资源访问无需认证
                .antMatchers("/swagger-resources/**","/v2/api-docs", "/configuration/ui", "/swagger-resources", "/configuration/security", "/swagger-ui.html", "/webjars/**").permitAll()
                .antMatchers("/user/add","/share/**").permitAll()
                //admin开头的请求，需要admin权限
                .antMatchers("/admin/**").hasAnyRole("ADMIN")
                //需登陆才能访问的url
                .anyRequest().authenticated()  //默认其它的请求都需要认证，这里一定要添加
                .and()
                .csrf().disable()  //CRSF禁用，因为不使用session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .and()
                .formLogin().permitAll()
                .and()
                .cors()  //支持跨域
                .and()
                //使用默认的logoutFilter
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessHandler(new HttpStatusReturningLogoutSuccessHandler())
                ;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userService)
                .passwordEncoder(passwordEncoder());
    }

    @Bean
    protected CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("*"));
        configuration.setAllowedMethods(Arrays.asList("GET","POST","HEAD", "OPTIONS","DELETE"));
        configuration.setAllowedHeaders(Arrays.asList("*"));
        configuration.addExposedHeader("Authorization");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
