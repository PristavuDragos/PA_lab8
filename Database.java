package com.company;

import java.sql.*;
class Database{
    private static Database db=null;
    public Connection con;
    private Database()
    {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            String host = "localhost";
            String dbname = "MusicAlbums";
            String url = "jdbc:mariadb://" + host + "/" + dbname;
            String username = "dba2";
            String password = "sql";
            Connection conn = DriverManager.getConnection(url, username, password);

        }catch(Exception e){ System.out.println(e);}
    }
    public static Database getInstance()
    {
        if (db == null)
            db = new Database();

        return db;
    }


}