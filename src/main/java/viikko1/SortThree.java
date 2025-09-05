package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        int middle = a + b + c - smallest - largest;

        return smallest + ", " + middle + ", " + largest;
    }

    public static void main(String[] args) {
        System.out.println("Sorted: " + ascending(9, 2, 5));     // Output: 2, 5, 9
        System.out.println("Sorted: " + ascending(-1, 0, -3));   // Output: -3, -1, 0
        System.out.println("Sorted: " + ascending(7, 7, 7));     // Output: 7, 7, 7
    }
}

