public class Calc
{

    void Add(int a, int b)
    {
        System.out.println("Sum = " + (a+b));
    }

    void Sub(int a, int b)
    {
        System.out.println("Diff = " + (a-b));
    }

    
}

public class AdvCalc extends Calc
{

    void Mul(int a, int b)
    {
        System.out.println("Product = " + (a*b));
    }
    
    void Div(int a, int b)
    {
        System.out.println("Divide = " + (a/b));
    }

}


public class VeryAdvCalc extends AdvCalc
{

    void Mod(int a, int b)
    {
        System.out.println("Modulo = " + (a%b));
    }

    void Pow(int a, int b)
    {
        System.out.println("Power = " + Math.pow(a, b));
    }

}

public class Inheritance {
    public static void main(String[] args)
    {
        VeryAdvCalc c1 = new VeryAdvCalc();
        c1.Add(10,2);
        c1.Sub(10,2);
        c1.Mul(10,2);
        c1.Div(10,2);
        c1.Mod(10,2);
        c1.Pow(10,2);
    }
}