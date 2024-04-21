package com.sanket.lld2_scaler.DesignPatterns.Singleton.ConnectionPool;

public class Main {
    public static void main(String[] args) {
        ConnectionPool connectionPool = ConnectionPoolImpl.getInstance(7);
        connectionPool.getConnection();
        connectionPool.getTotalConnectionsCount();
        connectionPool.getAvailableConnectionsCount();
        connectionPool.releaseConnection(new DatabaseConnection());
        connectionPool.getTotalConnectionsCount();
        connectionPool.getAvailableConnectionsCount();

    }
}
