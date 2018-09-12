package db;

import java.sql.*;

public class Connector {

    private String databaseURL;
    private String user;
    private String password;

    private Connection conn;
    Statement stmt;

    public Connector(String databaseUrl, String user, String password){

        this.databaseURL = databaseUrl;
        this.user = user;
        this.password = password;

        connect();
    }

    public void connect(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(databaseURL, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createStatement(){

        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void exceuteUpdate(String sql){
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String sql){

        ResultSet resultSet = null;

        try {
            resultSet =  stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            return resultSet;
        }
    }

    public void close(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
