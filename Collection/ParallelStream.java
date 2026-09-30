
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {

    public static void main(String[] args) {

        int size = 10_000_000;
        List<Integer> nums = new ArrayList<>();
        Random ran = new Random();
        for (int i = 1; i <= size; i++) {
            nums.add(ran.nextInt(100));
        }

        long startSeq = System.currentTimeMillis();

        int sum1 = nums.stream()
                .mapToInt(n -> n * 2)
                .sum();

        long endSeq = System.currentTimeMillis();

        long startPar = System.currentTimeMillis();
        int sum2 = nums.parallelStream()
                .mapToInt(n -> n * 2)
                .sum();
        long endPar = System.currentTimeMillis();

        System.out.println("Sequential: " + (endSeq - startSeq));
        System.out.println("Parallel: " + (endPar - startPar));
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
