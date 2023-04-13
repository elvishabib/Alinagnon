/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.ConnexionBD;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.GenerateurID;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.RetournerClass;

/**
 *
 * @author akadjelvis
 */
public class BusModel {

    private String id_bus;
    private String nom_bus;
    private String type_bus;
    private String heure_depart;
    private String duree_voyage;
    private String date_depart;
    private String ville_depart;
    private String ville_arrivee;
    private float prix_voyage;
    private String id_compagnie;
    private int total_sieges;

    public void setId_bus(String id_bus) {
        this.id_bus = id_bus;
    }

    public void setNom_bus(String nom_bus) {
        this.nom_bus = nom_bus;
    }

    public void setType_bus(String type_bus) {
        this.type_bus = type_bus;
    }

    public void setHeure_depart(String heure_depart) {
        this.heure_depart = heure_depart;
    }

    public void setDuree_voyage(String duree_voyage) {
        this.duree_voyage = duree_voyage;
    }

    public void setDate_depart(String date_depart) {
        this.date_depart = date_depart;
    }

    public void setVille_depart(String ville_depart) {
        this.ville_depart = ville_depart;
    }

    public void setVille_arrivee(String ville_arrivee) {
        this.ville_arrivee = ville_arrivee;
    }

    public void setPrix_voyage(float prix_voyage) {
        this.prix_voyage = prix_voyage;
    }

    public void setId_compagnie(String id_compagnie) {
        this.id_compagnie = id_compagnie;
    }

    public void setTotal_sieges(int total_sieges) {
        this.total_sieges = total_sieges;
    }

    public String getId_bus() {
        return id_bus;
    }

    public RetournerClass InsererBus() {
        GenerateurID idg = new GenerateurID();
        RetournerClass r = new RetournerClass();
        int success = 0;
        this.id_bus = idg.GenererID("id_bus", "Bus");
        r.setS(this.id_bus);
        ConnexionBD dbc = new ConnexionBD();
        PreparedStatement pstmt = null;

        String query = "insert into Bus(id_bus,nom_bus,type_bus,heure_depart,duree_voyage,ville_depart,"
                + "ville_arrivee,prix_voyage,id_compagnie,total_sieges)"
                + "values(?,?,?,?,?,?,?,?,?,?)";

        try {
            pstmt = dbc.ExecuteQueryPrepare(query);
            pstmt.setString(1, this.id_bus);
            pstmt.setString(2, this.nom_bus);
            pstmt.setString(3, this.type_bus);
            pstmt.setString(4, this.heure_depart);
            pstmt.setString(5, this.duree_voyage);
            pstmt.setString(6, this.ville_depart);
            pstmt.setString(7, this.ville_arrivee);
            pstmt.setFloat(8, this.prix_voyage);
            pstmt.setString(9, this.id_compagnie);
            pstmt.setInt(10, this.total_sieges);

            success = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                dbc.close();

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

    public boolean ModifierBus(int no) {

        int success = 0;
        ConnexionBD dbc = new ConnexionBD();

        String query = null;

        switch (no) {
            case 1: {
                query = "update Bus set nom_bus='" + nom_bus + "' where id_bus='"
                        + id_bus + "'";
                break;
            }
            case 2: {
                query = "update Bus set type_bus='" + type_bus + "' where id_bus='"
                        + id_bus + "'";
                break;
            }
            case 3: {
                query = "update Bus set heure_depart='" + heure_depart
                        + "' where id_bus='" + id_bus + "'";
                break;
            }
            case 4: {
                query = "update Bus set duree_voyage='" + duree_voyage
                        + "' where id_bus='" + id_bus + "'";
                break;
            }
            case 5: {
                query = "update Bus set ville_depart='" + ville_depart
                        + "' where id_bus='" + id_bus + "'";
                break;
            }
            case 6: {
                query = "update Bus set ville_arrivee='" + ville_arrivee
                        + "' where id_bus='" + id_bus + "'";
                break;
            }
            case 7: {
                query = "update Bus set prix_voyage='" + prix_voyage + "' where id_bus='" + id_bus
                        + "'";
                break;
            }
            case 8: {
                query = "update Bus set total_sieges='" + total_sieges
                        + "' where id_bus='" + id_bus + "'";
                break;
            }
        }

        try {
            success = dbc.ExecuteUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                dbc.close();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (success >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet VoirBus() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "select a.id_bus,b.nom_bus,b.type_bus,b.ville_depart,b.ville_arrivee,b.heure_depart,b.duree_voyage,b.prix_voyage,a.jours_freq,b.total_sieges from (select id_bus,jours_freq from Bus_Frequence where id_bus in(select id_bus from Bus where id_compagnie='"
                + id_compagnie
                + "'))a inner join Bus b on a.id_bus=b.id_bus order by a.id_bus";
        ResultSet rs;
        rs = dbc.ExecuteQuery(query);
        return rs;
    }

    public String getNom_bus() {
        return nom_bus;
    }

    public String getType_bus() {
        return type_bus;
    }

    public String getHeure_depart() {
        return heure_depart;
    }

    public String getDuree_voyage() {
        return duree_voyage;
    }

    public String getDate_depart() {
        return date_depart;
    }

    public String getVille_depart() {
        return ville_depart;
    }

    public String getVille_arrivee() {
        return ville_arrivee;
    }

    public float getPrix_voyage() {
        return prix_voyage;
    }

    public String getId_compagnie() {
        return id_compagnie;
    }

    public int getTotal_sieges() {
        return total_sieges;
    }

    public ResultSet RechercherBus() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "select * from Bus where ville_depart='"
                + this.ville_depart
                + "' and ville_arrivee = '"
                + this.ville_arrivee
                + "' and id_bus in "
                + "(select id_bus from Bus_Frequence where jours_freq = (select DAYNAME('"
                + this.date_depart + "')));";
        ResultSet rs = dbc.ExecuteQuery(query);
        return rs;
    }

    public ResultSet getBusInfo(String bid) {
        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = null;
        String query = "select * from Bus where id_bus='" + bid + "';";

        rs = dbc.ExecuteQuery(query);
        return rs;
    }

    public ResultSet getBusInfo1(int no) {
        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = null;
        String query = null;
        if (no == 1) {
            query = "select distinct(ville_depart) from Bus";
            rs = dbc.ExecuteQuery(query);
        } else if (no == 2) {
            query = "select distinct(ville_arrivee) from Bus";
            rs = dbc.ExecuteQuery(query);
        }
        return rs;
    }

    public boolean SupprimerBus() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "delete from Bus where id_bus='" + this.id_bus + "'";
        int rowsUpdated = dbc.ExecuteUpdate(query);
        dbc.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ModifierBus1() {
        int success = 0;
        ConnexionBD dbc = new ConnexionBD();
        String query = "update Bus set nom_bus='" + nom_bus + "',type_bus='"
                + type_bus + "',heure_depart='" + heure_depart
                + "',duree_voyage='" + duree_voyage + "',ville_depart='"
                + ville_depart + "',ville_arrivee='" + ville_arrivee + "',prix_voyage='"
                + prix_voyage + "',id_compagnie='" + id_compagnie + "',total_sieges='"
                + total_sieges + "' where id_bus='" + id_bus + "';";
        try {
            success = dbc.ExecuteUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                dbc.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (success > 0) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet getVilles() {
        ResultSet rs = null;
        String query = " select distinct ville_depart as ville from Bus union select ville_arrivee as ville from Bus;";
        ConnexionBD dbc = new ConnexionBD();
        rs = dbc.ExecuteQuery(query);
        return rs;
    }
}
