public class Task {

    private int taskId;
    private String title;
    private String description;
    private String subject;
    private String deadline;
    private String priority;
    private boolean completed;

    public Task(int taskId, String title, String description,
                String subject, String deadline, String priority) {

        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.subject = subject;
        this.deadline = deadline;
        this.priority = priority;
        this.completed = false;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSubject() {
        return subject;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }

    @Override
    public String toString() {

        String status;

        if (completed) {
            status = "Completed";
        } else {
            status = "Pending";
        }

        return "\nTask ID: " + taskId
                + "\nTitle: " + title
                + "\nDescription: " + description
                + "\nSubject: " + subject
                + "\nDeadline: " + deadline
                + "\nPriority: " + priority
                + "\nStatus: " + status;
    }
}
