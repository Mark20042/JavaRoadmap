
class MarkException extends Exception {

    MarkException(String msg) {
        super(msg);
    }
}

public class Throwexcep {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        int nums[] = new int[5];
        // String s = null;

        try {
            if (i == 0) {
                throw new MarkException("I dont want to give zero");
            }
            j = 18 / i;
            // System.out.println(s.length());
            System.out.println(nums[10]);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You are out of bounds");
        } catch (Exception e) {
            System.out.println("Something went wrong " + e.getMessage());
        } finally {
            System.out.println("Bye");
        }

        System.out.println(j);
    }
}
