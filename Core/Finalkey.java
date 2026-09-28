
class Calc {

    final public void show() {
        System.out.println("in Calc class");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

}

class AdvCalc extends Calc {

    // final method cannot be overridden
    // public void show() {
    // System.out.println("in AdvCalc class");
    // }
    @Override
    public void add(int a, int b) {
        System.out.println(a + b + 10);
    }

}

public class Finalkey {

    public static void main(String[] args) {

        final int a = 10;
        // a = 15; // error because final keyword prevent to change the value

        System.out.println(a);

        Calc c = new Calc();
        c.show();
        c.add(10, 20);

        AdvCalc ac = new AdvCalc();
        ac.show();
        ac.add(10, 20);

    }

}
