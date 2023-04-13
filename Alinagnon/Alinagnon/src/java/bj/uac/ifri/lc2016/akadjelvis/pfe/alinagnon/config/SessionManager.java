/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.config;

import java.sql.SQLException;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.SessionManagerModel;

/**
 *
 * @author akadjelvis
 */
public class SessionManager {

    public static String id_user;
    public static String email_user;
    public static String tel_user;

    public SessionManager() {
        SessionManager.id_user = "";
        SessionManager.email_user = "";
        SessionManager.tel_user = "";
    }

    public static void setSession(String email, String who) throws SQLException {
        SessionManager.email_user = email;
        if (who.equalsIgnoreCase("User")) {
            SessionManagerModel sm = new SessionManagerModel();
            sm.getIdUser(email);
        } else {
            SessionManagerModel sm = new SessionManagerModel();
            sm.getIdCompagnie(email);
        }
    }

    public static void setId_user(String id_user) {
        SessionManager.id_user = id_user;
    }

    public static void setEmail_user(String email_user) {
        SessionManager.email_user = email_user;
    }

    public static void setTel_user(String tel_user) {
        SessionManager.tel_user = tel_user;
    }

}
