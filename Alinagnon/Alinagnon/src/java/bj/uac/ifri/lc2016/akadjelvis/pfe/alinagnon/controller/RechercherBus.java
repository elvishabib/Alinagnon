/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the ediarriveer.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.controller;

import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author akadjelvis
 */
public class RechercherBus extends HttpServlet {

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
            out.println("<title>Servlet RechercherBus</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RechercherBus at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <ediarriveer-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left arrivee edit the code.">
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
    }// </ediarriveer-fold>*/
    private static final long serialVersionUID = 1L;

    public RechercherBus() {
        super();

    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        ResultSet rs = null;
        BusModel bm = new BusModel();
        String ville_depart = request.getParameter("depart");
        String ville_arrivee = request.getParameter("arrivee");
        String date_depart = request.getParameter("date_depart");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d2 = new Date();
        try {
            d2 = sdf.parse(date_depart);
        } catch (Exception e) {

        }
        Date d1 = new Date();

        if (d1.equals(d2) || d1.before(d2)) {

            bm.setVille_depart(ville_depart);
            bm.setDate_depart(date_depart);
            bm.setVille_arrivee(ville_arrivee);
            rs = bm.RechercherBus();

            try {
                rs.last();
                int count = 0;
                count = rs.getRow();
                if (count <= 0) {
                    String msg = "Aucun bus entre " + ville_depart + " et "
                            + ville_arrivee + "!";
                    HttpSession session = request.getSession();
                    if (session.getAttribute("type") == null) {
                        response.sendRedirect("index.jsp?msg=" + msg);
                    } else {
                        response.sendRedirect("rechercheBus.jsp?msg=" + msg);
                    }
                } else {
                    rs.beforeFirst();
                    RequestDispatcher disp = request
                            .getRequestDispatcher("getResultatsRecherche.jsp");
                    request.setAttribute("Date", request.getParameter("date_depart"));
                    request.setAttribute("InfoBus", rs);
                    System.out.println("résultats pour la recherche");
                    disp.forward(request, response);
                }
            } catch (Exception e) {
                String msg = "Aucun bus entre " + ville_depart + " et "
                        + ville_arrivee + "!";
                HttpSession session = request.getSession();
                System.out.println("Aucun résultats");
                if (session.getAttribute("type") == null) {
                    response.sendRedirect("index.jsp?msg=" + msg);
                } else {
                    response.sendRedirect("rechercheBus.jsp?msg=" + msg);

                }

            }
        } else {
            HttpSession session = request.getSession();
            String msg = "Selectionnez une date correcte!";
            if (session.getAttribute("type") == null) {
                response.sendRedirect("index.jsp?msg=" + msg);
            } else {
                response.sendRedirect("rechercheBus.jsp?msg=" + msg);

            }
        }
    }

}
