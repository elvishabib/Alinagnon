/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.ConnexionBD;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.SessionManager;

/**
 *
 * @author akadjelvis
 */
public class SessionManagerModel {

    public void getIdUser(String email) throws SQLException {
        String query = "select id_user, telephone from User where email='"
                + email + "';";
        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = null;
        rs = dbc.ExecuteQuery(query);
        while (rs.next()) {
            SessionManager.id_user = rs.getString(1);
            SessionManager.tel_user = rs.getString(2);
        }
    }

    public void getIdCompagnie(String email) throws SQLException {
        String query = "select id_compagnie, telephone from Compagnie where email='"
                + email + "';";
        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = null;
        rs = dbc.ExecuteQuery(query);
        while (rs.next()) {
            SessionManager.id_user = rs.getString(1);
            SessionManager.tel_user = rs.getString(2);
        }
    }
}
