import java.util.ArrayList;

public class SubjectManager {

    private ArrayList<Subject> subjects = new ArrayList<>();

    public void addSubject(String id, String name) {

        Subject subject = new Subject(id, name);
        subjects.add(subject);

        System.out.println("\nSubject added successfully!");
    }

    public void viewSubjects() {

        if (subjects.isEmpty()) {
            System.out.println("\nNo subjects available.");
            return;
        }

        System.out.println("\n===== SUBJECTS =====");

        for (Subject subject : subjects) {
            System.out.println(subject);
        }
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
}
