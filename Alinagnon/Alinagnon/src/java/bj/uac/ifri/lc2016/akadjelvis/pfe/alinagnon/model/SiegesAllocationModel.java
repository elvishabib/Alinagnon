/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model;

/**
 *
 * @author akadjelvis
 */
public class SiegesAllocationModel {

    private String id_siege;
    private String id_reservation;
    private String id_bus;

    public boolean AjouterSieges() {
        String query = "insert into ";
        return true;
    }

    public void setId_siege(String id_siege) {
        this.id_siege = id_siege;
    }

    public void setId_reservation(String id_reservation) {
        this.id_reservation = id_reservation;
    }

    public void setId_bus(String id_bus) {
        this.id_bus = id_bus;
    }

}
