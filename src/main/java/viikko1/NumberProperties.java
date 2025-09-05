package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        StringBuilder description = new StringBuilder();

        // Check if the number is positive, negative, or zero
        if (n > 0) {
            description.append("Positive");
        } else if (n < 0) {
            description.append("Negative");
        } else {
            description.append("Zero");
        }

        // Check if the number is even or odd
        if (n != 0) {
            description.append(", ");
            description.append(n % 2 == 0 ? "Even" : "Odd");
        }

        // Check if the number is prime
        if (isPrime(n)) {
            description.append(", Prime");
        }

        return description.toString();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 7; // You can change this
        System.out.println("Description: " + describe(number));
    }
}
