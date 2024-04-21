package com.sanket.lld2_scaler.DesignPatterns.Singleton.ConnectionPool;

public interface ConnectionPool {
    void initializePool();

    DatabaseConnection getConnection();

    void releaseConnection(DatabaseConnection connection);

    int getAvailableConnectionsCount();

    int getTotalConnectionsCount();
}
