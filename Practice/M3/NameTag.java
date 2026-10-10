package practice.m3;

public class NameTag {
    private final String firstName;
    private final String lastInitial;

    public NameTag(String fullName) {
        if (fullName == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        String[] parts = fullName.split(" ");
        if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty()) {
            throw new IllegalArgumentException("Enter a first name and last name separated by one space.");
        }
        firstName = parts[0];
        lastInitial = parts[1].substring(0, 1);
    }

    public String getNickname() {
        return firstName + " " + lastInitial + ".";
    }

    public static void main(String[] args) {
        NameTag tag = new NameTag("Maria Gomez");
        System.out.println(tag.getNickname());
    }
}
