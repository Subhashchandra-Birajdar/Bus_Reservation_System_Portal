# Bus Reservation System Portal

- This repository contains a REST API developed for an bus reservation application. 
- Exception Handling, pagination, session handling and many more features
- The API supports fundamental CRUD operations required by any bus reservation platform, with user authentication and validation at every step.

## Tech Stack
- **Java**
- **Spring Framework**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL Postgresql**

## Modules

- **Login & Logout Module**
- **User Module**
- **Admin Module**
- **LoginAdmin Module and LoginUser Module**
- **Route Module**
- **Reservation Module**
- **FeedBack Module**
- **Bus Module**

## Features

### General Features
- **Authentication & Validation**: 
  - Admins and users are authenticated using session tokens. Admins have an additional layer of authentication for management tasks. Sessions are valid for 1 hour to ensure secure interactions.

### Admin Features
- **Administrative Control**: Admins have comprehensive control over the application, including the ability to manage routes, buses, users, and reservations.
- **Route Management**: Admins can create, update, view, and delete routes in the system.
- **Bus Management**: Admins can add, update, view, and remove bus entries.
- **User Management**: Admins can register, update, view, and delete user accounts.
- **Feedback Management**: Admins can view and update feedback provided by users.

### User Features
- **Registration and Login**: Users can register on the application and log in to receive a session token. They can also update their details or delete their accounts.
- **Route Browsing**: Users can view available routes and their details.
- **Bus Browsing**: Users can view details of different buses, including bus type, route, and availability.
- **Reservation Management**: Users can make new reservations, update existing ones, and view reservation details.
- **Feedback Submission**: Users can provide feedback on bus services, including ratings and comments.
- **Personalized Access**: Logged-in users can access their reservations, view their booking history, and manage their feedback.

### Administrative Features
- **Session Management**: Admins can log in and log out of the system, maintaining the security and integrity of their administrative sessions.
- **View All Routes & Buses**: Admins can view a list of all routes and buses in the system.
- **Route and Bus Details**: Admins can access specific details for individual routes and buses by their IDs.

### Customer Features
- **Browse Routes & Buses**: Customers can browse through available routes and buses, including their schedules and fares.
- **Make and Manage Reservations**: Customers can make reservations, view reservation details, and manage their bookings.
- **Provide Feedback**: Customers can rate bus services and leave comments to help improve the service.

### Security Features
- **Session Tokens**: Both admins and users utilize session tokens for authentication and session management, ensuring secure and controlled access to the application.
- **Data Validation**: Input data is validated to prevent unauthorized actions and ensure data integrity throughout the application.

## Installation & Run

1. **Base Url**:
   - http://localhost:8080

## API Module Endpoints

### Admin Module

* `POST /admin` : Register a new admin
* `POST /loginadmin` : Login admin with username and password
* `POST /logoutadmin/{key}` : Logout admin using session key

### Route Module

* `GET /route/viewAll` : Get all routes
* `POST /route/save/{key}` : Create a new route
* `GET /route/find/{routeId}` : Get route by ID
* `PUT /route/update/{key}` : Update a route
* `DELETE /route/delet/{routeId}/{key}` : Delete a route by ID

### Bus Module

* `POST /save/{key}` : Create a new bus
* `GET /find/{busId}` : Get bus by ID
* `PUT /update/{key}` : Update a bus
* `DELETE /delet/{busId}/{key}` : Delete a bus by ID
* `GET /buses/{busType}` : Get buses by type
* `GET /buses` : Get all buses

### Feedback Module

* `POST /feedback/save/{busid}/{key}` : Create feedback for a bus
* `GET /feedback/viewAll` : Get all feedback
* `GET /feedback/find/{feedbackId}` : Get feedback by ID
* `PUT /feedback/update/{key}` : Update feedback

### User Module

* `POST /users` : Register a new user
* `PUT /users/{key}` : Update user details
* `DELETE /users/{id}/{key}` : Delete a user
* `GET /users/{id}/{key}` : View user by ID
* `GET /users?key={key}` : View all users

* `POST /loginuser` : Login user with username and password
* `POST /logoutuser/{key}` : Logout user using session key

### Reservation Module

* `POST /Reservation/{key}` : Add a new reservation
* `PUT /Reservation/{key}` : Update an existing reservation
* `DELETE /Reservation/{reservationId}/{key}` : Delete a reservation
* `GET /Reservation/{reservationId}/{key}` : View a reservation by ID

## Sample API Response for Admin Login

`POST http://localhost:8080/loginadmin`
* Request Body

```
{
    "username": "adminUser",
    "password": "securePassword123"
}
```
* Response

```
    currentUserSession [userId=2, uuid=xXe9dg, localDateTime=2024-08-01T11:15:16.809366200] -- use this sessin uuid for logout
    { 
    "message": "Login successful"
    } 
```

### Sample API Response for admin Logout
`[POST http://localhost:8080/logoutadmin/someSessionKey`
* Response
```
    Logged Out !
{
    "message": "Logout successful"
}
```
### Sample API Response for user Login
`POST http://localhost:8080/loginuser`
* Request Body

```
    {
    "username": "user1",
    "password": "password123"
    }
```

* Response
```
    currentUserSession [userId=2, uuid=xXe9dg, localDateTime=2024-08-01T11:15:16.809366200]  -- use this sessin uuid for logout
   {
    "message": "Login successful"
    } 
```

### Sample API Response for user Logout
`[POST http://localhost:8080/logoutuser/someSessionKey`
* Response
```
    Logged Out !

{
    "message": "Logout successful"
}
```   
