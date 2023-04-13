/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel;

/**
 *
 * @author akadjelvis
 */
public class Suggestion {

    private int totalVilles;
    private List<String> villes;

    public Suggestion() throws SQLException {
        ResultSet rs = getValues();
        villes = new ArrayList<String>();
        while (rs.next()) {
            villes.add(rs.getString(1));
        }
        totalVilles = villes.size();
    }

    public ResultSet getValues() {
        ResultSet rs = null;
        BusModel bm = new BusModel();
        rs = bm.getVilles();
        return rs;
    }

    public List<String> getData(String query) {
        String city = null;
        query = query.toLowerCase();
        List<String> matched = new ArrayList<String>();
        for (int i = 0; i < totalVilles; i++) {
            city = villes.get(i).toLowerCase();
            if (city.startsWith(query)) {
                matched.add(villes.get(i));
            }
        }
        return matched;
    }
}
