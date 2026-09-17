public class StudentManager {

    private Student student;

    public void addStudent(String id, String name, String email) {

        student = new Student(id, name, email);

        System.out.println("\nStudent added successfully!");
    }

    public void viewStudent() {

        if (student == null) {
            System.out.println("\nNo student information available.");
        } else {
            System.out.println("\n===== STUDENT DETAILS =====");
            System.out.println(student);
        }
    }

    public Student getStudent() {
        return student;
    }
}
