public class JaggedArrays 
{
    public static void main(String[] args)
    {

        int[][] nums = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[5];
        nums[2] = new int[3];


        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("using Normal for loop: ");
        System.out.println("------------------------");

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("using Enhanced for loop: ");
        System.out.println("------------------------");

        for (int n[]: nums)
        {
            for(int k: n)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        

    }
}