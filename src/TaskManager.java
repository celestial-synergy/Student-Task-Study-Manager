import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<>();
    private int nextTaskId = 1;

    public void addTask(String title,
                         String description,
                         String subject,
                         String deadline,
                         String priority)
            throws InvalidTaskException {

        if (title == null || title.trim().isEmpty()) {
            throw new InvalidTaskException(
                    "Task title cannot be empty."
            );
        }

        if (deadline == null || deadline.trim().isEmpty()) {
            throw new InvalidTaskException(
                    "Deadline cannot be empty."
            );
        }

        if (!priority.equalsIgnoreCase("Low")
                && !priority.equalsIgnoreCase("Medium")
                && !priority.equalsIgnoreCase("High")) {

            throw new InvalidTaskException(
                    "Priority must be Low, Medium, or High."
            );
        }

        Task task = new Task(
                nextTaskId,
                title,
                description,
                subject,
                deadline,
                priority
        );

        tasks.add(task);
        nextTaskId++;

        System.out.println("\nTask added successfully!");
    }

    public void viewAllTasks() {

        if (tasks.isEmpty()) {
            System.out.println("\nNo tasks available.");
            return;
        }

        System.out.println("\n===== ALL TASKS =====");

        for (Task task : tasks) {
            System.out.println(task);
            System.out.println("----------------------");
        }
    }

    public void viewPendingTasks() {

        boolean found = false;

        System.out.println("\n===== PENDING TASKS =====");

        for (Task task : tasks) {

            if (!task.isCompleted()) {
                System.out.println(task);
                System.out.println("----------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No pending tasks.");
        }
    }

    public void viewCompletedTasks() {

        boolean found = false;

        System.out.println("\n===== COMPLETED TASKS =====");

        for (Task task : tasks) {

            if (task.isCompleted()) {
                System.out.println(task);
                System.out.println("----------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No completed tasks.");
        }
    }

    public void markTaskCompleted(int taskId) {

        for (Task task : tasks) {

            if (task.getTaskId() == taskId) {

                task.markCompleted();

                System.out.println(
                        "\nTask marked as completed!"
                );

                return;
            }
        }

        System.out.println("\nTask not found.");
    }

    public void deleteTask(int taskId) {

        boolean removed = tasks.removeIf(
                task -> task.getTaskId() == taskId
        );

        if (removed) {
            System.out.println(
                    "\nTask deleted successfully!"
            );
        } else {
            System.out.println("\nTask not found.");
        }
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
