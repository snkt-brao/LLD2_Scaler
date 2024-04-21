package com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry.Student;

public class Student {
    private int rollNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;

    public Student(int rollNumber, String firstName, String lastName, String email, String mobileNumber) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public Student(Student student) {
        this.rollNumber = student.rollNumber;
        this.firstName = student.firstName;
        this.lastName = student.lastName;
        this.email = student.email;
        this.mobileNumber = student.mobileNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Student clone() {
        return new Student(this);
    }
}
