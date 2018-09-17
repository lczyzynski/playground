public class Stories {
    public static int fibonacci(int n) {
        int fn_2 = 1;
        int fn_1 = 0;
        int fn = 0;

        for (int i = 1; i <= n; i++) {
            fn = fn_2 + fn_1;
            fn_2 = fn_1;
            fn_1 = fn;
        }
        return fn;
    }

    public static int combinations(int numberOfStories) {
        return fibonacci(numberOfStories+1);
    }

    public static void main(String[] args) {
        System.out.println(combinations(3));
    }
}