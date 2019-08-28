FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER waiter <1403976416@qq.com>

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /opt/projects/equip

WORKDIR /opt/projects/equip

ENV USR_USERNAME zhangkai0121
ENV USR_PASSWORD zhangkai0121
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /app.jar
EXPOSE 8998
#ENTRYPOINT ["java","-Xms128m","-Xmx256m","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
CMD java -jar -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=128m -Xms1024m -Xmx1024m \
 -Xmn256m -Xss256k -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC \
 -Dspring.profiles.active=docker app.jar