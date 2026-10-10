package practice.m4;

public class Locker {
    private String code;
    private final int lockerNumber;

    public Locker(int lockerNumber, String initialCode) {
        this.lockerNumber = lockerNumber;
        this.code = initialCode;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (code != null && code.equals(currentCode) && newCode != null) {
            code = newCode;
            return true;
        }
        return false;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public static void main(String[] args) {
        Locker locker = new Locker(101, "1234");
        System.out.println("Correct code accepted: " +
                locker.changeCode("1234", "5678"));
        System.out.println("Wrong code accepted: " +
                locker.changeCode("0000", "9999"));
        System.out.println("Locker number: " + locker.getLockerNumber());
        // There is intentionally no getter for the combination code.
    }
}
