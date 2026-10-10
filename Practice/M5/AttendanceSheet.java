package practice.m5;

public class AttendanceSheet {
    private final String[] names;
    private int presentCount;

    public AttendanceSheet(int maxStudents) {
        if (maxStudents < 0) {
            throw new IllegalArgumentException("Maximum students cannot be negative.");
        }
        names = new String[maxStudents];
        presentCount = 0;
    }

    public boolean markPresent(String name) {
        if (name == null || name.isEmpty() || isPresent(name)
                || presentCount == names.length) {
            return false;
        }
        names[presentCount] = name;
        presentCount++;
        return true;
    }

    public int getPresentCount() {
        return presentCount;
    }

    public boolean isPresent(String name) {
        if (name == null) {
            return false;
        }
        for (int i = 0; i < presentCount; i++) {
            if (names[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println("Present count: " + sheet.getPresentCount());
        System.out.println("Is Ben present? " + sheet.isPresent("Ben"));
        System.out.println("Is Chen present? " + sheet.isPresent("Chen"));
    }
}
