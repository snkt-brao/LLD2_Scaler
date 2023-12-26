package com.sanket.lld2_scaler.DesignPatterns.Singleton.EagerInitilization;

public class Database {
    private static Database obj = new Database();

    private Database() {
    }

    public static Database getInstance() {
        return obj;
    }
}
