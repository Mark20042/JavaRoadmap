
class Human {

    String name;
    int age;

    // @Override
    // public String toString() {
    //     return "Human [name=" + name + ", age=" + age + "]";
    // }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Human other = (Human) obj;
        if (age != other.age) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

}

public class ClassequaltoString {

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.name = "John";
        h1.age = 20;

        Human h2 = new Human();
        h2.name = "John";
        h2.age = 21;

        System.out.println(h1.toString());
        System.out.println(h2.toString());

        // System.out.println(h1);
        // System.out.println(h2);
        if (h1.equals(h2)) {
            System.out.println("h1 and h2 are equal");
        } else {
            System.out.println("h1 and h2 are not equal");
        }

    }
}
