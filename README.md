⚽ Football Player Stats API
A Spring Boot REST API designed for managing football player statistics. This project was built as a personal endeavor to practice backend development, RESTful design principles, and fundamental CRUD operations.
🚀 Features
• Create, read, update, and delete player records.
• Search players by name (case-insensitive).
• Error handling for missing players is implemented.
• Endpoints have been tested using Postman.
📦 Tech Stack
This API is built using a robust set of technologies:
• Java 17
• Spring Boot
• Spring Data JPA
• PostgresSQL (for the database)
• Postman (used for testing)
📂 Endpoints
The API exposes the following endpoints for interaction:
• GET /api/v1/player: Retrieve all football players.
• GET /api/v1/player/{name}: Get a specific player by their name.
• POST /api/v1/player: Add a new football player to the system.
• PUT /api/v1/player/update-ratings/{name}: Update the ratings of an existing player.
• DELETE /api/v1/player/{name}: Delete a player record by their name.
🛠️ How to Run
To get this application up and running locally:
1. Clone the repository to your local machine.
2. Set up PostgresSQL and ensure you update your application.properties file with the correct database configurations.
3. Run the application using Maven: mvn spring-boot:run.
4. Test the endpoints using Postman or a web browser.