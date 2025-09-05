package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        if (n == 0) {
            return "nolla";
        }

        String sign = n > 0 ? "positiivinen" : "negatiivinen";
        String parity = n % 2 == 0 ? "parillinen" : "pariton";

        return sign + " " + parity;
    }

    public static void main(String[] args) {
        System.out.println(describe(4));    // positiivinen parillinen
        System.out.println(describe(-3));   // negatiivinen pariton
        System.out.println(describe(0));    // nolla
    }
}
