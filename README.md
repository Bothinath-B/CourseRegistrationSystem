# 🎓 Course Registration System

A simple, user-friendly **Course Registration System** that allows students to register for courses, view available courses, and check enrolled students. Built with a powerful **Java Spring Boot** back-end and an interactive **HTML, CSS, and JavaScript** front-end, integrated with **MySQL** for efficient data management.

---

## 🚀 Features

- ✅ **Register for Courses**  
  Fill out a simple form with your **Name**, **Email ID**, and **Course Name** to enroll in a course. Data is stored securely in the **`course_registry`** table.

- 📚 **View Available Courses**  
  Displays all courses from the **`course`** table, dynamically fetched using RESTful APIs.

- 👨‍🎓 **Show Enrolled Students**  
  Lists all registered students in a clean tabular format, pulled from the database in real-time.

---

## 🛠️ Tech Stack

**Front-End:**  
- 🌐 HTML5  
- 🎨 CSS3  
- ⚡ JavaScript  

**Back-End:**  
- ☕ Java  
- 🌱 Spring Boot  
- 🗃️ Hibernate & Spring JPA  
- 🌐 RESTful API  

**Database:**  
- 🐬 MySQL  

---

## 📂 Project Structure

### 📦 **Back-End (Spring Boot)**

```
CourseRegistrationSystem/
└── src/
    └── main/
        ├── java/com/project/CourseRegistrationSystem/
        │   ├── Controller/
        │   │   ├── CourseController.java
        │   │   └── CourseRegistryController.java
        │   ├── Model/
        │   │   ├── Course.java
        │   │   └── CourseRegistry.java
        │   ├── Repository/
        │   │   ├── CourseRepository.java
        │   │   └── CourseRegistryRepository.java
        │   ├── Service/
        │   │   ├── CourseService.java
        │   │   └── CourseRegistryService.java
        │   └── CourseRegistrationSystemApplication.java
        └── resources/
            └── application.properties
```

### 🎨 **Front-End (HTML, CSS, JavaScript)**

```
FRONTEND/
├── HTML/
│   ├── index.html
│   ├── register.html
│   ├── availableCourse.html
│   └── enrolledStudent.html
├── STYLE/
│   ├── style.css
│   └── registerStyle.css
└── script.js
```

---

## ⚙️ Setup & Installation

### 1️⃣ **Clone the Repository**
```bash
git clone https://github.com/your-username/CourseRegistrationSystem.git
cd CourseRegistrationSystem
```

### 2️⃣ **Back-End Setup**
- Configure the database in `application.properties`:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/your_db
  spring.datasource.username=root
  spring.datasource.password=your_password
  ```
- Build and run the application:
  ```bash
  mvn spring-boot:run
  ```

### 3️⃣ **Front-End Setup**
- Open `index.html` in any browser or serve it using a local server for better performance:
  ```bash
  live-server
  ```

---

## 🌐 API Endpoints

| Method | Endpoint                   | Description                  |
|:------:|:---------------------------|:-----------------------------|
| **GET**    | `/api/courses`               | Fetch all available courses  |
| **GET**    | `/api/course_registry`       | List all enrolled students   |
| **POST**   | `/api/course_registry`       | Register a new student       |
