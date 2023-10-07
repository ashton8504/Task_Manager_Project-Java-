# Task_Manager_Project-Java

markdown
Copy code
# Task Manager Project

## Project Overview

The Task Manager project is a Java application that allows users to manage tasks. It provides functionality for adding tasks, listing tasks, marking tasks as completed, and deleting tasks. This project is an excellent opportunity to practice core Java concepts, including data structures (e.g., ArrayList) and user interactions through a console interface.

## Getting Started

To get started with the Task Manager project, follow these steps:

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/your-username/task-manager.git
Open the project in your favorite Java IDE (e.g., Eclipse, IntelliJ IDEA) or a code editor.

Compile and run the TaskManagerApp.java file to start the application.

Project Structure
The project is organized as follows:


task-manager/
  ├── src/
  │    ├── TaskManagerApp.java
  │    ├── Task.java
  │    └── TaskManager.java
  └── README.md
  
TaskManagerApp.java: The main application class that contains the user interface and handles user interactions.
Task.java: A class representing a task with properties such as task name and completion status.
TaskManager.java: A class responsible for managing tasks, including adding, listing, marking as completed, and deleting tasks.
Project Tasks
To complete the Task Manager project, you should work on the following tasks:

Task 1: Create Task Class
In the Task.java file, create a Task class that represents a task. The class should have the following attributes:

name: The name of the task.
completed: A boolean indicating whether the task is completed.
Task 2: Implement TaskManager Class
In the TaskManager.java file, implement a TaskManager class that manages a list of tasks using an ArrayList. The class should provide methods for:

Adding tasks to the list.
Listing all tasks.
Marking tasks as completed.
Deleting tasks.
Task 3: Implement User Interface
In the TaskManagerApp.java file, implement the user interface for interacting with the Task Manager. Use the java.util.Scanner class to capture user input and provide options for adding, listing, marking as completed, and deleting tasks.

Task 4: Test the Application
Test the Task Manager application by adding tasks, listing tasks, marking tasks as completed, and deleting tasks. Ensure that the application functions as expected and handles user input gracefully.

Additional Notes
This project focuses on core Java concepts, including data structures (ArrayList), user input, conditional statements, and loops.
Feel free to enhance the project by adding features such as saving tasks to a file or implementing task priorities.
