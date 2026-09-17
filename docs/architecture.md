# System Architecture

The Student Task & Study Manager follows a simple layered structure.

## Architecture

```text
                USER
                  |
                  v
          +---------------+
          |     Main      |
          |  Menu / Input |
          +---------------+
                  |
        +---------+---------+
        |         |         |
        v         v         v
   Student     Subject     Task
   Manager     Manager    Manager
        |         |         |
        v         v         v
    Student    Subject     Task
                            |
                            v
                    Progress Report
                            |
                            v
                     File Manager
                            |
                            v
                       tasks.txt
```

## Main Components

### Main

Provides the menu-driven interface and accepts input from the user.

### StudentManager

Handles adding and viewing student information.

### SubjectManager

Handles adding and viewing subjects.

### TaskManager

Handles creating, viewing, completing and deleting tasks.

### ProgressReport

Calculates the total number of tasks, completed tasks, pending tasks and completion percentage.

### FileManager

Saves task information to a text file.

### Model Classes

`Student`, `Subject` and `Task` store the actual information used by the application.

## Data Flow

The user enters information through the main menu. The appropriate manager class processes the information and works with the corresponding model objects. Task information can then be processed by the progress report module or saved using the file manager.
