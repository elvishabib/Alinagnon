/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tmplate file, choose Tools | Templates
 * and open the tmplate in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config;

import java.sql.ResultSet;

/**
 *
 * @author akadjelvis
 */
public class GenerateurID {

    public String GenererID(String col, String table) {
        String id = null;
        String tmp = null;
        String tmp1 = null;
        String rej = table;
        String rep = "";
        int num;
        int max = 0;
        String table1;
        ConnexionBD dbc = new ConnexionBD();
        ResultSet rs = null;

        String query = "select " + col + " from " + table + " order by "
                + col;
        try {
            rs = dbc.ExecuteQuery(query);
            while (rs.next()) {
                tmp = rs.getString(1);
                tmp1 = tmp.replaceAll(rej, rep);
                num = Integer.parseInt(tmp1);
                if (num > max) {
                    max = num;
                }

            }
            dbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (tmp == null) {
            id = table;
            id += "1";
        } else {

            max = max + 1;
            id = table + max;

        }
        return id;
    }
}
