package models;

import java.time.LocalDate;
import java.time.Period;


public class Contact {
    private String name; 
    private int age;
    private LocalDate birthDate;
    private String phoneNumber;

    public Contact(String name, LocalDate birthDate, String phoneNumber) {
        if (name == null) {
            throw new IllegalArgumentException("name cannot be blank");
        }
        this.name = name;
        this.age = getAge(birthDate);
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public Contact(Contact contact) {
        this.name = contact.name;
        this.age = getAge(contact.birthDate);
        this.birthDate = contact.birthDate;
        this.phoneNumber = contact.phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDate() {
        return birthDate.toString();
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return 
            "Name: " + this.name + "\n" +
            "Age: " + this.age + "\n" +
            "PhoneNumber: " + this.phoneNumber + "\n" +
            "BirthDate: " + this.birthDate;
    }
}
