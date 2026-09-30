
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Student {

    int age;
    String name;
    int marks;

    public Student(int age, String name, int marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", marks=" + marks + "]";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

}

public class StreamAPI {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John"));
        students.add(new Student("Doe"));
        students.add(new Student("Jane"));
        students.add(new Student("Bob"));

        // Create a stream from the list
        Stream<Student> stream = students.stream();

        // Filter students with age greater than 20
        Predicate<Student> predicate = s -> s.age > 20;

        stream.filter(predicate)
                .map(s -> s.marks)
                .reduce(0, (a, b) -> a + b);
        System.out.println(students);
    }
}
