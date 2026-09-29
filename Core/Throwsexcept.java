
class A {

    public static void throwexp() throws ClassNotFoundException {
        Class.forName("Throwsexceptss");
    }
}

public class Throwsexcept {

    public static void main(String[] args) {

        try {
            A.throwexp();

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found" + e.toString());
        }

    }

}
