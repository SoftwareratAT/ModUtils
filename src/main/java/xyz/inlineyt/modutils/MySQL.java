package xyz.inlineyt.modutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {

    private Connection con;

    private String Host;
    private int port;
    private String database;
    private String user;
    private String password;
    public MySQL(String Host , int port, String database, String user , String password ){
        this.Host = Host;
        this.port = port;
        this.database = database;
        this.user = user;
        this.password = password;
        connect();
    }


    public void connect () {
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + "Localhost" + "3306" + "/" + "GameMode" + "?autoRecconnect=true" + "LuckPerms" + "GGoders0");

        }catch (SQLException e) {
            System.out.println("SQL Disconecctde");
        }
    }
    public Connection getConnection() {
return this.con;
    }


}
