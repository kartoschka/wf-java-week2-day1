public class Person {
    private String givenName;
    private String surname;

    Person() { }

    Person(String givenName, String surname) {
        this.givenName = givenName;
        this.surname = surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setGivenName(String name) {
        givenName = name;
    }

    public void setSurname(String name) {
        surname = name;
    }

    public String getFullName() {
        return givenName + " " + surname.toUpperCase();
    }

    public String formatFullName() {
        return String.format("%-30s  %30s", givenName, surname.toUpperCase());
    }
}
