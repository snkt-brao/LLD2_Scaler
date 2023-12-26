package com.sanket.lld2_scaler.DesignPatterns.Singleton.EagerInitilization;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        Database db3 = Database.getInstance();
        Database db4 = Database.getInstance();
    }
}
