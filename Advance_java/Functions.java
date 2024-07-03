import java.util.Scanner;

public class Functions {
    public static void printMyName(String name) {
        System.out.println("Your name is" + name);
        return;
    }

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        String name = ab.next();

        printMyName(name);
        ab.close();
    }
}