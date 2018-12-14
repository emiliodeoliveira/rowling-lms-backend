# Rowling LMS [![Build Status](https://travis-ci.org/emiliodeoliveira/rowling-lms-spring.svg?branch=master)](https://travis-ci.org/emiliodeoliveira/rowling-lms-spring)
Rowling Library Management System API with Spring and Maven.

### First steps:

1) On the command line
```
git clone https://github.com/emiliodeoliveira/rowling-lms-spring.git
```
2) Inside Eclipse or STS
```
File -> Import -> Maven -> Existing Maven project
```
3) Inside IntelliJ IDEA

In the main menu, choose `File -> Open` and select the Rowling [pom.xml](pom.xml). Click on the `Open` button.

CSS files are generated from the Maven build. You can either build them on the command line `./mvnw generate-resources`
or right click on the `rowling-lms-spring` project then `Maven -> Generates sources and Update Folders`.

A run configuration named `RowlingApplication` should have been created for you if you're using a recent Ultimate
version. Otherwise, run the application by right clicking on the `RowlingApplication` main class and choosing
`Run 'RowlingApplication'`.

4) Use http://localhost:4200/login to login in the system and get the token.
