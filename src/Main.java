import java.util.Scanner;

public class Main {

        private static final Scanner scanner = new Scanner(System.in);

        private static void func(){

        int in= scanner.nextInt();
        if (in!=0){
            System.out.println(in);
            func();
        }
    }
    public static void main(String[] args) {
            func();
    }
}