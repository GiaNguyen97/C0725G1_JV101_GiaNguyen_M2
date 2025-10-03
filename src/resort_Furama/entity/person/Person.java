package resort_Furama.entity.person;

import java.time.LocalDate;

public abstract class Person {
    private String nameOfPerson;
    private LocalDate dayOfBirth;
    private String gender;
    private String idCardNumber;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String nameOfPerson, LocalDate dayOfBirth, String gender, String idCardNumber, String phoneNumber, String email) {
        this.nameOfPerson = nameOfPerson;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "nameOfPerson=" + nameOfPerson +
                ", dayOfBirth=" + dayOfBirth +
                ", gender=" + gender +
                ", idCardNumber=" + idCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", email=" + email +", ";
    }

    public String getInforToCSV() {
        return nameOfPerson+","+dayOfBirth+","+gender+","+idCardNumber+","+phoneNumber+","+email;
    }
}
