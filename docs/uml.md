# UML Design

## Use Case Diagram

### Actor

**Student**

### Main Use Cases

* Manage Student Information
* Manage Subjects
* Add Tasks
* View Tasks
* Mark Tasks as Completed
* Delete Tasks
* View Progress Report
* Save Tasks

### Use Case Flow

```text
                    +-----------------------------+
                    | Student Task & Study        |
                    | Manager                     |
                    |                             |
Student ---------->| Add/View Student            |
Student ---------->| Add/View Subjects           |
Student ---------->| Add Tasks                   |
Student ---------->| View Tasks                  |
Student ---------->| Complete Tasks              |
Student ---------->| Delete Tasks                |
Student ---------->| View Progress Report        |
Student ---------->| Save Tasks                  |
                    +-----------------------------+
```

## Class Diagram

```text
+----------------------+
|       Student        |
+----------------------+
| - studentId         |
| - name              |
| - email             |
+----------------------+
| + getStudentId()    |
| + getName()         |
| + getEmail()        |
| + setName()         |
| + setEmail()        |
| + toString()        |
+----------------------+

+----------------------+
|       Subject        |
+----------------------+
| - subjectId         |
| - subjectName       |
+----------------------+
| + getSubjectId()    |
| + getSubjectName()  |
| + toString()        |
+----------------------+

+----------------------+
|        Task          |
+----------------------+
| - taskId            |
| - title              |
| - description        |
| - subject            |
| - deadline           |
| - priority           |
| - completed          |
+----------------------+
| + markCompleted()   |
| + isCompleted()     |
| + toString()        |
+----------------------+

+----------------------+
|    StudentManager    |
+----------------------+
| - student            |
+----------------------+
| + addStudent()       |
| + viewStudent()      |
+----------------------+

+----------------------+
|    SubjectManager    |
+----------------------+
| - subjects           |
+----------------------+
| + addSubject()       |
| + viewSubjects()     |
+----------------------+

+----------------------+
|     TaskManager      |
+----------------------+
| - tasks              |
| - nextTaskId         |
+----------------------+
| + addTask()          |
| + viewAllTasks()     |
| + viewPendingTasks() |
| + viewCompletedTasks()|
| + markTaskCompleted()|
| + deleteTask()       |
+----------------------+

+----------------------+
|   ProgressReport     |
+----------------------+
| + generateReport()   |
+----------------------+

+----------------------+
|    FileManager       |
+----------------------+
| + saveTasks()        |
+----------------------+

+--------------------------+
| InvalidTaskException     |
+--------------------------+
| + InvalidTaskException() |
+--------------------------+
```

## Class Relationships

* `StudentManager` manages a `Student` object.
* `SubjectManager` manages multiple `Subject` objects using `ArrayList`.
* `TaskManager` manages multiple `Task` objects using `ArrayList`.
* `ProgressReport` receives the task list from `TaskManager`.
* `FileManager` receives the task list and stores task information in a file.
* `InvalidTaskException` is used by `TaskManager` to report invalid task input.
