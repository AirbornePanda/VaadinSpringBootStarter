#Vaadin - Spring-Boot Base App
This is a simple base project for the use of [Vaadin](https://vaadin.com/) in combination with [Spring Boot](https://spring.io/projects/spring-boot/).

This base projects tries to do the following things:

* Keep up with the latest working dependencies
* Make testing (including repositories) possible
* Make development possible, as soon as all dependencies are loaded

All you have to do is run `mvn spring-boot:run`. A tomcat should be started autmatically and you can reach your app under http://localhost:8080.

You can also run this as an application from the application class. But this wont execute the npm downloads for npm packages.

##Prerequisites
Have [Node.js](https://nodejs.org/en/) installed. If you haven't or it can't be located, Vaadin will throw an error and abort. 

##To-Do
Make this an maven archetype. 