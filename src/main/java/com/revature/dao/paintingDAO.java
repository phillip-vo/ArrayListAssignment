package com.revature.dao;
import com.revature.model.Artist;
import com.revature.model.Painting;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.revature.driver.Driver.conn;


public class paintingDAO {

    public List<Painting> getAllPaintings() {
        return null;
    }

    public Painting getPainting(String title) throws SQLException {
        Painting myPainting = null;
        PreparedStatement statement = conn.prepareStatement("Select * From Painting Where title = ?");
        int parameterIndex = 0;
        statement.setString(++parameterIndex, title);

        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            myPainting = new Painting(rs.getInt("artist_id"),
                    rs.getString("title"),
                    rs.getString("url"),
                    rs.getString("genre"),
                    rs.getInt("year_made"));
        }
        rs.close();
        return myPainting;
    }

    public void addPainting(Painting P) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(
                "Insert into Painting (artist_id, title, url, genre year_made)" +
                        "Values" +
                        "(?,?,?,?,?)");
        int parameterIndex = 0;
        statement.setInt(++parameterIndex, P.getArtist_id());
        statement.setString(++parameterIndex, P.getTitle());
        statement.setString(++parameterIndex, P.getUrl());
        statement.setString(++parameterIndex, P.getGenre());
        statement.setInt(++parameterIndex, P.getYear());
        statement.executeUpdate();

    }


}
