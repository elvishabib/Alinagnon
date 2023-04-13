/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.controller;

import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.Validation;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.CompagnieModel;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.UserModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author akadjelvis
 */
public class ModifierProfil extends HttpServlet {

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
            out.println("<title>Servlet ModifierProfil</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ModifierProfil at " + request.getContextPath() + "</h1>");
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

    public ModifierProfil() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String msg = "";
        if (request.getParameter("type") == null) {
            HttpSession session = request.getSession();
            UserModel um = new UserModel();
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String adresse = request.getParameter("adresse");
            String ville = request.getParameter("ville");
            String email = request.getParameter("email");
            String telephone = request.getParameter("telephone");

            um.setNom(nom);
            um.setPrenom(prenom);
            um.setAdresse(adresse);
            um.setVille(ville);
            um.setEmail(email);
            um.setTelephone(telephone);
            um.setId_user(String.valueOf(session.getAttribute("id_user")));
            System.out.println(String.valueOf(session.getAttribute("id_user")));
            msg = Validation.validationUser(nom, prenom, adresse, ville,
                    email, telephone);
            System.out.println("msg=" + msg);
            if (!msg.equals("")) {
                System.out.println("msg=" + msg);
                response.sendRedirect("modifierProfil.jsp?msg=" + msg);
            } else {
                if (um.ModifierProfl()) {
                    msg = "Profil modifie avec succes!";
                } else {
                    msg = "Impossible de modifier le profil!";
                }
                response.sendRedirect("modifierProfil.jsp?msg=" + msg);
            }

        } else {
            HttpSession session = request.getSession();
            CompagnieModel bom = new CompagnieModel();

            String nom = request.getParameter("nom");
            String adresse = request.getParameter("adresse");
            String ville = request.getParameter("ville");
            String email = request.getParameter("email");
            String telephone = request.getParameter("telephone");

            bom.setNom(nom);
            bom.setAdresse(adresse);
            bom.setVille(ville);
            bom.setEmail(email);
            bom.setTelephone(telephone);
            bom.setId_compagnie(String.valueOf(session.getAttribute("id_user")));

            msg = Validation.validationCompagnie(nom, adresse, ville,
                    email, telephone);
            System.out.println("msg=" + msg);
            if (!msg.equals("")) {
                System.out.println("msg=" + msg);
                response.sendRedirect("modifierProfil.jsp?msg=" + msg);
            } else {
                if (bom.ModifierProfilUser()) {
                    msg = "Profil modifie avec succes!";
                } else {
                    msg = "Impossible de modifier le profil!";
                }
                response.sendRedirect("modifierProfil.jsp?msg=" + msg);

            }
        }
    }

}
