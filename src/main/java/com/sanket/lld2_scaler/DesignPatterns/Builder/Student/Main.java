package com.sanket.lld2_scaler.DesignPatterns.Builder.Student;

public class Main {
    public static void main(String[] args) {
        Student student = Student.getBuilder().setName("sjdn").setMotherName("sldksdk").build();
    }
}
