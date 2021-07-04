/**
 *
 */
public class EvclidAlg {
    private static int gcd(int a, int b) { // greatest common divisor
        // вычитаем из большего числа меньшее, пока числа не станут равны
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
        return a; // с таким же успехом мы можем вернуть b
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 170;
        gcd(a,b);
    }

    private static int gcd_2(int a, int b){
        if (b==0) {
            return a;
        }
        else if (a>= b && b>0) {
            return gcd_2(b,(a%b));
        }
        else return gcd_2(b, a);
    }
}
