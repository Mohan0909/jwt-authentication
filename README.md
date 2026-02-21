# Food Delivery JWT Authentication System

A secure authentication & authorization system built using **Spring Boot**, **Spring Security**, and **JWT (JSON Web Token)**.

This project demonstrates stateless authentication with role-based access control for a Food Delivery application.

---

## Features

* User Registration API
* User Login API
* JWT Token Generation
* Token Validation Filter
* Role-Based Authorization
* Password Encryption using BCrypt
* Secure REST APIs

---

## Tech Stack

* Java 17
* Spring Boot
* Spring Security
* JWT
* Maven
* MySQL
* REST APIs

---

## Project Architecture

Controller → Service → Repository → Security → Database

Security Layer Includes:

* JwtAuthenticationFilter
* SecurityConfig
* CustomUserDetailsService

---

##  Configuration

Rename the file:

application-example.properties → application.properties

Update the following values:

* Database username & password
* JWT secret key

---

##  Run Locally

Clone the repository:

git clone https://github.com/yourusername/food-delivery-jwt-authentication.git

Navigate into project:

cd food-delivery-jwt-authentication

Run using Maven:

mvn spring-boot:run

---

## 📬 API Endpoints

| Method | Endpoint       | Description              |
| ------ | -------------- | ------------------------ |
| POST   | /auth/register | Register a new user      |
| POST   | /auth/login    | Authenticate and get JWT |

---

##  Security Flow

1. User logs in
2. Server validates credentials
3. JWT token generated
4. Token sent in Authorization header
5. Filter validates token for protected APIs

---

## Author

Mohan krishna

---

 If you like this project, consider giving it a star.
