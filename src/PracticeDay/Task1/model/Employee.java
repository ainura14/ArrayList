package PracticeDay.Task1.model;

import PracticeDay.Task1.enums.Gender;
import PracticeDay.Task1.enums.Position;

public class Employee {
    private Long id;
    private static int incrementedID = 0;
    private String fullName;
    private String email;
    private String phoneNumber;
    private double experience;
    private Position position;
    private Gender gender;

    public Employee() {
    }

    public Employee(String fullName, String email, String phoneNumber, double experience, Position position, Gender gender) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        this.position = position;
        this.gender = gender;
    }

    public Employee(Long id, String fullName, String email, String phoneNumber, Position position, double experience, Gender gender) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.experience = experience;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", experience=" + experience +
                ", position=" + position +
                ", gender=" + gender +
                '}';
    }
}
