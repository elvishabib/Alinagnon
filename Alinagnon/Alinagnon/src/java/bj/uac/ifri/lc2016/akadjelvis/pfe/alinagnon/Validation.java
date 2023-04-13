/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon;

import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.controller.Login;

/**
 *
 * @author akadjelvis
 */
public class Validation {

    public static boolean telephone(String telephone) {
        int len = telephone.length();
        if (len == 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean email(String email) {
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if (email.matches(EMAIL_REGEX)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean length(String str, int minLen, int maxLen) {
        if (str.length() > minLen && str.length() < maxLen) {
            return true;
        } else {
            return false;
        }
    }

    public static String validationLogin(String email, String password) {
        String msg = "";
        if (email.equalsIgnoreCase("") || email == null) {
            msg = msg + "L'email ne peut etre vide!\n";
            return msg;
        } else if (password.equalsIgnoreCase("") || password == null) {
            msg = msg + "Le mot de passe ne peut etre vide!\n";
            return msg;
        } else if (!Validation.email(email)) {
            msg = msg + "L'email n'est pas valide!\n";
            return msg;
        } else if (!Validation.length(email, 2, 40)) {
            msg = msg + "L'email doit etre compris entre 3 et 40 characteres!\n";
            return msg;
        } else if (!Validation.length(password, 4, 20)) {
            msg = msg + "Le mot de passe doit etre compris entre 5 et 20 characteres!\n";
            return msg;
        } else {
            return msg;
        }
    }

    public static String validationUser(String nom, String prenom, String adresse, String ville, String email, String telephone) {
        String msg = "";
        if (nom.equalsIgnoreCase("") || nom == null) {
            msg = msg + "Le nom ne peut etre vide!\n";
            return msg;
        } else if (adresse.equalsIgnoreCase("") || adresse == null) {
            msg = msg + "L'adresse ne peut etre vide!\n";
            return msg;
        } else if (ville.equalsIgnoreCase("") || ville == null) {
            msg = msg + "La ville ne peut etre vide!\n";
            return msg;
        } else if (email.equalsIgnoreCase("") || email == null) {
            msg = msg + "L'email ne peut etre vide!\n";
            return msg;
        } else if (telephone.equalsIgnoreCase("") || telephone == null) {
            msg = msg + "Le numero de telephone ne peut etre vide!\n";
            return msg;
        } else if (!Validation.telephone(telephone)) {
            msg = msg + "Le numero de telephone doit etre compose de 8 chiffres!\n";
            return msg;
        } else if (!Validation.email(email)) {
            msg = msg + "L'email n'est pas valide!\n";
            return msg;
        }
        return msg;
    }

    public static String validationCompagnie(String nom, String adresse, String ville, String email, String telephone) {
        String msg = "";
        if (nom.equalsIgnoreCase("") || nom == null) {
            msg = msg + "Le nom ne peut etre vide!\n";
            return msg;
        } else if (adresse.equalsIgnoreCase("") || adresse == null) {
            msg = msg + "L'adresse ne peut etre vide!\n";
            return msg;
        } else if (ville.equalsIgnoreCase("") || ville == null) {
            msg = msg + "La ville ne peut etre vide!\n";
            return msg;
        } else if (email.equalsIgnoreCase("") || email == null) {
            msg = msg + "L'email ne peut etre vide!\n";
            return msg;
        } else if (telephone.equalsIgnoreCase("") || telephone == null) {
            msg = msg + "Le numero de telephone ne peut etre vide!\n";
            return msg;
        } else if (!Validation.telephone(telephone)) {
            msg = msg + "Le numero de telephone doit etre compose de 8 chiffres!\n";
            return msg;
        } else if (!Validation.email(email)) {
            msg = msg + "L'email n'est pas valide!\n";
            return msg;
        }
        return msg;
    }

}
