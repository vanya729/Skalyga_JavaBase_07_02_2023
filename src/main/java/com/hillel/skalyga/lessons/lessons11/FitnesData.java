package com.hillel.skalyga.lessons.lessons11;
import java.util.Calendar;
import java.time.LocalDate;

public class FitnesData {
    final String firstName;
    private String lastName;
    final int birthDate;
    final int birthMonth;
    final int birthYear;
    private int weight;
    final String email;
    final String phone;
    private int pressure;
    private int stepsPerDay;
    private int age;


    public FitnesData(String firstName, String lastName, int birthDay, int birthMonth, int birthYear, String email,
                      String phone, int weight,int pressure , int stepsPerDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.email = email;
        this.phone = phone;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;
        this.birthDate = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        this.age = currentYear - birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getWeight() {
        return weight;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public void printAccountInfo(){
        System.out.println("Name: "+ firstName + " "+ lastName);
        System.out.println("Age: "+age);
        System.out.println("Email: "+ email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: "+weight+"kg");
        System.out.println("Pressure: " + pressure);
        System.out.println("Steps per day: "+ stepsPerDay+"\n");
    }
}