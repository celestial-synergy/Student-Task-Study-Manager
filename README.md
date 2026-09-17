# Student Task & Study Manager

A simple Java-based console application that helps students manage their academic tasks, subjects, deadlines and progress.

## About the Project

Managing assignments and study tasks can become difficult when there are multiple subjects and deadlines. This project provides a simple menu-driven system where students can add their tasks, set priorities and deadlines, mark completed work and check their overall progress.

The project was developed as part of the Programming in Java course to apply basic and intermediate Java programming concepts in a practical application.

## Features

* Student information management
* Subject management
* Add and manage academic tasks
* Task deadlines and priorities
* View all tasks
* View pending tasks
* View completed tasks
* Mark tasks as completed
* Delete tasks
* Progress report with completion percentage
* Save task information using file handling
* Input validation and exception handling

## Technologies Used

* Java
* Object-Oriented Programming
* ArrayList
* Exception Handling
* File Handling
* Git & GitHub

## Project Structure

```text
Student-Task-Study-Manager/
│
├── README.md
├── statement.md
│
├── data/
│   └── tasks.txt
│
└── src/
    ├── Main.java
    ├── Student.java
    ├── Subject.java
    ├── Task.java
    ├── InvalidTaskException.java
    ├── StudentManager.java
    ├── SubjectManager.java
    ├── TaskManager.java
    ├── ProgressReport.java
    └── FileManager.java
```

## Java Concepts Used

### Classes and Objects

Different classes are used to represent students, subjects and tasks.

### Encapsulation

Class variables are kept private and accessed through methods such as getters and setters.

### ArrayList

ArrayList is used to store and manage multiple subjects and tasks.

### Exception Handling

Custom exception handling is used to handle invalid task information such as an empty title or invalid priority.

### File Handling

Task information can be saved to a text file for storage.

### Methods

The application is divided into different methods and manager classes so that each part has a specific purpose.

## How the Application Works

1. The user starts the application.
2. A menu with different options is displayed.
3. The user can add student and subject information.
4. Tasks can be added with a description, subject, deadline and priority.
5. Tasks can be viewed, completed or deleted.
6. The progress report shows the number of completed and pending tasks.
7. Task information can be saved using the file storage option.

## Non-Functional Requirements

* **Usability:** The application uses a simple menu-driven interface.
* **Performance:** Tasks and subjects are stored using ArrayList for efficient basic operations.
* **Reliability:** Invalid inputs are handled using validation and exception handling.
* **Maintainability:** Different features are separated into different classes.
* **Resource Efficiency:** The application is lightweight and runs as a console-based program.

## Future Enhancements

* Add automatic deadline reminders
* Add a graphical user interface
* Add login functionality
* Store data using a database
* Add subject-wise progress charts
* Add automatic sorting of tasks based on priority or deadline

## Author

Programming in Java Project

