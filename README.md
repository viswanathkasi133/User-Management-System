# User Management System

## Overview
The **User Management System** is a web application designed to manage users efficiently. This project includes features such as adding, editing, deleting, and viewing user details. The backend is built using Spring Boot, and the frontend uses HTML, CSS, and JavaScript. Data is stored in a MySQL database.

## Features
- **Add New Users**: Create new user profiles with details like name, email, role, and status.
- **Edit User Details**: Update existing user information seamlessly.
- **Delete Users**: Remove users from the system.
- **View User List**: Display all users with their respective details.
- **Dropdown for Role and Status**: Role (User, Admin, Other) and Status (Active, Inactive) options.

## Tech Stack
### Frontend
- **HTML**
- **CSS**
- **JavaScript**

### Backend
- **Spring Boot**
- **Spring Data JPA**

### Database
- **MySQL**

### Tools
- **MySQL Workbench**
- **Spring Tool Suite (STS4)**

## Project Structure
### Backend
- **Controllers**: Handles API requests.
- **Services**: Business logic implementation.
- **Repositories**: Interacts with the database.
- **Entity**: Entity classes for the database.

### Frontend
- **HTML and CSS**: For user interface.
- **JavaScript**: For client-side interactions and API calls.

## Endpoints
### User API
1. **Get All Users**: `GET /api/users`
2. **Get User by ID**: `GET /api/users/{id}`
3. **Add New User**: `POST /api/users`
4. **Update User**: `PUT /api/users/{id}`
5. **Delete User**: `DELETE /api/users/{id}`

## Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/user-management.git
