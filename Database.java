package com.company;

import java.sql.*;
class Database{
    private static Database db=null;
    public Connection con;
    private Database()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:5005/MusicAlbums","dba","sql");

        }catch(Exception e){ System.out.println(e);}
    }
    public static Database getInstance()
    {
        if (db == null)
            db = new Database();

        return db;
    }


}