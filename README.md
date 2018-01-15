# SpringBootInMemorySecurity
Basic Demonstration how to use In memory authentication with Spring Boot and Spring Security.

Basically the steps in order to add this kind of security are:

1) add the maven dependency for spring security starter in the pom.xml file;
2) add a java configuration file for the Spring security;
3) add @PreAuthorize in the request mappings of the controller, where you want to apply security restrictions.

In this example there are three level of restrictions: NONE, USER, ADMIN.
The credentials for the USER are: "user", "user".
The credentials for the ADMIN are: "admin", "admin".

It's free to access to http://localhost:8080/info
You can access as USER or as ADMIN to http://localhost:8080/tasks
You can access as ADMIN to http://localhost:8080/objectives

Pay attention because when you access as a user or as admin, the browser will save the cookie and you'll remain logged that way.


