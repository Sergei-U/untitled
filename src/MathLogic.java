/**
 *
 */
public class MathLogic {
    public static int mathLog(int a, int b, int c) {
        //a*x*x+b*x+c = 7
        int i = b * b - 4 * a * c;
        if(i >=0 || a!=0) {
            double sqrtDescr = Math.sqrt(i);
            int xOne = (int) (-1 * b + sqrtDescr) / 2 * a;
            int xTwo = (int) (-1 * b - sqrtDescr) / 2 * a;
            System.out.println("корень 1 = " + xOne);
            System.out.println("корень 2 = " + xTwo);
        }

        return a;
    }


}
