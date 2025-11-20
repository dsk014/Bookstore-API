# Bookstore REST API

A simple Spring Boot application to manage books and authors using REST APIs.  
This project allows users to add, view, update, and delete book and author details using HTTP requests.

## Features

=> Add new authors  
=> Add new books  
=> View all authors and books  
=> Update author or book information  
=> Delete author or book by ID  
=> Uses MySQL database for storage  
=> Clean layered architecture (Controller → Service → Repository)  
=> API documentation through Swagger UI

## How to Run

1- Make sure you have Java 17+ installed on your computer  
2- Install MySQL and create a database named: bookstore_db  
3- Update your MySQL username & password in application.properties  
4- Open the project folder in any IDE (IntelliJ, Eclipse, VS Code)  
5- Run the command: mvn clean install  
6- Start the application using: mvn spring-boot:run  
7- Access the API documentation at:  
👉 http://localhost:8080/swagger-ui/index.html

## Project Description

This application uses Spring Boot and JPA to store and manage book and author data in a MySQL database.

### Entities include:

### Author

* ID

* Name

* Email

### Book

* ID

* Title

* Genre

* Price

* Author (Relationship)

The project provides REST endpoints to perform all CRUD operations.  
Swagger UI is enabled for easy testing of APIs.