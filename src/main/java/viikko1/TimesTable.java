package viikko1;

public class TimesTable {
    public static String table(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append(n)
                  .append(" x ")
                  .append(i)
                  .append(" = ")
                  .append(n * i)
                  .append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int number = 5; // You can change this to any number
        System.out.println("Multiplication Table for " + number + ":\n");
        System.out.println(table(number));
    }
}

