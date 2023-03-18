LABEL maintainer="Spring Boot API"

# Install OpenJDK-8
RUN apt update && \
    apt install -y openjdk-8-jdk && \
    apt clean;
    
# Fix certificate issues
RUN apt update && \
    apt install ca-certificates-java && \
    apt clean && \
    update-ca-certificates -f;

# Setup JAVA_HOME -- useful for docker commandline
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64/
RUN export JAVA_HOME

COPY /target/*.jar app.jar
ENTRYPOINT /bin/sh -c "java - jar /app.jar"
