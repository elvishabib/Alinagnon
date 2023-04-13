/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.ConnexionBD;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.GenerateurID;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.SessionManager;

/**
 *
 * @author akadjelvis
 */
public class ReservationModel {

    private String id_reservation;
    private String id_user;
    private String id_bus;
    private String date_depart;
    private String heure_depart;
    private String total_sieges;

    public void setId_reservation(String id_reservation) {
        this.id_reservation = id_reservation;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public void setId_bus(String id_bus) {
        this.id_bus = id_bus;
    }

    public void setDate_depart(String date_depart) {
        this.date_depart = date_depart;
    }

    public void setHeure_depart(String heure_depart) {
        this.heure_depart = heure_depart;
    }

    public void setTotal_sieges(String total_sieges) {
        this.total_sieges = total_sieges;
    }

    public String AjouterReservationInvite(String total_sieges1) throws SQLException {
        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = null;
        String time = null;
        GenerateurID generate = new GenerateurID();
        this.id_reservation = generate.GenererID("id_reservation", "Reservation");

        String query = "select heure_depart from Bus where id_bus = '"
                + this.id_bus + "'";
        Date d1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String query1 = "insert into Reservation values('" + this.id_reservation + "','"
                + this.id_user + "','" + this.id_bus + "','" + this.date_depart
                + "','" + this.heure_depart + "');";
        dbc.ExecuteUpdate(query1);
        dbc.close();
        this.total_sieges = total_sieges1;
        GenerateurID idg = new GenerateurID();
        int i = 0;
        int sieges_disponibles = 0;
        String query5 = "select (total_sieges-sieges_reserves) as sieges_disponibles,sieges_reserves,total_sieges from (select count(*) as sieges_reserves from Sieges_Allocation natural join Reservation where id_bus='" + this.id_bus + "' and date_depart='" + this.date_depart + "')t1 inner join (select total_sieges from Bus where id_bus='"
                + this.id_bus + "')t2";

        ConnexionBD dbc6 = new ConnexionBD();
        ResultSet rs123 = dbc6.ExecuteQuery(query5);
        while (rs123.next()) {
            sieges_disponibles = rs123.getInt(1);
        }
        dbc6.close();

        int numRows = 0;
        if ((sieges_disponibles - Integer.parseInt(total_sieges)) >= 0) {
            ConnexionBD dbc8 = new ConnexionBD();
            numRows = dbc8.ExecuteUpdate(query1);
            dbc8.close();
            for (i = 0; i < Integer.parseInt(total_sieges); i++) {

                String id_siege = idg.GenererID("id_siege", "Sieges_Allocation");
                String query2 = "insert into Sieges_Allocation values('" + id_siege
                        + "','" + this.id_reservation + "','" + this.id_bus
                        + "');";
                ConnexionBD dbc1 = new ConnexionBD();
                dbc1.ExecuteUpdate(query2);
                dbc1.close();
            }

            ResultSet rs1 = null;
            ConnexionBD dbc1 = new ConnexionBD();
            String query4 = "select * from Bus where id_bus='" + this.id_bus
                    + "';";
            rs1 = dbc1.ExecuteQuery(query4);

            int montant = 0;
            String id_compagnie = "";
            while (rs1.next()) {
                montant = rs1.getInt(8);
                id_compagnie = rs1.getString(9);
            }
            montant = montant * Integer.parseInt(total_sieges);
            String id_paiement = idg.GenererID("id_paiement", "Paiement");
            String query3 = "insert into Paiement values('" + id_paiement + "','"
                    + this.id_reservation + "'," + montant + ",default,'"
                    + id_compagnie + "'," + total_sieges + ",default);";
            ConnexionBD dbc2 = new ConnexionBD();
            dbc2.ExecuteUpdate(query3);
            String id = "";
            dbc2.close();
            dbc1.close();
        }
        return this.id_reservation;
    }

    public int SupprimerReservationUser() {
        String query = "delete from Reservation where id_user='" + this.id_user
                + "' and id_reservation ='" + this.id_reservation + "';";
        ConnexionBD dbc = new ConnexionBD();
        int numRows = dbc.ExecuteUpdate(query);
        dbc.close();

        return numRows;
    }

    public int SupprimerReservationInvite() {
        String query = "delete from Reservation where id_user='" + this.id_user
                + "' and id_reservation ='" + this.id_reservation + "';";
        ConnexionBD dbc = new ConnexionBD();
        int numRows = dbc.ExecuteUpdate(query);
        dbc.close();

        return numRows;
    }

    public ResultSet VoirReservationBus(String compagnie) {
        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = null;
        String id = SessionManager.id_user;
        String query = " select count(*) as nbre_sieges_reserves,id_bus,date_depart,"
                + "heure_depart from Sieges_Allocation natural join Reservation "
                + " where id_bus='"
                + this.id_bus
                + "' "
                + " order by date_depart;";
        rs = dbc.ExecuteQuery(query);
        try {
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dbc.close();
        return rs;
    }

    public String getTotal_sieges() {
        return total_sieges;
    }

    public ResultSet getInfoReservation(String type, String id_compagnie) {
        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = null;
        String query = "";
        if (type.equalsIgnoreCase("Compagnie")) {
            query = "select id_reservation,id_bus,id_user,"
                    + "date_depart,heure_depart, count(id_siege) as nbre_sieges"
                    + " from Reservation natural join Sieges_Allocation "
                    + " where id_bus in (select id_bus from Bus where id_compagnie='"
                    + id_compagnie + "')" + " group by id_reservation having id_reservation='"
                    + this.id_reservation + "' " + "; ";
        } else {
            query = "select id_reservation,id_bus,id_user,"
                    + "date_depart,heure_depart, count(id_siege) as nbre_sieges"
                    + " from Reservation natural join Sieges_Allocation "
                    + " where id_user ='" + this.id_user + "' "
                    + " group by id_reservation having id_reservation='" + this.id_reservation
                    + "' " + "; ";
        }
        rs = dbc.ExecuteQuery(query);

        return rs;
    }
}
