import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Linda", 18), new Student("Cindy", 19), new Student("Mary", 19));
        Teacher teacher = new Teacher("Bob", students);
        teacher.addStudent(new Student("Ben", 19));
        teacher.addStudent(new Student("Solider", 20));
        Set<Integer> studentAges = teacher.getAgeToStudents().keySet();
        for (Integer studentAge : studentAges) {
            System.out.println(studentAge + "岁: " + teacher.getAgeToStudents().get(studentAge));
        }
    }

}