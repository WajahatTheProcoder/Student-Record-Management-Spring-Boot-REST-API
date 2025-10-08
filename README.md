# Student Record Management – Spring Boot REST API

This is a Spring Boot REST API for managing student records. It allows you to create, read, update, and delete student details. The API includes authentication and backend validation with basic business logic for calculating percentage and division based on marks.

This project is perfect for practicing REST API development, CRUD operations, Spring Security, and backend validation.

## Features

 User authentication using **Spring Security** (JWT/session-based)
 CRUD operations for students
 Percentage calculation (average of 5 marks)
 Division derivation:

   ≥60% → First Division
   50–59% → Second Division
   <50% → Fail
 Input validation:

   Name: Required, minimum 3 characters
   Age: Required, 5–25
   Marks: 0–100
 All `/api/students/**` endpoints require authentication

## Setup Instructions

1. Clone the repository

```bash
git clone https://github.com/WajahatTheProcoder/Student-Record-Management-Spring-Boot-REST-API
cd Student-Record-Management-Spring-Boot-REST-API
```

2. Build the project

Make sure Maven is installed:

```bash
mvn clean install
```

3. Run the application

```bash
mvn spring-boot:run
```

The API will start on **(http://localhost:8082)**

## Sample Credentials

| Username | Password |
| -------- | -------- |
| admin    | admin123 |

> Use these credentials to log in via `/api/auth/login` before accessing student endpoints.

## Sample Payloads

### Create Student

```json
{
  "name": "Aman",
  "age": 22,
  "marks": [78, 85, 92, 67, 80]
}
```

### Update Student

```json
{
  "name": "Rakesh",
  "age": 23,
  "marks": [65, 70, 72, 68, 75]
}
```

### Successful Response Example

```json
{
  "id": 1,
  "name": "Jane Doe",
  "age": 23,
  "marks": [65, 70, 72, 68, 75],
  "percentage": 70,
  "division": "First Division"
}
```

## cURL Examples

### Login

```bash
curl -X POST "http://localhost:8082/api/auth/login?username=admin&password=admin123"
```

### Create Student

```bash
curl -X POST http://localhost:8082/api/students \
-H "Content-Type: application/json" \
-d '{"name":"John Doe","age":22,"marks":[78,85,92,67,80]}'
```

### Get All Students

```bash
curl -X GET http://localhost:8082/api/students \
-H "Authorization: Bearer <token>"
```

### Update Student

```bash
curl -X PUT http://localhost:8082/api/students/1 \
-H "Content-Type: application/json" \
-H "Authorization: Bearer <token>" \
-d '{"name":"Jane Doe","age":23,"marks":[65,70,72,68,75]}'
```

### Delete Student

```bash
curl -X DELETE http://localhost:8082/api/students/1 \
-H "Authorization: Bearer <token>"
```

> Replace `<token>` with the token received from the login API.

---

## Testing with Postman

You can also use Postman to test all APIs:

1. POST → `http://localhost:8082/api/auth/login`
2. POST → `http://localhost:8082/api/students`
3. GET → `http://localhost:8082/api/students`
4. PUT → `http://localhost:8082/api/students/{id}`
5. DELETE → `http://localhost:8082/api/students/{id}`

Keep the server running and use your login token when accessing `/api/students/**`.

## Technologies Used

 Java 17
 Spring Boot
 Spring Security
 Maven
 H2 (In-memory DB, optional for persistence)

## Notes

 Only backend APIs are implemented; no frontend is required.
 Authentication is mandatory for student APIs.
 Input validation prevents invalid data.

Name: MD Wajahat Raza
Date: 07 October 2025
