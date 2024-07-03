import java.util.Scanner;

public class Sum {
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = sc.nextInt();
        System.out.println("Enter second num");

        int b = sc.nextInt();
        sc.close();

        int sum = add(a, b);
        System.out.println("Sum of " + a + " " + "and " + b + " " + "is " + sum);
    }
}
