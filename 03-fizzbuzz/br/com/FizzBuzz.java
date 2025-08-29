import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizz(int n) {
        List<String> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                a.add("FizzBuzz");
            } else if (i % 3 == 0) {
                a.add("Fizz");
            } else if (i % 5 == 0) {
                a.add("Buzz");
            } else {
                a.add("" + i);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 15;
        FizzBuzz f = new FizzBuzz();
        List<String> s = f.fizz(n);
        System.out.println(s);
    }
}