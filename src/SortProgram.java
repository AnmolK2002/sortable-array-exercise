import java.util.Arrays;

public class SortProgram {

    // Feature 1: sort integers
    public static int[] sortIntegers(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    // Feature 2: sort strings
    public static String[] sortStrings(String[] words) {
        Arrays.sort(words);
        return words;
    }

    public static void main(String[] args) {
        // Test integer sorting
        int[] nums = {5, 3, 9, 1};
        System.out.println("Sorted integers: " + Arrays.toString(sortIntegers(nums)));

        // Test string sorting
        String[] words = {"banana", "apple", "dog"};
        System.out.println("Sorted strings: " + Arrays.toString(sortStrings(words)));
    }
}
