/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.controller;

import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.AdminModel;
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
public class ChangerMDP extends HttpServlet {

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
            out.println("<title>Servlet ChangerMDP</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ChangerMDP at " + request.getContextPath() + "</h1>");
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

    public ChangerMDP() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String ancienmdp = request.getParameter("ancienmdp");
        String nouveaumdp = request.getParameter("nouveaumdp");
        String confirmermdp = request.getParameter("confirmermdp");
        String msg = "";

        if (nouveaumdp.equals(confirmermdp)) {
            if (String.valueOf(session.getAttribute("type")).equalsIgnoreCase(
                    "User")) {
                UserModel um = new UserModel();
                um.setId_user(String.valueOf(session.getAttribute("id_user")));
                um.setMdp(nouveaumdp);
                um.setAncienmdp(ancienmdp);

                if (um.ModifierMDP()) {
                    msg = "Changement de mot de passe reussie!";
                } else {
                    msg = "Mot de passe incorrect!";
                }
                response.sendRedirect("changerMDP.jsp?msg=" + msg);
            } else if (String.valueOf(session.getAttribute("type"))
                    .equalsIgnoreCase("Admin")) {
                AdminModel am = new AdminModel();
                am.setMdp(nouveaumdp);
                String uid1 = request.getParameter("email");
                am.setId_user(uid1);
                am.setAncienmdp(ancienmdp);
                System.out.println("changement de mot de passe en cours!");
                if (am.ChangerAdminMDP()) {
                    msg = "Changement de mot de passe reussie!";
                } else {
                    msg = "Mot de passe incorrect!";
                }
                response.sendRedirect("changerMDP.jsp?msg=" + msg);
            } else {
                CompagnieModel bom = new CompagnieModel();
                bom.setEmail(String.valueOf(session.getAttribute("email")));
                bom.setMdp(nouveaumdp);
                bom.setAncienmdp(ancienmdp);
                if (bom.ModifierMDPByEmail()) {
                    msg = "Changement de mot de passe reussie!";
                } else {
                    msg = "Mot de passe incorrect!";
                }
                response.sendRedirect("changerMDP.jsp?msg=" + msg);
            }

        } else {
            msg = "Mots de passe non concordant!";
            response.sendRedirect("changerMDP.jsp?msg=" + msg);
        }
    }

}
