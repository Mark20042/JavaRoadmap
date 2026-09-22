class HumanActions {

    private String name;

    public HumanActions()
    {
        this.name = "ambot";
        System.out.println(name + " has entered the room.");
    }

    public HumanActions(String name)
    {
        this.name = name;
        System.out.println(name + " has entered the room.");
    }

    public String getName()
    {
        return name;
    }

    // public void setName(String name)
    // {
    //     this.name = name;
    // }

    public void walk(int distance)
    {
        System.out.println(name + " is walking " + distance + "kms");
    }
    
}


public class Constructor{

    public static void main (String[] args)
    {
        HumanActions h1 = new HumanActions("mark");
        HumanActions h2 = new HumanActions();
        
        System.out.println(h1.getName());
        h1.walk(10);
        
        System.out.println(h2.getName());
        h2.walk(20);

    }


}

