# Cinema app 

![Image of ticket](https://hansanglab.com/wp-content/uploads/2019/12/Bilet-v-kino-752x440.jpg)

The goal of this project is to create a ticket app for cinema with authentication system using Hibernate and Spring frameworks. You can add cinema hall, movies, movie sessions, users, add shopping cart and orders to users. 
In this project used N-tier architecture with:
* DB
* DAO layer
* Service layer
* Controllers layer

## Technologies used:
* Apache Tomcat (version 9.0.46)
* MySQL (version 8.0.24)
* Hibernate
* Spring MVC
* Spring Security
* Spring Core
* Maven
* Maven Checkstyle Plugin

## Setup:
1. To run the project on your computer, clone this project into your local folder and open the project in an IDE.
2. Install MySQL and MySQL Workbench. Set parameters of your MySQL server in 'db.properties':
    * URL to your database
    * Your Login to database
    * Your password to database
    * Hibernate configuration
3. Install and configure Local Tomcat Server.
4. Admin and user will be added by default in DataInitializer. 
   * User: user@gmail.com pass: 1234 
     Available: /register; Get: /cinema-halls, /movies, /movie-sessions/**, /orders, /shopping-carts; Post: /orders, /shopping-carts;
   * Admin: admin@gmail.com pass: 12345
     Available: /register; Get: /cinema-halls, /movies, /movie-sessions/**, /users/; Post: /cinema-halls, /movies, /movie-sessions/, /orders/, /shopping-carts; Put, Delete: /movie-sessions/;
     
