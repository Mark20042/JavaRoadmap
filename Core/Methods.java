class Computer 

{
    String brand;
    String model;
    int year;

    void ComputerSpecs(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displaySpecs()
    {
        System.out.println("The Computer Specs are: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("------------------------");
    }

    void powerOn()
    {
        System.out.println("Computer is turning on.");
    }

    void powerOff()
    {
        System.out.println("Computer is turning off.");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
        {
            return "Here is a pen.";
        }
        return "No pen for you!";
    }
}

public class Methods {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.ComputerSpecs("Dell", "XPS 15", 2024);
        computer.displaySpecs();
        computer.powerOn();
        computer.powerOff();


        System.out.println(computer.getMeAPen(15));    
        System.out.println(computer.getMeAPen(5));
    
    }
}