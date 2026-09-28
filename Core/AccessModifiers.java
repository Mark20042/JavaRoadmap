package Core;

import tools.Calc;
import tools.AdvCalc;

public class AccessModifiers {

    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(1, 2));
        System.out.println(c.sub(1, 2));
        System.out.println(c.mul(1, 2));
        System.out.println(c.div(1, 2));

        AdvCalc c2 = new AdvCalc();
        System.out.println(c2.add(1, 2));
        System.out.println(c2.sub(1, 2));
        System.out.println(c2.mul(1, 2));
        System.out.println(c2.div(1, 2));
        System.out.println(c2.mod(1, 2));
    }
}
