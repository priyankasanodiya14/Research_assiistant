# Research_assiistant
The Research Assistant is a full-stack automation tool designed to simplify and speed up the research process. It allows users to extract, store, and manage research data efficiently using a backend service and a browser-based Chrome Extension.

The project focuses on reducing manual data entry, improving research workflow efficiency, and enabling quick access to saved research information.

# Features
--> Extract research data directly from web pages

--> Quick-save functionality for notes and references

--> REST APIs for storing and retrieving research data

--> Chrome Extension for seamless browser interaction

--> Dockerized backend and frontend for consistent deployment

--> Secure and reliable communication between extension and backend

# Tech Stack

Backend :  Java | Spring Boot | REST SPIs | Generative AI APIs | Docker

Frontend : JavaScript | Chrome Extension | HTML & CSS

Other Tools : Docker | Postman(API Testing) | Git

# Architecture

--> Chrome Extension captures and sends research data from web pages

--> Spring Boot Backend exposes REST APIs to process and store data

--> Database layer manages structured research information

--> Docker containers ensure consistent local and deployment environments

# Workflow

--> User selects content on a web page using the Chrome Extension

--> Extension sends extracted data to the backend API

--> Backend validates, processes, and stores the research data

--> Saved data can be retrieved and managed through APIs

# Key Implementations

--> Designed REST APIs for efficient data storage and 

--> Handled CORS configuration to enable secure communication between browser extension and backend

--> Implemented quick-save and auto-extraction features to minimize manual effort

--> Containerized backend and frontend using Docker for easy setup and 

--> Improved research productivity by automating repetitive tasks

# Prerequisites
--> Java 17+

--> Docker

--> Git

--> Chrome Browser

# Docker Image

Docker Hub Repository:
👉 https://hub.docker.com/r/Priyanka/Research_assiistant


▶️ Pull & Run the Image
docker pull Priyanka/Research_assiistant
docker run -p 8080:8080 Priyanka/Research_assiistant


# Run Backend (Using Docker)
docker build -t research-assiistant-backend .

docker run -p 8080:8080 research-assiistant-backend

# Load Chrome Extension

--> Open Chrome → chrome://extensions

--> Enable Developer Mode

--> Click Load unpacked

--> Select the Chrome Extension folder

# API Documentation

--> APIs are documented using standard REST conventions

--> Can be tested using Postman or similar tools

# Learning Outcomes

--> Hands-on experience with Spring Boot REST APIs

--> Chrome Extension development and browser APIs

--> Docker-based containerization

--> Solving real-world issues like CORS and cross-origin communication

--> Designing automation tools to improve productivity

# Future Enhancements

--> Authentication and user-specific research 

--> Advanced AI-based summarization of research content

--> Search and tagging functionality


# Author
Priyanka Sanodiya

Software Developer

📍 Mumbai, India

