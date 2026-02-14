# 🚀 Dashboard API – Spring Boot + MySQL + Docker

A full-stack backend REST API built using:

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL 8
- Docker & Docker Compose

This project provides CRUD operations for managing projects along with dashboard statistics and budget reports.

---

# 📌 Features

✅ Create, Update, Delete Projects  
✅ View All Projects  
✅ Dashboard Summary API  
✅ Budget Report API  
✅ MySQL Database Integration  
✅ Dockerized Application  
✅ Clean REST Architecture

---

# 🏗️ Project Architecture

```Client (Postman / Browser)
↓
Spring Boot REST API
↓
Spring Data JPA
↓
MySQL (Docker Container)
```
---

# 📂 Project Structure

```dashboard/
│── src/main/java/com/example/dashboard
│ ├── controller
│ ├── service
│ ├── repository
│ ├── entity
│ └── DashboardApplication.java
│
│── src/main/resources
│ └── application.properties
│
│── Dockerfile
│── docker-compose.yml
│── pom.xml
│── README.md
```

---

# ⚙️ Prerequisites

Make sure you have installed:

- Java 17+
- Maven
- Docker Desktop
- MySQL Workbench (Optional for DB GUI)

---

# 🐳 Running With Docker

## Step 1 – Build Application

```bash
mvn clean package
docker compose up --build
docker ps
```
---
# 🗄️ Database Configuration

# Docker MySQL runs on:
```
Host: 127.0.0.1
Port: 3307
Username: root
Password: root
Database: dashboard_db
```

# 🔥 API Endpoints
1#️⃣ Create Project
```
POST /api/projects

{
"name": "Banking App",
"status": "In Progress",
"budget": 500000,
"clientName": "HDFC"
}
```
---

2️⃣ Get All Projects

```
GET /api/projects

3️⃣ Get Project By ID

GET /api/projects/{id}

4️⃣ Update Project

PUT /api/projects/{id}

5️⃣ Delete Project

DELETE /api/projects/{id}

6️⃣ Dashboard Summary

GET /api/dashboard

Response:

{
"totalProjects": 5,
"completedProjects": 2,
"inProgressProjects": 3
}

7️⃣ Budget Report

GET /api/report/budget

Returns total budget of all projects.
```
# 🛠️ Docker Commands

Stop containers:

docker compose down


View logs:

docker logs dashboard_api_container


Access MySQL container:

docker exec -it mysql_container mysql -u root -p

# 🧠 JPA Configuration

In application.properties:

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Tables auto-create on application startup.

# 🧪 Testing

You can test APIs using:

Postman

Browser (for GET requests)

📈 Future Improvements

Add Swagger UI

Add Spring Security + JWT

Add Unit & Integration Testing

Add Pagination & Sorting

Deploy to AWS / Azure

Add CI/CD pipeline

# 👨‍💻 Author

Shivam
Java Backend Developer
Spring Boot | Microservices | Docker | MySQL

📜 License

This project is for learning and demonstration purposes.


---



