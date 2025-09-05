package viikko1;

public class PasswordAttempts {
    private static final String CORRECT_PASSWORD = "secret123";

    public static String login(String[] tries) {
        for (String attempt : tries) {
            if (attempt.equals(CORRECT_PASSWORD)) {
                return "Logged in";
            }
        }
        return "Account locked";
    }

    public static void main(String[] args) {
        String[] attempts = { "1234", "password", "secret123" };
        System.out.println(login(attempts)); // Output: Logged in

        String[] failedAttempts = { "1234", "password", "letmein" };
        System.out.println(login(failedAttempts)); // Output: Account locked
    }
}
