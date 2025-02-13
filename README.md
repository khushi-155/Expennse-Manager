# springMCV
The Expense Manager Application is designed to help employees track their income and expenses efficiently. Users can log their financial transactions, categorize them, and perform CRUD (Create, Read, Update, Delete) operations with ease. This application is built using Spring Boot, Hibernate, and MySQL, ensuring smooth and efficient data management.

1. Features

Add, update, delete, and view income transactions.
Add, update, delete, and view expense transactions.
Categorize income into:
Bonus
Salary
Consultancy
Categorize expenses into:
Food
Education
Bills
Travel
Miscellaneous
View summary of total income and expenses.
Track remaining balance after expenses.

2. Tech Stack
Backend: Spring Boot, Hibernate
Database: MySQL
Tools: Maven, Postman (for API testing)

3. Installation & Setup

a. Prerequisites
Java 17+
MySQL Database
Maven
IDE - Eclipse,

b. Steps to Setup
Clone the Repository
git clone https://github.com/your-repository/expense-manager.git
cd expense-manager
Configure MySQL Database

c. Create a new database in MySQL:
CREATE DATABASE expense_manager;


d. Update application.properties file with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/expense_manager
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

4. Build and Run the Application

mvn clean install
mvn spring-boot:run

Access the Application

API endpoints will be available at http://localhost:8080


5.  Endpoints

Income APIs

POST /api/income - Add income transaction
GET /api/income - Get all income transactions
PUT /api/income/{id} - Update income transaction
DELETE /api/income/{id} - Delete income transaction

Expense APIs

POST /api/expense - Add expense transaction
GET /api/expense - Get all expense transactions
PUT /api/expense/{id} - Update expense transaction
DELETE /api/expense/{id} - Delete expense transaction

6. Future Enhancements

Add authentication and user roles.
Implement monthly and yearly reports.
Integrate a frontend UI.
Export reports in CSV/PDF format.

7. Steps to Setup

Clone the Repository
git clone https://github.com/your-repository/expense-manager.git
cd expense-manager

Configure MySQL Database
Create a new database in MySQL:
CREATE DATABASE expense_manager;

Update application.properties file with your MySQL credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/expense_manager
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

Build and Run the Application

Access the Application
API endpoints will be available at http://localhost:8080
If a frontend is integrated, access the UI accordingly.
mvn clean install
mvn spring-boot:run

![image](https://github.com/user-attachments/assets/572b991c-b23d-4511-a1a0-4548202de1ca)
