package ru.youlola.spring.models;

import javax.validation.constraints.*;

public class Person {
    private int id;

//    @NotEmpty(message = "Name should not be empty")
//    @Size(min = 2,max = 30, message = "Name should not be between 2 and 30 characters" )
//    private String namesur;

    @Min(value = 0,message = "Age should be greater than 0")
    private int yearOfBirth;

    @NotEmpty(message = "Поле ФИО не может быть пустым")
    @Size(min = 2, max = 100, message = "Имя должно быть от 2 до 100 символов длинной")
    private String fullName;

//    @Pattern(regexp="[A-Z]\\w+, [A-Z]\\w+, \\d{6}", message = "Your address should be in this format: Country, City, Postal Code (6 digits)")
//    private String address;
    public Person(){

    }

    public Person(String fullName, int yearOfBirth) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
//        this.email = email;
//        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
}

