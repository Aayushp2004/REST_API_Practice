# 📘 Student Management REST API

A beginner-friendly **Spring Boot REST API project** built to understand how real-world backend applications are structured using **layered architecture** and REST principles.

This project focuses on **clarity, correctness, and best practices** rather than advanced complexity.

---

## 🚀 Project Overview

The **Student Management REST API** allows performing basic CRUD (Create, Read, Update, Delete) operations on student data.

It demonstrates how a client (Postman / frontend) communicates with a backend service using **HTTP requests and JSON responses**.

---

## 🏗️ Project Architecture

The project follows a clean **layered architecture**:

```
Controller  →  Service  →  Repository  →  Database
```

### 🔹 Controller Layer

* Handles HTTP requests
* Maps URLs to methods
* Accepts request data and returns responses

### 🔹 Service Layer

* Contains business logic
* Acts as a bridge between controller and repository

### 🔹 Repository Layer

* Handles database interactions
* Uses Spring Data JPA (`JpaRepository`)

---

## 🛠️ Tech Stack

* **Java**
* **Spring Boot**
* **REST API**
* **Spring Data JPA (JpaRepository)**
* **Hibernate**
* **MySQL**
* **Maven**

---

## 📦 Features Implemented

* RESTful API design
* CRUD operations using HTTP methods
* JSON-based request and response handling
* Clean separation of concerns
* Database persistence using JPA

---

## 🔗 API Endpoints

| HTTP Method | Endpoint         | Description            |
| ----------- | ---------------- | ---------------------- |
| POST        | `/students`      | Create a new student   |
| GET         | `/students`      | Get all students       |
| GET         | `/students/{id}` | Get student by ID      |
| PUT         | `/students/{id}` | Update student details |
| DELETE      | `/students/{id}` | Delete student         |

---

## 📄 Sample JSON Request

```json
{
  "name": "Aayush",
  "age": 21,
  "course": "Computer Science"
}
```

---

## ⚙️ Database Configuration

Configure the database in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🧪 Testing the API

You can test the API using:

* **Postman**
* **Browser (GET requests only)**

---

## 📌 Key Learnings

* Importance of layered architecture
* Proper use of HTTP methods in REST APIs
* How Spring Data JPA simplifies database operations
* Why controllers should remain thin
* How Spring Boot reduces boilerplate configuration
* Awareness that tools like **Lombok** can reduce boilerplate code (getters, setters, constructors) instead of writing them manually

---

## 🔜 Future Enhancements

* DTOs and Validation
* Global Exception Handling
* Swagger / OpenAPI documentation
* Pagination and Sorting
* Spring Security with JWT

---

## 🎯 Who Is This Project For?

* Java & Spring Boot beginners
* Freshers preparing for backend interviews
* Students learning REST APIs

---

## 🤝 Feedback

Feedback and suggestions are always welcome.
This project is part of my continuous learning journey in backend development.

---

## 📜 License

This project is for learning and educational purposes.
