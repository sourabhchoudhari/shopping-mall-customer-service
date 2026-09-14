# Shopping Mall Management System – Customer Service Module

A Spring Boot-based Customer Service Module developed for a Shopping Mall Management System.

## Features

- Search Items
- Order Items
- Search Mall
- Cancel Orders
- Customer Login
- Customer Logout

## Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- H2 Database
- Gradle
- REST API
- Postman

## Architecture

Controller → Service Layer → Repository → Database

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/customer/items?name=phone` | Search items |
| POST | `/customer/order` | Order an item |
| GET | `/customer/mall/{id}` | Search mall |
| DELETE | `/customer/order/{id}` | Cancel an order |
| POST | `/customer/login` | Customer login |
| POST | `/customer/logout` | Customer logout |

## How to Run

Clone the repository and open it in Visual Studio Code.

Run the application using:

```powershell
.\gradlew.bat bootRun

## Author

**Sourabh Choudhari**
