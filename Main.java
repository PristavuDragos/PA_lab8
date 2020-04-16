package com.company;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws SQLException {
        Database db=Database.getInstance();
        ArtistController ArC=new ArtistController(db);
        //ArC.create("ghiul","Cosovo");
        ResultSet rs=ArC.findByName("ghiul");
        while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        AlbumController AlC=new AlbumController(db);
        //AlC.create("The song of my people",1,2001);
        rs=AlC.findByArtist(1);
        while(rs.next())
            System.out.println(rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
    }
}
