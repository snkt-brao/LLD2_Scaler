package com.sanket.lld2_scaler.DesignPatterns.Singleton.LazyInitilization;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();

        Database database1 = Database.getInstance();
    }
}
