package viikko1;

public class ArrayStats {

    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int maxValue = arr[0];
        for (int num : arr) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] sampleArray = {5, 12, 7, 3, 9};
        int[] emptyArray = {};

        System.out.println("Average: " + average(sampleArray)); // 7.2
        System.out.println("Max: " + max(sampleArray));          // 12

        System.out.println("Average (empty): " + average(emptyArray)); // 0.0
        System.out.println("Max (empty): " + max(emptyArray));         // Integer.MIN_VALUE
    }
}


