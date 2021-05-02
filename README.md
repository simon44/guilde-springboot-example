# Project #

This project is used to compare springboot and quarkus. It covers commons needs for an API : 
- CRUD endpoints, connected to a datasource
- HttpClient to call an external API  
- Secure resources access (with basic authentication)
- Expose endpoints on a swagger-ui

# Useful links and information #

- JDK used : openjdk 11.0.8 2020-07-14
- JAR size : 54Mo
- Docker image size (build with Jib) : 301Mo
- Swagger URL : http://localhost:8085/swagger-ui/index.html
- Memory metrics :
    - http://localhost:8085/actuator/metrics/jvm.memory.committed ~~ 416Mo
    - http://localhost:8085/actuator/metrics/jvm.memory.used ~~ 202Mo