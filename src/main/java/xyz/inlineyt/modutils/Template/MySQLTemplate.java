package xyz.inlineyt.modutils.Template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLTemplate {

    private Connection con;

    private String Host;
    private int port;
    private String database;
    private String user;
    private String password;
    public MySQLTemplate(String Host , int port, String database, String user , String password ){
        this.Host = Host;
        this.port = port;
        this.database = database;
        this.user = user;
        this.password = password;
        connect();
    }


    public void connect () {
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + Host + port + "/" + database + "?autoRecconnect=true" +user + password);

        }catch (SQLException e) {
            System.out.println("SQL Disconecctde");
        }
    }
    public Connection getConnection() {
return this.con;
    }


}
