import java.util.*;

public class KthPermutation {
    public static String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        k--; // Convert to 0-based index
        StringBuilder result = new StringBuilder();
        int fact = factorial(n - 1);

        for (int i = n; i >= 1; i--) {
            int index = k / fact;
            result.append(nums.get(index));
            nums.remove(index);
            k %= fact;

            if (i > 1) {
                fact /= (i - 1);
            }
        }

        return result.toString();
    }

    private static int factorial(int num) {
        int res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 4;
        System.out.println(getPermutation(n, k));  // Output: "231"
    }
}
