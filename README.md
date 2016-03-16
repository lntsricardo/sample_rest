# SampleRest

This application was created as an example of a Rest using Spring Boot. It uses Spring since the reception in Controller until the persistence layer in the Repository.<br>
Other technologies used are:
- Maven
- MongoDB (configuration in **application.properties**)
- javax.validation

### Configuring the environment

Assuming that you have a Maven and Java 1.8 installed in your environment, you just need to checkout the project from https://github.com/lntsricardo/sample_rest.git. After that, just run the following command inside of your project:
> mvn clean install

This will generate the **SampleRest-0.0.1-SNAPSHOT.jar** inside the directory **target/**.


### Running

You just need to run the command:
> java -jar SampleRest-0.0.1-SNAPSHOT.jar

The application will start a Tomcat embedded on port 8080.

### Creating

> http://localhost:8080/create?name=name&age=age

### Finding

> http://localhost:8080/find?name=name
> http://localhost:8080/findAll
