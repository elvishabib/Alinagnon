/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.RetournerClass;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.ConnexionBD;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.GenerateurID;

/**
 *
 * @author akadjelvis
 */
public class CompagnieModel {

    private String id_compagnie;
    private String nom_compagnie;
    private String adresse;
    private String email;
    private String ville;
    private String telephone;
    private String mdp;
    private String ancienmdp;
    private String nom;

    public void setId_compagnie(String id_compagnie) {
        this.id_compagnie = id_compagnie;
    }

    public void setNom_compagnie(String nom_compagnie) {
        this.nom_compagnie = nom_compagnie;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVille(String ville) {
        this.ville = ville;
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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RetournerClass AjouterCompagnie() {
        GenerateurID idg = new GenerateurID();
        ConnexionBD dbc = new ConnexionBD();
        int success = 0;
        RetournerClass r = new RetournerClass();
        this.id_compagnie = idg.GenererID("id_compagnie", "Compagnie");
        r.setS(this.id_compagnie);
        PreparedStatement pstmt = null;

        String query = "insert into Compagnie(id_compagnie,nom_compagnie,adresse,email,ville,telephone,mdp) values(?,?,?,?,?,?,?)";

        try {
            pstmt = dbc.ExecuteQueryPrepare(query);
            pstmt.setString(1, this.id_compagnie);
            pstmt.setString(2, this.nom_compagnie);
            pstmt.setString(3, this.adresse);
            pstmt.setString(4, this.email);
            pstmt.setString(5, this.ville);
            pstmt.setString(6, this.telephone);
            pstmt.setString(7, this.mdp);

            success = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                ;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (success >= 1) {
            r.setB(true);
        } else {
            r.setB(false);
        }
        return r;

    }

    public boolean Login() throws SQLException {
        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = null;
        boolean result = false;
        String query = "select * from Compagnie where email='" + this.email + "' and mdp='" + this.mdp + "';";
        rs = dbc.ExecuteQuery(query);
        Boolean result1 = false;
        while (rs.next()) {
            result1 = true;
        }
        return result1;
    }

    public ResultSet Login1() {
        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = null;
        boolean result = false;
        String query = "select * from Compagnie where email='" + this.email + "' and mdp='" + this.mdp + "'";
        System.out.println(query);
        rs = dbc.ExecuteQuery(query);

        return rs;
    }

    public boolean Compagnie_Disponible(String s) {
        ConnexionBD dbc = new ConnexionBD();
        String query = "select id_compagnie from Compagnie";
        ResultSet rs = null;
        rs = dbc.ExecuteQuery(query);
        boolean result = false;
        try {
            while (rs.next()) {
                if (rs.getString(1).equals(s)) {
                    result = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public boolean SupprimerCompte() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "create TRIGGER beforeCompagnieDelete"
                + "BEFORE DELETE ON Compagnie" + "FOR EACH ROW"
                + "INSERT INTO Compagnie_Hist" + "select * from User;";
        String query1 = "delete from Compagnie where email='"
                + this.email + "' and mdp='" + this.mdp
                + "';";
        int numRows = 0;
        numRows = dbc.ExecuteUpdate(query1);
        dbc.close();
        if (numRows > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ModifierMDPByEmail() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "update Compagnie set mdp = '" + this.mdp
                + "'where email='" + this.email + "' and mdp='"
                + this.ancienmdp + "'";
        int numRows = dbc.ExecuteUpdate(query);
        System.out.println(query);
        if (numRows >= 1) {
            dbc.close();
            return true;
        } else {
            dbc.close();
            return false;
        }
    }

    public Boolean Supprimer_CompagnieByAdmin() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "create TRIGGER beforeCompagnieDelete"
                + "BEFORE DELETE ON Compagnie" + "FOR EACH ROW"
                + "INSERT INTO Compagnie_Hist" + "select * from User;";
        String query1 = "delete from Compagnie where email='" + this.email
                + "' or id_compagnie='" + this.id_compagnie + "';";
        int numRows = 0;
        numRows = dbc.ExecuteUpdate(query1);
        dbc.close();
        if (numRows > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getIdUserByEmail(String email2) throws SQLException {
        String query = "select id_compagnie from Compagnie where email='"
                + email2 + "';";
        System.out.println(query);
        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = dbc.ExecuteQuery(query);
        String uid = "";
        try {
            uid = "";
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        try {
            while (rs.next()) {
                uid = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return uid;
    }

    public ResultSet getCompagnie() {
        String query = "select * from Compagnie where id_compagnie='"
                + this.id_compagnie + "';";

        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = null;
        rs = dbc.ExecuteQuery(query);
        System.out.println(query);
        return rs;
    }

    public boolean ModifierProfilUser() {
        String query = "update Compagnie set nom_compagnie = '" + this.nom
                + "', adresse = '" + this.adresse + "', ville = '" + this.ville
                + "', telephone ='" + this.telephone + "', email ='"
                + this.email + "'" + " where id_compagnie='" + this.id_compagnie + "';";
        System.out.println(query);
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

    public ResultSet getAllCompagnies() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "select * from Compagnie";
        ResultSet rs = dbc.ExecuteQuery(query);

        return rs;
    }
}
