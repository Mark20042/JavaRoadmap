
class A {

    public void show() {
        System.out.println("in A");
    }

}

public class AnonymInnerclass {

    public static void main(String[] args) {

        A obj = new A() {
            @Override
            public void show() {
                System.out.println("in new A");
            }
        };

        obj.show();
    }
}
