
public class U4Exer34i5 {

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static double max(double a, double b, double c) {
        double res1 = max(a, b);
        double res2 = max(res1, c);
        return res2;

    }

    public static double max(double a, double b, double c, double d) {
        double res1 = max(a, b);
        double res2 = max(res1, c);
        double res3 = max(res2, d);
        return res3;
    }

    public static void main(String[] args) {
        double num1 = 34, num2 = 78;

        double resultado = max(num1, num2);
        System.out.println(" mayor entre " + num1 + " y " + num2 + " es " + resultado);

        double num3 = 789, num4 = 867;
        resultado = max(num1, num2, num3, num4);
        System.out.println(" mayor entre " + num1 + " y " + num2 + " y " + num3 + " y " + num4 + "  es " + resultado);

    }

}
