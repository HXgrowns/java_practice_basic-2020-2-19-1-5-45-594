import java.util.*;

public class Teacher {
    private String name;
    private Map<Integer, List<Student>> ageToStudents;

    public Teacher(String name, List<Student> students) {
        this.name = name;
        this.ageToStudents = new HashMap<>();
        for (Student student : students) {
            if (student != null) {
                List<Student> peerStudents = this.ageToStudents.getOrDefault(student.getAge(), new ArrayList<>());
                peerStudents.add(student);
                this.ageToStudents.put(student.getAge(), peerStudents);
            }
        }
    }

    public void addStudent(Student student) {
        if (student != null) {
            List<Student> students = this.ageToStudents.getOrDefault(student.getAge(), new ArrayList<>());
            students.add(student);
            this.ageToStudents.put(student.getAge(), students);
        }
    }

    public Map<Integer, List<Student>> getAgeToStudents() {
        return ageToStudents;
    }
}
