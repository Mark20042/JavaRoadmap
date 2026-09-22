

class Students {

    int studentID;
    String name;
    int subjects;
    int remarks;


    Students(int studentID, String name, int subjects, int remarks)
    {
        this.studentID = studentID;
        this.name = name;
        this.subjects = subjects;
        this.remarks = remarks;
    }
      

    void displayStudentInfo()
    {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Subjects: " + subjects);
        System.out.println("Remarks: " + remarks(remarks));
    }


    int remarks(int remarks)
    {
        return remarks;
    }


}


class AdvancedRemarks extends Students
{
    AdvancedRemarks(int studentID, String name, int subjects, int remarks) {
        super(studentID, name, subjects, remarks);
    }

    @Override
    int remarks(int remarks)
    {
        return remarks + 10;
    }
    
}




public class ArrayOfObj

{

    public static void main(String[] args)
    {

        Students s1 = new Students(1, "Rohan",  5, 90);
        Students s2 = new Students(2, "Mohit", 5, 85);
        Students s3 = new Students(3, "Sohan", 5, 80);
        Students s4 = new Students(4, "Gohan", 5, 75);
        Students s5 = new Students(5, "Johan", 5, 70);
        Students s6 = new AdvancedRemarks(6, "Aryan", 5, 90);

    
        Students[] classRoom = {s1, s2, s3, s4, s5, s6};

        for(Students s: classRoom)
        {
            s.displayStudentInfo();
            System.out.println("------------------------");

        }

       



    }
}