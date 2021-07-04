/**
 *
 */
public class PolyHash {
    public static void main(String[] args) {
        //helloworld
        String s = "sfalgo";
        int p = 2;
        int mod = 1_000_000_000;

        System.out.println(h(s,p,mod));



    }
    static long power(int x, int n, int mod) { // функция для возведения в степень
        long res = 1L;
        for (int i = 0; i < n; i++) {
            res *= x;
            res %= mod;
        }
        return res;
    }
    static long toInt(char c) { // функция для преобразования символа в число. Может быть любой, не обязательно такой
        return  c - 'a';
    }

    static int h(String s, int p, int mod) { // главная функция для вычисления полиномиального хеша
        long res = 0L;
        for (int i = 0; i < s.length(); i++) {
            res += power(p, i, mod) * toInt(s.charAt(i));
            res %= mod; // вычисляем по формуле
        }
        return (int) res;
    }
}
