# Azure_developer_Quiz

This is a microproject built using **Spring Boot (Java)** as the backend and **HTML/CSS/JS** for the frontend. The application is designed to conduct a 10-questioA dynamic, full-stack web application featuring an interactive quiz on Azure fundamentals. This project uses a Spring Boot REST API to manage quiz submissions and a vibrant HTML, CSS, and JavaScript frontend to deliver an engaging user experience.
n quiz based on the **Microsoft Azure AZ-900 Certification**. It captures user details (Name and Roll Number), evaluates their answers, calculates the score, and stores the result in a PostgreSQL database.

# ✨ Core Features
RESTful Backend: Built with Java and Spring Boot to provide a robust API for handling quiz logic.
PostgreSQL Integration: Uses Spring Data JPA to seamlessly store user details and quiz results in a PostgreSQL database.
Interactive Frontend: A 10-question quiz on Azure with a modern "glassmorphism" design, smooth animations, and interactive elements.
Dynamic Results: After submission, a celebratory pop-up appears with a "cracker" animation, displaying the user's final score.
Data Persistence: Captures the user's name, roll number, and their specific answers for potential future analysis.
Maven Project: A well-structured Maven project, making it easy to build, manage dependencies, and run.

# 🎮 How to Use the Quiz
With the backend server running, navigate to the src/main/resources/static folder.
Open the index.html file in any modern web browser (like Chrome, Firefox, or Edge).
Enter your Name and Roll Number.
Answer the 10 questions.
Click "Reveal My Score".
Watch the celebration! Your score will be displayed, and the results will be saved to the database.

## 🔧 Technologies Used

### 💻 Backend
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- Maven (Build Tool)

### 🌐 Frontend
- HTML
- CSS
- JavaScript

### 🗄️ Database
- PostgreSQL

 # 📌 Project Features

- 📋 10-question Azure-based quiz using radio buttons
- 🧑 Accepts user's Name and Roll Number
- ✅ Submits and evaluates answers via REST API
- 🧮 Calculates score out of 10
- 💾 Stores Name, Roll Number, and Score in a PostgreSQL table
- 📤 Displays result on frontend dynamically
- 📡 CORS enabled to connect frontend (`http://localhost:5500`) and backend (`http://localhost:8081`)

# 🗃️ Database Table
The PostgreSQL table quiz_result will store:

id: Auto-generated

name: String

rollNumber: String

score: Integer

# output of frontend
 

<img width="1893" height="917" alt="r1" src="https://github.com/user-attachments/assets/37229494-0445-4339-a29e-50fbc657c058" />
<img width="1856" height="923" alt="r2" src="https://github.com/user-attachments/assets/5bac9950-cd54-40a1-90fd-f002d0028fce" />


<img width="1910" height="917" alt="r3" src="https://github.com/user-attachments/assets/2c70deb2-2527-471f-b0cf-454175cf8e54" />
<img width="1910" height="923" alt="r4" src="https://github.com/user-attachments/assets/9e75bd1a-42f1-4e1a-be0f-a9c3d34fac78" />










