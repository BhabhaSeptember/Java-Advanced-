package lesson4;

public final class Contacts {
    private final String firstName;
    private final String lastName;


    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public Contacts(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;

    }


}
