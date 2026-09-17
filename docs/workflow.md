# Application Workflow

```text
START
  |
  v
Display Main Menu
  |
  v
Select an Option
  |
  +----> Student Management
  |          |
  |          +--> Add Student
  |          |
  |          +--> View Student
  |
  +----> Subject Management
  |          |
  |          +--> Add Subject
  |          |
  |          +--> View Subjects
  |
  +----> Task Management
  |          |
  |          +--> Add Task
  |          |
  |          +--> View Tasks
  |          |
  |          +--> Complete Task
  |          |
  |          +--> Delete Task
  |
  +----> Progress Report
  |          |
  |          +--> Calculate Progress
  |
  +----> Save Tasks
  |          |
  |          +--> Save to File
  |
  +----> Exit
             |
             v
            END
```

## Basic Task Workflow

```text
Enter Task Details
        |
        v
Validate Input
        |
   +----+----+
   |         |
 Valid     Invalid
   |         |
   v         v
Create     Show Error
Task
   |
   v
Add to Task List
   |
   v
View / Complete / Delete
   |
   v
Generate Progress Report
```
