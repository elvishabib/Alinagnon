/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.ConnexionBD;

/**
 *
 * @author akadjelvis
 */
public class AdminModel {

    private String id;
    private String id_user;
    private String mdp;
    private long date;
    private String ancienmdp;

    public boolean ChangerAdminMDP() {
        String query = "update Admin set mdp='" + this.mdp
                + "' where id_user='" + this.id_user + "' and mdp='" + this.ancienmdp + "';";
        ConnexionBD dbc = new ConnexionBD();
        int numRows = dbc.ExecuteUpdate(query);
        if (numRows > 0) {
            dbc.close();
            return true;
        } else {
            dbc.close();
            return false;
        }
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setAncienmdp(String ancienmdp) {
        this.ancienmdp = ancienmdp;
    }

    public boolean AdminLogin() throws SQLException {
        String query = "select id_user from Admin where id_user='" + this.id_user + "' and mdp='" + this.mdp + "';";
        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = dbc.ExecuteQuery(query);
        Boolean r = false;
        while (rs.next()) {
            r = true;
        }
        return r;
    }

    public ResultSet VoirReservations() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "select * from Reservation";
        System.out.println(query);
        ResultSet rs = dbc.ExecuteQuery(query);
        return rs;
    }

    public ResultSet VoirCompagnies() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "select * from Compagnie";
        System.out.println(query);
        ResultSet rs = dbc.ExecuteQuery(query);
        return rs;
    }

    public ResultSet VoirUsers() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "select * from User";
        System.out.println(query);
        ResultSet rs = dbc.ExecuteQuery(query);
        return rs;
    }
}
