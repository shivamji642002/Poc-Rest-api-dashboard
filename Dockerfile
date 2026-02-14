# Use OpenJDK 23 base image
FROM eclipse-temurin:23-jdk

# Set working directory
WORKDIR /app

# Copy jar file
COPY target/dashboard-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]
