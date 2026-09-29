
// class - class -> extends
// class - interface -> implements
// interface - interface -> extends
interface A {

    // public static final int age = 10;
    int age = 22;

    // public abstract void show();
    void show();

    void config();

}

interface X {

    void running();
}

interface Y extends X {

    void driving();
}

class B implements A, Y {

    @Override
    public void show() {
        System.out.println("in B");
    }

    @Override
    public void config() {
        System.out.println("in config B");
    }

    @Override
    public void running() {
        System.out.println("in run B");
    }

    @Override
    public void driving() {
        System.out.println("in driving B");
    }

}

public class Interface {

    public static void main(String[] args) {

        A obj = new B();
        X obj2 = new B();
        Y obj3 = new B();

        obj.show();
        obj.config();

        obj2.running();

        obj3.driving();
        obj3.running();

        // A.age =23;   // not possible as its static final
        System.out.println(A.age);

    }
}
