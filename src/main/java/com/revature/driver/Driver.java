package com.revature.driver;

import com.revature.dao.artistDAO;
import com.revature.dao.paintingDAO;
import com.revature.model.Artist;
import com.revature.model.Painting;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Driver {
    public static Connection conn = ConnectionUtil.getConnection();

    public static void main(String[] args) {
        artistDAO artistdao = new artistDAO();
        paintingDAO paintingdao = new paintingDAO();

        try {
            List<Artist> allArtist = artistdao.getAllArtists();
            for(Artist A : allArtist) {
                System.out.println(A);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
