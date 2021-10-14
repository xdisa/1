import java.util.Date;

class Person {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private String passport;
    private Boolean gender;

    public Person() {

    }

    public Person(String firstName, String lastName, Date birthDate, String passport, Boolean gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.passport = passport;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassport() {
        return passport;
    }
    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Boolean getGender() {
        return gender;
    }
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        if (birthDate != null ? !birthDate.equals(person.birthDate) : person.birthDate != null) return false;
        if (passport != null ? !passport.equals(person.passport) : person.passport != null) return false;
        return gender != null ? gender.equals(person.gender) : person.gender == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (passport != null ? passport.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        Person vasya = new Person("Vasya", "Pupkin", new Date(101030042304L), "8800 555353", true);
        Person petya = new Person("Petya", "Zalupkin", new Date(34534634345345L), "666 777777", true);

        System.out.println("Vasya hashCode: " + vasya.hashCode() + " Petya hashCode: " + petya.hashCode());
        System.out.println("Vasya equals Petya: " + vasya.equals(petya));

        petya.setFirstName("Vasya");
        petya.setLastName("Pupkin");
        petya.setBirthDate(new Date(101030042304L));
        petya.setPassport("8800 555353");

        System.out.println("Vasya equals Petya: " + vasya.equals(petya));
    }
}