# Fetching latest version of Java
FROM openjdk:17
 
# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY ./target/gbros-java-0.0.1.jar /app

# Exposing port 8080
EXPOSE 8080

# Starting the application
CMD ["java", "-jar", "gbros-java-0.0.1.jar"]