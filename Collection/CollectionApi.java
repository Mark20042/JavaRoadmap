
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {

    int age;
    String name;
    int marks;

    public Student(String name) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", marks=" + marks + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age < that.age) {
            return 1;
        } else if (this.age > that.age) {
            return -1;
        } else {
            return 0;
        }
    }

}

public class CollectionApi {

    public static void main(String[] args) {
        // Collection<Integer> nums = new TreeSet<Integer>();
        // nums.add(4);
        // nums.add(6);
        // nums.add(3);
        // nums.add(9);
        // Iterator<Integer> it = nums.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
        // // Collections.sort(nums);
        // // Comparator<Integer> com = new Comparator<Integer>() {
        // //     @Override
        // //     public int compare(Integer a, Integer b) {
        // //         return a - b;
        // //     }
        // // };
        // // Collections.sort(nums, com);
        // for (Integer n : nums) {
        //     System.out.println(n);
        // }

        // Map<String, Integer> students = new HashMap<>();
        // students.put("John", 20);
        // students.put("Doe", 30);
        // students.put("Jane", 25);
        // students.put("Bob", 28);
        // students.put("John", 20);
        // System.out.println(students.get("John"));
        // System.out.println(students.keySet());
        // for (String key : students.keySet()) {
        //     System.out.println(key + " - " + students.get(key));
        // }
        // students.forEach((key, value) -> {
        //     System.out.println(key + " " + value);
        // });
        // Comparator<Integer> com = new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer a, Integer b) {
        //         if (a % 10 > b % 10) {
        //             return 1;
        //         } else if (a % 10 < b % 10) {
        //             return -1;
        //         } else {
        //             return a - b;
        //         }
        //     }
        // };
        // List<Integer> list = new ArrayList<>();
        // list.add(43);
        // list.add(81);
        // list.add(95);
        // list.add(45);
        // list.add(16);
        // list.add(22);
        // Collections.sort(list, com);
        // list.forEach(n -> {
        //     System.out.println(n);
        // });
        List<Student> students = new ArrayList<>();
        students.add(new Student("John"));
        students.add(new Student("Doe"));
        students.add(new Student("Jane"));
        students.add(new Student("Bob"));

        Collections.sort(students);

        students.forEach(n -> {
            System.out.println(n);
        });

    }
}
