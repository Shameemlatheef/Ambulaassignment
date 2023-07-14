# Ambulaassignment
User location assignment from ambula career

 

 - I have developed this REST API  which is build on Gradle(Groovy an User location Application. This API performs all the fundamental CRUD operations .
 
- This project is developed by me for AMBULA carrers assignemnts .
- # Functionalities
-   admin can enter data
-   admin can delete data
-   admin can patch data
-   Reader can get the nearest five locations based on longitude and latitude
-   


## Backend Work
-  Proper Exception Handling
-  Data Stored in the database(Hyper Sql)

-  ## Installation and Run
-  You can clone this repo and start the serve on localhost
-   Before running the API server, we should update the database config inside the application.properties file.
-   Update the port number, username and password as per our local database config.
-   #changing the server port
    server.port=8088
     #db specific properties
    spring.datasource.url=jdbc:hsqldb:hsql://localhost/
     spring.datasource.driver-class-name=org.hsqldb.jdbc.JDBCDriver
    spring.datasource.username=SA
    spring.datasource.password=
     #ORM s/w specific properties
     spring.jpa.hibernate.ddl-auto=update

-   
# Tech Stacks
-   Java Core
-   Spring Data JPA
-   Spring Boot
-   Hibernate
-   Gradle(Groovy)
-   HyperSQL
