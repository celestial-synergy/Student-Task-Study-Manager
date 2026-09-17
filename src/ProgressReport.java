import java.util.ArrayList;

public class ProgressReport {

    public static void generateReport(ArrayList<Task> tasks) {

        int totalTasks = tasks.size();
        int completedTasks = 0;

        for (Task task : tasks) {

            if (task.isCompleted()) {
                completedTasks++;
            }
        }

        int pendingTasks = totalTasks - completedTasks;

        double completionRate = 0;

        if (totalTasks > 0) {
            completionRate =
                    ((double) completedTasks / totalTasks) * 100;
        }

        System.out.println("\n===== PROGRESS REPORT =====");

        System.out.println("Total Tasks     : " + totalTasks);
        System.out.println("Completed Tasks : " + completedTasks);
        System.out.println("Pending Tasks   : " + pendingTasks);

        System.out.printf(
                "Completion Rate : %.2f%%%n",
                completionRate
        );
    }
}
