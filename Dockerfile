# Fetching latest version of Java
FROM openjdk:11
 
# Setting up work directory
#WORKDIR /app

# Copy the jar file into our app
COPY ./target/*.jar gbros-java.jar

# Exposing port 8080
EXPOSE 8080

# Starting the application
CMD ["java", "-jar", "gbros-java.jar"]