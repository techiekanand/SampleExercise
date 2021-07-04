# SampleExercise
Sample Exercise for User Profile Microservice

## Prerequisite:
Following software should be installed
- gradle version 7.0.2
- java version > 1.8

## Start the application
Open console,i.e., cmd

go to application root,i.e., userprofile


<userprofile> gradlew bootRun

The command will start the application after download all the relevant jars and artifacts

### Access the application through Swagger
http://localhost:9091/swagger-ui.html

**Note** -Sample application userprofile is created with memdatabase. Before accessing any operation of GET, PUT or DELETE, make sure POST operation is performed by creating a new record of user.


