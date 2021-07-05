import static java.lang.Math.pow;

/**
 *
 */
public class MatrixHash {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {6, 8, 5, 4},
                {7, 12, 5, 7},
                {12, 8, 9, 1}
        };
        System.out.println(calcHash(matrix, 1000, 6, 7));


        int p = 2, q = 3, mod = 3000;

        int matrixHash;
        matrixHash = (int) ((1 * pow(p, 0) * pow(q, 0)) + (2 * pow(p, 0) * pow(q, 1)) + (3 * pow(p, 0) * pow(q, 2)) +
                (4 * pow(p, 1) * pow(q, 0)) + (5 * pow(p, 1) * pow(q, 1)) + (6 * pow(p, 1) * pow(q, 2)));
        System.out.println(matrixHash % mod);

        int matrixHashTwo;
        matrixHashTwo = (int) (1 * pow(p, 0) * pow(q, 0) + (2 * pow(p, 0) * pow(q, 1) +
                3 * pow(p, 1) * pow(q, 0) + 4 * pow(p, 1) * pow(q, 1) +
                5 * pow(p, 2) * pow(q, 0) + 6 * pow(p, 2) * pow(q, 1)));

        System.out.println(matrixHashTwo % mod);


        int p1 = 6, q1 = 7, mod1 = 1000;

        int matrixHashThree = (int) (6 * pow(p1, 0) * pow(q1, 0) + 8 * pow(p1, 0) * pow(q1, 1) + 5 * pow(p1, 0) * pow(q1, 2) + 4 * pow(p1, 0) * pow(q1, 3) +
                7 * pow(p1, 1) * pow(q1, 0) + 12 * pow(p1, 1) * pow(q1, 1) + 5 * pow(p1, 1) * pow(q1, 2) + 7 * pow(p1, 1) * pow(q1, 3) +
                12 * pow(p1, 2) * pow(q1, 0) + 8 * pow(p1, 2) * pow(q1, 1) + 9 * pow(p1, 2) * pow(q1, 2) + 1 * pow(p1, 2) * pow(q1, 3));
        System.out.println(matrixHashThree % mod1);
    }


    static long power(int x, int n) {
        long res = 1L;
        for (int i = 0; i < n; i++) {
            res *= x;
        }
        return res;
    }

    static int calcHash(int[][] matrix, int mod, int p, int q) {
        long hash = 0L;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int m = matrix[i].length; // все m, по всем итерациям, должны быть равны, мы это не проверяем, это требование ко входной матрице
            for (int j = 0; j < m; j++) {
                hash += power(p, i) * power(q, j) * matrix[i][j];
                System.out.println(p + " " + i + " " + q + " " + j + " " + matrix[i][j]);
                System.out.println("+ " + power(p, i) * power(q, j) * matrix[i][j]);
                hash %= mod;
            }
        }
        return (int) hash;
    }


}
