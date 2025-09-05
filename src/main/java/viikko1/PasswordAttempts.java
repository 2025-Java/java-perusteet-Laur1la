package viikko1;

public class PasswordAttempts {
    private static final String CORRECT_PASSWORD = "java123";

    public static String login(String[] tries) {
        int maxAttempts = Math.min(3, tries.length);

        for (int i = 0; i < maxAttempts; i++) {
            if (tries[i].equals(CORRECT_PASSWORD)) {
                return "Tervetuloa!";
            }
        }

        return "Liian monta virheellistä yritystä.";
    }

    public static void main(String[] args) {
        String[] attempts1 = { "1234", "java123", "salasana" };
        System.out.println(login(attempts1)); // Tervetuloa!

        String[] attempts2 = { "wrong1", "wrong2", "wrong3", "java123" };
        System.out.println(login(attempts2)); // Liian monta virheellistä yritystä.

        String[] attempts3 = { "java123" };
        System.out.println(login(attempts3)); // Tervetuloa!
    }
}

