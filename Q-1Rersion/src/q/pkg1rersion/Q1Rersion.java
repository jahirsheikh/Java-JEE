package q.pkg1rersion;

public class Q1Rersion {

    public static void main(String[] args) {

        int result = fac(5);
        System.out.println("Factorial 5 = "+result);
    }

    public static int fac(int n) {
        if (n > 0) {
            return n * fac(n - 1);
        } else {
            return 1;
        }

    }

}
