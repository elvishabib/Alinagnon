/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.controller;

import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.ReservationModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class ReserverTicket extends HttpServlet {

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
            out.println("<title>Servlet ReserverTicket</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ReserverTicket at " + request.getContextPath() + "</h1>");
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

    public ReserverTicket() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        ReservationModel model = new ReservationModel();
        HttpSession session = request.getSession();
        if (!String.valueOf(session.getAttribute("type")).equals("User")) {
            model.setId_bus(request.getParameter("id_bus"));
            model.setDate_depart(request.getParameter("date_depart"));
            model.setHeure_depart(request.getParameter("heure_depart"));
            if (session.getAttribute("id_user") == null) {
                model.setId_user(request.getParameter("email"));
            } else {
                model.setId_user(String.valueOf(session.getAttribute("email")));
            }

            String id_reservation = "";
            try {

                id_reservation = model.AjouterReservationInvite(request
                        .getParameter("sieges"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (!id_reservation.equals("")) {
                if (session.getAttribute("id_user") == null) {
                    ResultSet rs = null;
                    ReservationModel bm = new ReservationModel();
                    bm.setId_reservation(id_reservation);
                    String email = request.getParameter("email");

                    bm.setId_user(email);
                    rs = bm.getInfoReservation("User", "");

                    RequestDispatcher rd = request
                            .getRequestDispatcher("imprimerTicket.jsp");
                    request.setAttribute("ticket", rs);
                    rd.forward(request, response);

                } else {
                    response.sendRedirect("getReservationInfo.jsp?msg=Succes de la reservation");
                }
            } else {
                PrintWriter out = response.getWriter();
                out.print("Erreur");
            }
        } else {
            model.setId_bus(request.getParameter("id_bus"));
            model.setDate_depart(request.getParameter("date_depart"));
            model.setHeure_depart(request.getParameter("heure_depart"));
            String email = String.valueOf(session.getAttribute("id_user"));
            model.setId_user(email);
            String id_reservation = "";

            try {
                id_reservation = model.AjouterReservationInvite(request
                        .getParameter("sieges"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (!id_reservation.equals("")) {
                PrintWriter out = response.getWriter();
                response.sendRedirect("getReservationInfo.jsp?msg=Succes de la reservation");
            } else {
                PrintWriter out = response.getWriter();
                out.print("Erreur");
            }

        }
    }

}
