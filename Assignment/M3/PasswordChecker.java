package assignment.m3;

public class PasswordChecker {
    private final String password;

    public PasswordChecker(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null.");
        }
        this.password = password;
    }

    public String getStrength() {
        int length = password.length();

        if (length < 6) {
            return "Weak";
        } else if (length <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }

    public static void main(String[] args) {
        PasswordChecker first = new PasswordChecker("abcd");
        PasswordChecker second = new PasswordChecker("abcdefgh");
        PasswordChecker third = new PasswordChecker("abcdefghijkl");

        System.out.println("First password: " + first.getStrength());
        System.out.println("Second password: " + second.getStrength());
        System.out.println("Third password: " + third.getStrength());
    }
}
