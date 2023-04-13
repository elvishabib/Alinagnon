/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.controller;

import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.UserModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author akadjelvis
 */
public class AjouterUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
 /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AjouterUser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AjouterUser at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 /*@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 /*@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
 /*@Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>*/
    private static final long serialVersionUID = 1L;

    public AjouterUser() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String mdp = request.getParameter("mdp");
        String confirmermdp = request.getParameter("confirmermdp");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String ville = request.getParameter("ville");
        String telephone = request.getParameter("telephone");
        String adresse = request.getParameter("adresse");
        String sq = request.getParameter("sq");
        String sa = request.getParameter("sa");
        UserModel um = new UserModel();
        um.setEmail(email);
        um.setMdp(mdp);
        um.setNom(nom);
        um.setPrenom(prenom);
        um.setVille(ville);
        um.setAdresse(adresse);
        um.setTelephone(telephone);
        um.setSecQst(sq);
        um.setSecAns(sa);

        try {
            if (um.AjouterUser()) {
                System.out.println(email + "::Inscription realise avec succes! Auto connexion...");
                Boolean login = false;
                try {
                    login = um.Login1();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (login == true) {
                    HttpSession session = request.getSession();
                    session.setAttribute("email", email);
                    session.setAttribute("type", "User");
                    String id_user = "";
                    try {
                        id_user = um.getIdUserByAmin(email);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    session.setAttribute("id_user", id_user);
                    System.out.println(id_user + " : connecté!");
                    response.sendRedirect("indexUser.jsp");
                }
            } else {
                System.out.println(email + "::Echec de l'inscription!");
                String msg = "Echec de l'inscription! Veuillez reessayer un peu plus tard!";
                response.sendRedirect("ajouterUser.jsp?msg=" + msg);
            }
        } catch (SQLException e) {
            System.out.println(email + "::Echec de l'inscription à cause d'une exception!");
            String msg = "Echec de l'inscription! Veuillez reessayer un peu plus tard!";
            response.sendRedirect("ajouterUser.jsp?msg=" + msg);
        }

    }
}
