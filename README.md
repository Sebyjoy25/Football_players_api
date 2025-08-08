# ⚽ Football Player Stats API

A Spring Boot REST API for managing football player statistics, built with JPA, PostgreSQL, and Swagger.  
This project was built as a personal endeavor to practice backend development, RESTful design principles, and fundamental CRUD operations.

---

## 🚀 Features
- Create, read, update, and delete player records
- Search players by name (case-insensitive)
- Error handling for missing players
- Endpoints tested using Postman

---

## 📦 Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Swagger (for API documentation)
- Postman (for testing)

---

## 📂 Endpoints
- `GET /api/v1/player` — Retrieve all football players
- `GET /api/v1/player/{name}` — Get a specific player by name
- `POST /api/v1/player` — Add a new football player
- `PUT /api/v1/player/update-ratings/{name}` — Update player ratings
- `DELETE /api/v1/player/{name}` — Delete a player by name

---

## 🛠️ How to Run
1. Clone the repository
2. Set up PostgreSQL and configure `application.properties`
3. Run the app with:
   ```bash
   mvn spring-boot:run