import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentManager studentManager = new StudentManager();
        SubjectManager subjectManager = new SubjectManager();
        TaskManager taskManager = new TaskManager();

        int choice = 0;

        do {

            System.out.println("\n====================================");
            System.out.println("     STUDENT TASK & STUDY MANAGER");
            System.out.println("====================================");

            System.out.println("1. Student Management");
            System.out.println("2. Subject Management");
            System.out.println("3. Add Task");
            System.out.println("4. View All Tasks");
            System.out.println("5. View Pending Tasks");
            System.out.println("6. View Completed Tasks");
            System.out.println("7. Mark Task as Completed");
            System.out.println("8. Delete Task");
            System.out.println("9. Progress Report");
            System.out.println("10. Save Tasks");
            System.out.println("11. Exit");

            System.out.print("\nEnter your choice: ");

            try {

                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:

                        System.out.println("\n===== STUDENT MANAGEMENT =====");
                        System.out.println("1. Add Student");
                        System.out.println("2. View Student");
                        System.out.print("Enter choice: ");

                        int studentChoice =
                                Integer.parseInt(scanner.nextLine());

                        if (studentChoice == 1) {

                            System.out.print("Enter Student ID: ");
                            String id = scanner.nextLine();

                            System.out.print("Enter Student Name: ");
                            String name = scanner.nextLine();

                            System.out.print("Enter Email: ");
                            String email = scanner.nextLine();

                            studentManager.addStudent(
                                    id, name, email
                            );

                        } else if (studentChoice == 2) {

                            studentManager.viewStudent();

                        } else {

                            System.out.println("Invalid choice.");
                        }

                        break;


                    case 2:

                        System.out.println("\n===== SUBJECT MANAGEMENT =====");
                        System.out.println("1. Add Subject");
                        System.out.println("2. View Subjects");
                        System.out.print("Enter choice: ");

                        int subjectChoice =
                                Integer.parseInt(scanner.nextLine());

                        if (subjectChoice == 1) {

                            System.out.print("Enter Subject ID: ");
                            String subjectId = scanner.nextLine();

                            System.out.print("Enter Subject Name: ");
                            String subjectName = scanner.nextLine();

                            subjectManager.addSubject(
                                    subjectId, subjectName
                            );

                        } else if (subjectChoice == 2) {

                            subjectManager.viewSubjects();

                        } else {

                            System.out.println("Invalid choice.");
                        }

                        break;


                    case 3:

                        System.out.print("Enter Task Title: ");
                        String title = scanner.nextLine();

                        System.out.print("Enter Description: ");
                        String description = scanner.nextLine();

                        System.out.print("Enter Subject: ");
                        String subject = scanner.nextLine();

                        System.out.print("Enter Deadline: ");
                        String deadline = scanner.nextLine();

                        System.out.print(
                                "Enter Priority (Low/Medium/High): "
                        );
                        String priority = scanner.nextLine();

                        try {

                            taskManager.addTask(
                                    title,
                                    description,
                                    subject,
                                    deadline,
                                    priority
                            );

                        } catch (InvalidTaskException e) {

                            System.out.println(
                                    "Error: " + e.getMessage()
                            );
                        }

                        break;


                    case 4:

                        taskManager.viewAllTasks();

                        break;


                    case 5:

                        taskManager.viewPendingTasks();

                        break;


                    case 6:

                        taskManager.viewCompletedTasks();

                        break;


                    case 7:

                        System.out.print("Enter Task ID: ");

                        int completeId =
                                Integer.parseInt(scanner.nextLine());

                        taskManager.markTaskCompleted(
                                completeId
                        );

                        break;


                    case 8:

                        System.out.print("Enter Task ID: ");

                        int deleteId =
                                Integer.parseInt(scanner.nextLine());

                        taskManager.deleteTask(
                                deleteId
                        );

                        break;


                    case 9:

                        ProgressReport.generateReport(
                                taskManager.getTasks()
                        );

                        break;


                    case 10:

                        FileManager.saveTasks(
                                taskManager.getTasks()
                        );

                        break;


                    case 11:

                        System.out.println(
                                "\nThank you for using the Student Task & Study Manager!"
                        );

                        break;


                    default:

                        System.out.println(
                                "\nInvalid choice. Please try again."
                        );
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "\nPlease enter a valid number."
                );
            }

        } while (choice != 11);

        scanner.close();
    }
}
