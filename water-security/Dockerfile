FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER waiter <1403976416@qq.com>

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /opt/projects/equip

WORKDIR /opt/projects/equip

ENV EUREKA http://172.0.0.2:9999/eureka
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /app.jar
EXPOSE 8866
ENTRYPOINT ["java","-jar","-Xms128m","-Xss256k" ,"-XX:SurvivorRatio=8",\
"-XX:+UseConcMarkSweepGC","-Xmx256m","-XX:MetaspaceSize=128m",\
"-Djava.security.egd=file:/dev/./urandom","/app.jar","--spring.profiles.active=docker"]
#CMD java -jar -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=128m -Xms1024m -Xmx1024m \
# -Xmn256m -Xss256k -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC \
# -Dspring.profiles.active=docker /app.jar