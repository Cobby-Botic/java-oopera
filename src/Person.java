import java.util.Objects;

public class Person {
    String name;
    String surname;
    Gender gender;

    public Person(String name, String surname, Gender gender, int height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return height == person.height && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }

    String surname;
    Gender gender;
    int height;

    public Person(String name, String surname, Gender gender, int height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }
}
