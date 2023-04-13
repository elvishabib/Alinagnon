/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.controller;

import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.CompagnieModel;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.PaiementModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author akadjelvis
 */
public class SupprimerCompagnie extends HttpServlet {

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
            out.println("<title>Servlet SupprimerCompagnie</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SupprimerCompagnie at " + request.getContextPath() + "</h1>");
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

    public SupprimerCompagnie() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String telephone = request.getParameter("telephone");
        String mdp = request.getParameter("mdp");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String email = String.valueOf(session.getAttribute("email"));

        CompagnieModel model = new CompagnieModel();
        BusModel model1 = new BusModel();
        PaiementModel model2 = new PaiementModel();
        ResultSet rs = null;
        ResultSet rs1 = null;
        model.setEmail(email);
        model.setMdp(mdp);

        try {
            Integer.parseInt(telephone);
        } catch (Exception e) {
            response.sendRedirect("supprimerCompagnie.jsp?msg=Veuillez entrer des valeurs numeriques!");
        }

        try {
            rs = model.Login1();

            if (!rs.next()) {
                response.sendRedirect("supprimerCompagnie.jsp?msg=Informations incorrectes!");
            } else {
                rs.beforeFirst();
                while (rs.next()) {
                    String id_compagnie = rs.getString(1);
                    model2.setId_compagnie(id_compagnie);
                    if (rs.getString(6).equals(telephone)) {

                        boolean resultat = model.SupprimerCompte();
                        System.out.println("Resultat:" + resultat);
                        rs1 = model1.VoirBus();
                        while (rs1.next()) {
                            model1.setId_bus(rs1.getString(1));
                            model1.SupprimerBus();
                        }
                        boolean resultat2 = model2.SupprimerPaiement();
                        System.out.println("Resultat2:" + resultat2);
                        response.sendRedirect("");
                    } else {

                        out.print("Informations incorrectes!");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
