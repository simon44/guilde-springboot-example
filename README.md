# Project #

This project is used to compare springboot and quarkus. It covers commons needs for an API : 
- CRUD endpoints, connected to a datasource
- **TODO** HttpClient to call an external API  
- Secure resources access (here with basic authentication)
- Expose endpoints on a swagger-ui

# Useful links #

- Swagger URL : http://localhost:8085/swagger-ui/index.html
- Memory metrics :
    - http://localhost:8085/actuator/metrics/jvm.memory.committed ~~ 416Mo
    - http://localhost:8085/actuator/metrics/jvm.memory.used ~~ 192Mo