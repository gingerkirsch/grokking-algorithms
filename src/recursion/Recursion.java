package recursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
    }

    private static int fibonacci(int index) {
        int a = 1;
        int b = 1;
        return loop(a, b, index);

    }

    private static int loop(int a, int b, int index) {
        if (index < 2) {
            return b;
        }
        return loop(b, a + b, index - 1);
    }
}
