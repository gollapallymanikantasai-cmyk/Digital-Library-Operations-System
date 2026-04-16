#  Digital Library Operations System

##  Description
This is a **full-stack Digital Library Operations System** that allows users to manage book records through a modern and interactive interface. The application provides complete **CRUD operations** with a React-based frontend and a Spring Boot REST API backend.

---

##  Tech Stack

###  Backend
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- REST APIs

###  Frontend
- React.js
- Axios
- Chart.js

###  Tools
- Postman
- Swagger (OpenAPI)

---

##  Features

###  Book Management
- Add new books
- Update existing books
- Delete books
- View all books

###  Search & Filter
- Search by title, author, or ID
- Filter books by price range
- Sort by title, author, price, or ID

###  Data Visualization
- Interactive bar chart using **Chart.js**
- Displays price distribution of books

###  Export Feature
- Export book data as CSV file

###  UI Features
- Dark / Light mode toggle
- Responsive and modern UI design
- Card and table view layouts

###  Notifications
- Toast messages for user actions (success/error/info)

###  Backend Features
- RESTful API design (GET, POST, PUT, DELETE)
- Layered architecture:
  - Controller
  - Service
  - Repository
- MySQL integration using JPA

###  API Documentation
- Swagger UI for testing APIs directly in browser

---

##  API Endpoints

| Method | Endpoint           | Description          |
|--------|------------------|----------------------|
| GET    | /api/getBooks     | Fetch all books      |
| POST   | /api/insert       | Add a new book       |
| PUT    | /api/update/{id}  | Update book by ID    |
| DELETE | /api/delete/{id}  | Delete book by ID    |

---

##  How to Run the Project

###  Backend (Spring Boot)
1. Open project in IntelliJ / Eclipse  
2. Configure MySQL database  
3. Update `application.properties` with DB credentials  
4. Run Spring Boot application  
5. Server runs at:
   http://localhost:8080


---

###  Frontend (React)

1. Navigate to frontend folder:
   ```bash
   cd frontend

2. Install dependencies:

   npm install

3. Start application:

   npm start

4. Open browser:

    http://localhost:3000



---

###  Screenshots

<img width="1885" height="865" alt="image" src="https://github.com/user-attachments/assets/919b326a-a99b-4395-92e3-4cf785b3f530" />
