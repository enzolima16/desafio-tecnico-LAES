public class ClimbinbStairs {
    public int climb(int n) {
        if (n <= 2) {
            return n;
        } else {
            return climb(n - 1) + climb(n - 2);
        }
    }

    public static void main(String[] args) {
        ClimbinbStairs c = new ClimbinbStairs();
        System.out.println(c.climb(3));
    }
}