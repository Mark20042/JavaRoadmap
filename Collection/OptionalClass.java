
import java.util.ArrayList;
import java.util.Optional;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Student {

    private int age;
    private String name;
    private int marks;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", marks=" + marks + "]";
    }

}

public class OptionalClass {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Doe", "Jane", "Bob", "Alice");

        // String opt = names.stream().filter(n -> n
        //         .startsWith("X"))
        //         .findFirst()
        //         .orElse("Not found");
        // List<String> namesUpper;
        // namesUpper = names.stream()
        //         .map(s -> s.toUpperCase())
        //         .toList();
        // System.out.println(namesUpper);
        // namesUpper.forEach(n -> {
        //     System.out.println(n);
        // });
        List<Student> students = new ArrayList<>();

        // for (String name : names) {
        //     students.add(new Student(name));
        // }
        // students = names.stream()
        //         .map(s -> new Student(s))
        //         .toList();
        students = names.stream()
                .map(Student::new)
                .toList();

        System.err.println(students);

    }
}
