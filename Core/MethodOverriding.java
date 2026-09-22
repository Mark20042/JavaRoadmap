class Calculator 
{
    int add(int a, int b)
    {
        return a + b;
    }

    int add(int a, int b, int c)
    {
        return a + b + c;
    }

    float add(float a, float b)
    {
        return a + b;
    }
}

class CalculatorAdvanced extends Calculator
{
    @Override
    int add(int a, int b)
    {
        return a + b + 10;
    }
}
public class MethodOverriding {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("The sum of 2 numbers are: " + calculator.add(10, 20));
        System.out.println("The sum of 3 numbers are: " + calculator.add(10, 20, 30));
        System.out.println("The sum of 2 floats are: " + calculator.add(10.5f, 20.5f));

        CalculatorAdvanced calculatorAdvanced = new CalculatorAdvanced();
        System.out.println("The sum of 2 numbers added 10 are: " + calculatorAdvanced.add(10, 20));
    }
}