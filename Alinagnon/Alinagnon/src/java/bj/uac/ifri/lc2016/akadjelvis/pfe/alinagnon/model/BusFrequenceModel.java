/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model;

import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.ConnexionBD;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config.GenerateurID;

/**
 *
 * @author akadjelvis
 */
public class BusFrequenceModel {

    private String id_bus_freq;
    private String id_bus;
    private String jours_freq;
    int rowsUpdatedtemp;

    public void setId_bus_freq(String id_bus_freq) {
        this.id_bus_freq = id_bus_freq;
    }

    public void setId_bus(String id_bus) {
        this.id_bus = id_bus;
    }

    public void setJours_freq(String jours_freq) {
        this.jours_freq = jours_freq;
    }

    public void setRowsUpdatedtemp(int rowsUpdatedtemp) {
        this.rowsUpdatedtemp = rowsUpdatedtemp;
    }

    public boolean AjouterJourBus() {
        GenerateurID idg = new GenerateurID();

        char temp;
        int rowsUpdated = 0;
        int i;
        String query = "";
        for (i = 0; i < jours_freq.length(); i++) {
            ConnexionBD dbc = new ConnexionBD();
            this.id_bus_freq = idg.GenererID("id_bus_freq", "Bus_Frequence");

            temp = jours_freq.charAt(i);
            String day = "";
            switch (temp) {
                case 'S': {
                    day = "Sunday";
                    break;
                }
                case 'M': {
                    day = "Monday";
                    break;
                }
                case 'T': {
                    day = "Tuesday";
                    break;
                }
                case 'W': {
                    day = "Wednesday";
                    break;
                }
                case 'H': {
                    day = "Thursday";
                    break;
                }
                case 'F': {
                    day = "Friday";
                    break;
                }
                case 'A': {
                    day = "Saturday";
                    break;
                }
                default:
                    day = "error";
            }
            query = "insert into Bus_Frequence values ('" + this.id_bus_freq + "', '" + id_bus + "', '" + day + "');";
            try {
                rowsUpdatedtemp = dbc.ExecuteUpdate(query);
                rowsUpdated = rowsUpdated + rowsUpdatedtemp;
                dbc.close();

            } catch (Exception e) {
                System.out.println("Exception:" + e.getMessage());
            }

        }

        if (rowsUpdated > 0) {

            return true;
        } else {
            return false;
        }

    }

    public boolean ModifierJourBus() {
        ConnexionBD dbc = new ConnexionBD();

        boolean result;
        String query = "delete from Bus_Frequence where id_bus ='" + this.id_bus + "'";

        try {
            dbc.ExecuteUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        result = AjouterJourBus();

        return result;

    }

    public boolean SupprimerJourBus() {
        ConnexionBD dbc = new ConnexionBD();
        String query = "delete from Bus_Frequence where id_bus='" + this.id_bus + "'";
        int rowsUpdated = dbc.ExecuteUpdate(query);
        dbc.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }
}
