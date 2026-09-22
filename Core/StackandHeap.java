

class Pen
{
    String brand;
    int price;

    Pen(String brand, int price)
    {
        this.brand = brand;
        this.price = price;
    }

    public String getMeAPen()
    {
        if(this.price >= 10)
        {
            return "Here is a pen.";
        }
        return "No pen for you!";
    }


}


public class StackandHeap {

    public static void main(String[] args) {

        int x = 10;
        Pen pen1 = new Pen("Cello", 5);
        Pen pen2 = new Pen("Reynolds", 20);

        System.out.println(x);
        System.out.println(pen1.brand);
        System.out.println(pen1.price);
        System.out.println(pen1.getMeAPen());

        System.out.println(pen2.brand);
        System.out.println(pen2.price);
        System.out.println(pen2.getMeAPen());


    }


}