FROM digitalgenius/alpine-jdk
VOLUME /data
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /app.jar
EXPOSE 9999
ENTRYPOINT ["java","-Xms128m","-Xmx256m","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
