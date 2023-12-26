package com.sanket.lld2_scaler.SOLID.OnlineStore.DesignBird.Version0;

public class Bird {
    private String name;
    private int age;
    private String color;
    private double weight;
    private double height;
    private String breed;

    // Constructor
    public Bird(String name, int age, String color, double weight, double height, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.breed = breed;
    }

    // Methods
    public void fly() {
        if (this.name.equals("sparrow")) {
            System.out.println(name + " is flying at ground level");
        }else if(this.name.equals("egle")){
            System.out.println(name + " is flying above the sky");
        }else if(this.name.equals("ostrich")){
            System.out.println(name + " don't know how to fly");
        }else {
            System.out.println(name + " is not flying");
        }
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void makeSound() {
        System.out.println(name + " is making a sound.");
    }
}