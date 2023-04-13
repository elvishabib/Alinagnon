/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model;

import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.ConnexionBD;

/**
 *
 * @author akadjelvis
 */
public class PaiementModel {

    private String id_paiement;
    private String id_reservation;
    private String montant_total;
    private String date_paiement;
    private String id_compagnie;
    private String total_sieges;
    private String statut;

    public boolean AjouterPaiement() {

        return true;
    }

    public boolean ModifierStatutPaiement() {

        return true;
    }

    public boolean SupprimerPaiement() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "delete from Paiement where id_compagnie='" + this.id_compagnie + "'";
        int rowsUpdated = 0;
        rowsUpdated = dbc.ExecuteUpdate(query);

        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setId_paiement(String id_paiement) {
        this.id_paiement = id_paiement;
    }

    public void setId_reservation(String id_reservation) {
        this.id_reservation = id_reservation;
    }

    public void setMontant_total(String montant_total) {
        this.montant_total = montant_total;
    }

    public void setDate_paiement(String date_paiement) {
        this.date_paiement = date_paiement;
    }

    public void setId_compagnie(String id_compagnie) {
        this.id_compagnie = id_compagnie;
    }

    public void setTotal_sieges(String total_sieges) {
        this.total_sieges = total_sieges;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

}
