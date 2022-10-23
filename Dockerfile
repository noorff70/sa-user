#create a package first
#mvn package -Dmaven.test.skip

# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/user-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/sa-user.jar
COPY ${JAR_FILE} sa-user.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","sa-user.jar"]

EXPOSE 8085

# Make docker file
# C:\dev\repos\studyaid\sa-user>docker build -t sa-user .

#run docker file
#C:\dev\repos\studyaid\sa-user>docker run -d -p 8080:8080 -t sa-mysql-image