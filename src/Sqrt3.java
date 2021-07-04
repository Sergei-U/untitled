/**
 *
 */
public class Sqrt3 {
    public static void main(String[] args) {
        sqrt3(27);
        sqrt2(4);
    }

    static void sqrt3(float x) {
        float l = 1;
        float r = x + 1;
        float delta = 0.0001F;
        while (Math.abs(l * l * l - x) > delta) {
            float mid = (l + r) / 2;
            if (mid * mid * mid > x) {
                r = mid;
            } else {
                l = mid;
            }
        }
        System.out.println(l);
    }

    static void sqrt2(float x) {
        float l = 1;
        float r = x + 1;
        float delta = 0.0001F;
        // останавливаемся в тот момент, когда найденное число в квадрате удалено от x не более, чем на delta
        while (Math.abs(l * l - x) > delta) {
            float mid = (l + r) / 2;
            if (mid * mid > x) {
                r = mid;
            } else {
                l = mid;
            }
        }
        // здесь у нас нет варианта, когда квадратный корень был бы не найден, так что просто выводим найденное значение
        System.out.println(l);
    }
}
