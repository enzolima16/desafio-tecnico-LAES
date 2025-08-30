public class MissingNumber {
    public int finder(int[] nums) {
        int expectedTotal = 0;
        for (int i = 0; i <= nums.length; i++) {
            expectedTotal += i;
        }
        int currentSum = 0;
        for (int y : nums) {
            currentSum += y;
        }
        return expectedTotal - currentSum;
    }

    public static void main(String[] args) {
        MissingNumber m = new MissingNumber();
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(m.finder(nums));
    }
}