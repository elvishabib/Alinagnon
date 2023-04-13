/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author akadjelvis
 */
public class ConnexionBD {

    private Connection conn;
    private String driver;
    private String uname;
    private String pwd;
    private String url;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public ConnexionBD() {
        driver = "com.mysql.jdbc.Driver";
        uname = "root";
        pwd = "root";
        url = "jdbc:mysql://127.0.0.1:8889/alinagnon";
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, uname, pwd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int ExecuteUpdate(String query) {
        int n = 0;
        try {
            stmt = conn.createStatement();
            n = stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return n;
    }

    public ResultSet ExecuteQuery(String query) {
        rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    public PreparedStatement ExecuteQueryPrepare(String query) {

        try {
            pstmt = conn.prepareStatement(query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pstmt;

    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
