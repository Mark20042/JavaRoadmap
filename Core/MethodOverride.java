class Calc
{
    public int add(int a, int b)
    {
        return a+b;
    }

}

class AdvCalc extends Calc
{
    @Override
    public int add(int a, int b)
    {
        return a+b+1;
    }
}

public class MethodOverride {
    public static void main(String[] args)
    {
       Calc c2 = new Calc();
       int result2 = c2.add(10,20);
       System.out.println("Sum = " + result2);

       AdvCalc c1 = new AdvCalc();
       int result = c1.add(10,20);
       System.out.println("Sum = " + result);

      
    }
}