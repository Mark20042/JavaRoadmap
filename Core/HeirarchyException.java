
public class HeirarchyException {

    public static void main(String[] args) {

        System.out.println("Hello World");

        int[] nums = new int[5];

        try {
            System.out.println(nums[10]);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You are out of bounds");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }
}
