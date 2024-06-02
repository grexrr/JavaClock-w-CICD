# Use an official OpenJDK 17 runtime as a parent image
FROM openjdk:17-jdk

# Set the working directory in the container
WORKDIR /usr/src/myapp

# Copy the compiled java code to the container
COPY ./src /usr/src/myapp

# Compile Java code
RUN javac grexrrClockProject/Clock.java

# Run Clock when the container launches
CMD ["java", "grexrrClockProject.Clock"]
