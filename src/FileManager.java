import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileManager {

    public static void saveTasks(ArrayList<Task> tasks) {

        try {

            File folder = new File("data");

            if (!folder.exists()) {
                folder.mkdir();
            }

            FileWriter fileWriter =
                    new FileWriter("data/tasks.txt");

            PrintWriter writer =
                    new PrintWriter(fileWriter);

            for (Task task : tasks) {

                writer.println(
                        task.getTaskId() + "|" +
                        task.getTitle() + "|" +
                        task.getDescription() + "|" +
                        task.getSubject() + "|" +
                        task.getDeadline() + "|" +
                        task.getPriority() + "|" +
                        task.isCompleted()
                );
            }

            writer.close();

            System.out.println("\nTasks saved successfully!");

        } catch (IOException e) {

            System.out.println(
                    "\nError while saving tasks."
            );
        }
    }
}
