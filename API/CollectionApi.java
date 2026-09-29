
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CollectionApi {

    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(6);
        nums.add(3);
        nums.add(9);

        Collections.sort(nums);

        for (Integer n : nums) {
            System.out.println(n);
        }

    }
}
