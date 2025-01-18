# Employee Management System

A Spring Boot application providing a robust API for managing employee data with complete CRUD operations and additional features like salary calculations and department management.

## Technologies Used

### Backend
- Java 11
- Spring Boot 2.7.3
- Spring Data JPA
- MySQL Database
- Maven
- Hibernate

### Frontend
- JSP (JavaServer Pages)
- HTML/CSS
- Bootstrap

## Features
- Complete Employee Management
  - Add new employees
  - View employee details
  - Update employee information
  - Delete employee records
- Department Management
- MVC Architecture Implementation
- Data Persistence with MySQL
- User-friendly Web Interface

## Project Structure
src/ ├── main/ │ 
       ├── java/ │ 
        │ └── com.example.employee/ │ 
           │ ├── controller/ │ 
               │ │ └── EmployeeController.java │
          │ ├── model/ │ 
               │ │ └── Employee.java │ 
          │ ├── repository/ │ 
               │ │ └── EmployeeRepository.java │ 
          │ └── service/ │ 
                 │ └── EmployeeService.java │
          ├── resources/ │ 
                 │ └── application.properties 

## Database Schema
sql CREATE TABLE employee ( id BIGINT PRIMARY KEY AUTOINCREMENT, firstname VARCHAR(255), last_name VARCHAR(255), email VARCHAR(255), department VARCHAR(255), salary DOUBLE );

## Installation & Setup

### Prerequisites
- JDK 11 or higher
- Maven 3.6.x or higher
- MySQL 8.0 or higher

### Steps
1. Clone the repository
bash git clone https://github.com/bhavikalalwani01/Employee-Management-System.git

2. Configure MySQL
properties

application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb spring.datasource.username=yourusername spring.datasource.password=your_password

3. Build the project
bash mvn clean install

4. Run the application
bash mvn spring-boot:run

## Usage
After starting the application:
1. Access the application at `http://localhost:8080`
2. Navigate through the web interface to:
   - View all employees
   - Add new employee
   - Update employee details
   - Delete employee records

## Key Functionalities

### Employee Management
- Create new employee records with details:
  - First Name
  - Last Name
  - Email
  - Department
  - Salary

### View Operations
- List all employees
- View individual employee details
- Department-wise employee view

### Update Operations
- Modify employee information
- Update salary details
- Change department assignments

### Delete Operations
- Remove employee records
- Soft delete implementation

## Application Screenshots

[You can add screenshots of your application here]

## Configuration

### Application Properties
properties

Server Configuration
server.port=8080

Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db spring.datasource.username=root spring.datasource.password=root

Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update spring.jpa.show-sql=true

View Resolver Configuration
spring.mvc.view.prefix=/WEB-INF/views/ spring.mvc.view.suffix=.jsp

## Code Examples

### Adding a New Employee
java @PostMapping("/saveEmployee") public String saveEmployee(@ModelAttribute("employee") Employee employee) { employeeService.saveEmployee(employee); return "redirect:/"; } ```

Error Handling
Custom error pages
Form validation
Database error handling
Security Considerations
Input validation
XSS prevention
CSRF protection
Future Enhancements
Implementation of user authentication
Advanced search functionality 3
