package com.company;

import java.sql.SQLException;
import java.sql.Statement;

public class AlbumController {
    Database db;

    public AlbumController(Database db) {
        this.db = db;
    }

    public void create(String name,int artisId,int releaseYear){
        try {
            Statement stmt=db.con.createStatement();
            stmt.executeUpdate("insert into albums (name,artist_id,release_year) values(\'"+name+"\',"+artisId+","+releaseYear+")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public java.sql.ResultSet findByArtist(int artistId)
    {
        try {
            Statement stmt=db.con.createStatement();
            java.sql.ResultSet rs=stmt.executeQuery("select * from albums where artist_id="+artistId);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
