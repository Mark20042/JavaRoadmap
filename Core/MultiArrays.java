public class MultiArrays{
    public static void main (String[] args) {

        int[][] marks = new int[6][7];
        for(int i = 0; i < marks.length; i++)
        {
            for(int j = 0; j < marks[i].length; j++)
            {
                marks[i][j] = (int) (Math.random() * 10);
                // System.out.println(marks[i][j]);
            }
        }

        // System.out.println(marks[0][0]);
        // System.out.println(marks[0][1]);
        // System.out.println(marks[0][2]);
        // System.out.println(marks[1][0]);
        // System.out.println(marks[1][1]);
        // System.out.println(marks[1][2]);
        // System.out.println(marks[2][0]);
        // System.out.println(marks[2][1]);
        // System.out.println(marks[2][2]);

        System.out.println("using Normal for loop: ");
        System.out.println("------------------------");


        //normal for loop
        for(int i = 0; i < marks.length; i++)
        {
            for(int j = 0; j < marks[i].length; j++)
            {
                System.out.print(marks[i][j] +   " ");
            }
            System.out.println();
        }

        System.out.println("using Enhanced for loop: ");
        System.out.println("------------------------");


        //enhanced for loop
        for (int n[]: marks)
        {
            
            for(int k: n)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}