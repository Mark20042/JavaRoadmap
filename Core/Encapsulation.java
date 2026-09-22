class Human {

    private int age;
    private String name;
    

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        this.age = a;
    }
    
    public String getName()
    {
        return name;
    }


    public void setName(String n)
    {
        this.name = n;
    }


}


public class Encapsulation{

    public static void main(String[] args) {
        
        Human h1 = new Human();

        h1.setAge(21);
        h1.setName("Mark");
        System.out.println("AGE:"+ h1.getAge());
        System.out.println("NAME:"+ h1.getName());
 
    }



}