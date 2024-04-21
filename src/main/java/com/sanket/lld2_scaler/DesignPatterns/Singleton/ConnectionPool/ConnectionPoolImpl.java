package com.sanket.lld2_scaler.DesignPatterns.Singleton.ConnectionPool;


import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPoolImpl implements ConnectionPool{

    private int maxConnection;
    private Queue<DatabaseConnection> databaseConnections;

    private static ConnectionPoolImpl connectionPool;


    @Override
    public void initializePool() {
        for(int i=0;i<maxConnection;i++){
            databaseConnections.offer(new DatabaseConnection());
        }
    }

    private ConnectionPoolImpl(int maxConnection){
        this.databaseConnections = new LinkedList<>();
        this.maxConnection = maxConnection;
        initializePool();
    }

    public static void resetConnection(){
        connectionPool = null;
    }

    public static ConnectionPoolImpl getInstance(int maxConnection){
        if(connectionPool==null){
            synchronized (ConnectionPoolImpl.class){
                if(connectionPool==null){
                    connectionPool = new ConnectionPoolImpl(maxConnection);
                }
            }
        }

        return connectionPool;
    }

    @Override
    public DatabaseConnection getConnection() {
        return databaseConnections.poll();
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        databaseConnections.offer(connection);
    }

    @Override
    public int getAvailableConnectionsCount() {
        return databaseConnections.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxConnection;
    }
}
