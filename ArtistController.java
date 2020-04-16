package com.company;
import com.mysql.jdbc.ResultSet;

import java.sql.*;

public class ArtistController {
    Database db;

    public ArtistController(Database db) {
        this.db = db;
    }

    public void create(String name,String country){
        try {
            Statement stmt=db.con.createStatement();
            stmt.executeUpdate("insert into artists (name,country) values(\'"+name+"\',\'"+country+"\')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public java.sql.ResultSet findByName(String name)
    {
        try {
            Statement stmt=db.con.createStatement();
            java.sql.ResultSet rs=stmt.executeQuery("select * from artists where name=\'"+name+"\'");
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
