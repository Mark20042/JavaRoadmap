class Teacher
{
     int id;
    String name;
    static String college;

    // calls only once
    static {
        System.out.println("Static Block");
        college = "Cebu Roosevelt Memorial Colleges";
    }

    public Teacher(){
        System.out.println("Constructor");
       
    }


    public static void MathSubject(Teacher obj)
    {
        System.out.println("Teacher " + obj.name + " is teaching Math"  + " in " + obj.college);
    }
    

}
public class Static{
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher();
        t1.name = "mark";
        t1.id = 1;
        // Teacher.college = "Cebu Roosevelt Memorial Colleges";

        Teacher t2 = new Teacher();
        t2.name = "John";
        t2.id = 2;
       

        Teacher.MathSubject(t1);
        Teacher.MathSubject(t2);
        

        
    }
}