/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.ConnexionBD;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.GenerateurID;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.RetournerClass;

/**
 *
 * @author akadjelvis
 */
public class UserModel {

    public String id_user;
    public String nom;
    public String prenom;
    public String adresse;
    public String ville;
    public String email;
    public String telephone;
    public String mdp;
    private String ancienmdp;
    private String secQst;
    private String secAns;

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setAncienmdp(String ancienmdp) {
        this.ancienmdp = ancienmdp;
    }

    public void setSecQst(String secQst) {
        this.secQst = secQst;
    }

    public void setSecAns(String secAns) {
        this.secAns = secAns;
    }

    public boolean AjouterUser() throws SQLException {
        String table = "User";
        String col = "id_user";
        GenerateurID idg = new GenerateurID();
        this.id_user = idg.GenererID(col, table);
        String query = "insert into User values('" + this.id_user + "','"
                + this.nom + "','" + this.prenom + "','" + this.adresse
                + "','" + this.ville + "','" + this.email + "',"
                + this.telephone + ",'" + this.mdp + " ','"
                + this.secQst + "','" + this.secAns + "' ); ";
        int numRows = 0;
        ConnexionBD dbc = new ConnexionBD();
        try {
            numRows = dbc.ExecuteUpdate(query);
        } catch (Exception e) {
            System.out.println("Désolé! E-mail déja enregistré!");
        }
        dbc.close();
        if (numRows > 0) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet Login() throws SQLException {
        ResultSet rs = null;
        String query = "select * from User where email='" + this.email
                + "' and mdp='" + this.mdp + "';";
        ConnexionBD dbc = new ConnexionBD();
        rs = dbc.ExecuteQuery(query);
        return rs;
    }

    public boolean Login1() throws SQLException {
        ResultSet rs = null;
        String query = "select * from User where email='" + this.email
                + "' and mdp='" + this.mdp + "';";
        ConnexionBD dbc = new ConnexionBD();
        rs = dbc.ExecuteQuery(query);
        if (rs.next()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ModifierProfl() {
        String query = "update User set nom = '" + this.nom
                + "', prenom = '" + this.prenom + "', adresse = '"
                + this.adresse + "', ville = '" + this.ville
                + "', telephone ='" + this.telephone + "'"
                + " where id_user='" + this.id_user + "';";
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

    public boolean ModifierMDP() {
        String query = "update User set mdp='" + this.mdp
                + "' where id_user='" + this.id_user + "' and mdp='"
                + this.ancienmdp + "';";
        ConnexionBD dbc = new ConnexionBD();
        int numRows = dbc.ExecuteUpdate(query);
        if (numRows >= 1) {
            dbc.close();
            return true;
        } else {
            dbc.close();
            return false;
        }
    }

    public boolean SupprimerRow() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "delete from User where id_user='" + this.id_user + "';";
        int numRows = dbc.ExecuteUpdate(query);
        if (numRows >= 1) {
            dbc.close();
            return true;
        } else {
            dbc.close();
            return false;
        }
    }

    public boolean ModifierMDPByEmail() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "update User set mdp = '" + this.mdp
                + "'where email='" + this.email + "'";
        int numRows = dbc.ExecuteUpdate(query);
        if (numRows >= 1) {
            dbc.close();
            return true;
        } else {
            dbc.close();
            return false;
        }
    }

    public boolean SupprimerCompte() {
        ConnexionBD dbc = new ConnexionBD();

        String query = "delete from User where email='" + this.email + "'";
        int numRows = dbc.ExecuteUpdate(query);
        if (numRows >= 1) {
            dbc.close();
            return true;
        } else {
            dbc.close();
            return false;
        }
    }

    public ResultSet VoirReservationsUser() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "select * from Reservation where id_user = '" + this.email
                + "'";
        System.out.println(query);
        ResultSet rs = dbc.ExecuteQuery(query);
        return rs;
    }

    public String getIdUserByAmin(String parameter) throws SQLException {
        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = null;
        String query = "select id_user from User where email = \"" + parameter
                + "\"";
        rs = dbc.ExecuteQuery(query);
        String userid = "";
        while (rs.next()) {
            userid = rs.getString(1);
        }
        return userid;
    }

    public ResultSet getUser() {
        ResultSet rs = null;
        ConnexionBD dbc = new ConnexionBD();
        String query = "select * from User where id_user='" + this.id_user + "';";
        System.out.println(query);
        rs = dbc.ExecuteQuery(query);
        return rs;
    }

    public String getSecQ() throws SQLException {
        ResultSet rs = null;
        String str = "";
        String query = "select secQst from User where email='"
                + this.email + "';";
        ConnexionBD dbc = new ConnexionBD();

        rs = dbc.ExecuteQuery(query);
        System.out.println(query);
        while (rs.next()) {
            str = rs.getString(1);
        }
        rs.close();
        return str;
    }

    public String checkRep() throws SQLException {
        String pass = "";
        ResultSet rs = null;

        String query = "select mdp from User where email='" + this.email + "' and secAns='" + this.secAns + "'";
        System.out.println(query);

        ConnexionBD dbc = new ConnexionBD();
        rs = dbc.ExecuteQuery(query);
        while (rs.next()) {
            pass = rs.getString(1);
        }
        rs.close();
        return pass;
    }
}
