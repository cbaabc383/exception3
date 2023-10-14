package homework;

public class Person {
    private String secondName;
    private String firstName;
    private String surname;
    private String birthday;
    private long phoneNumber;
    private String sex;

    @Override
    public String toString() {
        return secondName + " " + firstName + " " + surname +
                ", " + birthday + "г." +
                ", тел. " + phoneNumber +
                ", пол: " + sex;
    }

    public Person(String secondName, String firstName, String surname, String birthday, long phoneNumber, String sex) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
