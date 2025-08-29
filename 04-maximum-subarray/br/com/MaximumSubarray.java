public class MaximumSubarray {
    public int SubarrayCalculator(int[] n) {
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < n.length; i++) {
            if (currentSum + n[i] > n[i]) {
                currentSum = currentSum + n[i];
            } else {
                currentSum = n[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] n = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        MaximumSubarray m = new MaximumSubarray();
        System.out.println(m.SubarrayCalculator(n));
    }
}