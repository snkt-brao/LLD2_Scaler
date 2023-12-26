package com.sanket.lld2_scaler.DesignPatterns.ProtoypeRegistry;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "sanket", "bhalerao", "sbrao@gmail.com", "09889786765");
        Student studentCopy = student.clone();

        IntelligentStudent intelligentStudent = new IntelligentStudent(1, "sanket", "bhalerao", "sbrao@gmail.com",
                "09889786765", 98.23, 99.00, 123, 150, 5);

        IntelligentStudent intelligentStudentCopy = intelligentStudent.clone();
        intelligentStudentCopy.setFirstName("somename");
    }
}
