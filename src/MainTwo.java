import java.util.Scanner;

/**
 *
 */
public class MainTwo {
    private static final Scanner scanner = new Scanner(System.in);

    private static void func() {
        int in = scanner.nextInt();
        if(in != 0) {

            func();
            System.out.println(in);
        }
    }

    public static void main(String[] args) {
        func();
    }
}
