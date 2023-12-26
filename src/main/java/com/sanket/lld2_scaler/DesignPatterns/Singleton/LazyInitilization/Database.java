package com.sanket.lld2_scaler.DesignPatterns.Singleton.LazyInitilization;

public class Database {
    private static Database obj;

    private Database() {
    }

    public static synchronized Database getInstance() {
        if (obj == null) {
            synchronized (Database.class) {
                if (obj == null) {
                    obj = new Database();
                }
            }
        }

        return obj;
    }
}
