# Use official OpenJDK base image
FROM openjdk:17-jdk-slim

# Set work directory
WORKDIR /app

# Copy the built application JAR
COPY target/*.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
