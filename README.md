# S04T01N02 - Spring Boot with Gradle

## Overview

This project is a simple Spring Boot REST API built using **Gradle** as the build and dependency management tool. It demonstrates basic Spring Boot functionality with two GET endpoints that greet the user.

---

## Project Setup

- **Build tool:** Gradle  
- **Language:** Java  
- **Spring Boot version:** Latest stable  
- **Java version:** 24 (minimum 11)  
- **Packaging:** Jar  
- **Group:** `cat.itacademy.s04.t01.n02`  
- **Artifact:** `S04T01N02`  
- **Package name:** `cat.itacademy.s04.t01.n02`

---

## Dependencies

- Spring Boot DevTools  
- Spring Web  

---

## Running the Project

1. Clone or download this repository.  
2. Import the project into your IDE as an **Existing Gradle Project**.  
3. Configure the server port by editing `src/main/resources/application.properties`: server.port=9001
4. Run the application using the Gradle wrapper from the terminal:
    ```bash
   ./gradlew bootRun   # Linux/macOS
    gradlew.bat bootRun # Windows

---

## API Endpoints

GET /HelloWorld?nom=yourname
    Returns:

    Hola, yourname. Estàs executant un projecte Gradle

    The nom parameter is optional and defaults to "UNKNOWN".

GET /HelloWorld2/{nom}
    Returns:

    Hola, yourname. Estàs executant un projecte Gradle

    The nom path variable is optional and defaults to "UNKNOWN" if not provided.

---

## Gradle Commands Cheat Sheet

- Compile the project:
    ```bash
    ./gradlew build

- Package the project:
    ```bash
    ./gradlew assemble

- Clean the project:
    ```bash
    ./gradlew clean

- Run the application:
    ```bash
    ./gradlew bootRun
