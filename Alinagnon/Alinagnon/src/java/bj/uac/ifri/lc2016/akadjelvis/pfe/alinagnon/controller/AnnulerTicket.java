/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.controller;

import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.ReservationModel;
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
public class AnnulerTicket extends HttpServlet {

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
            out.println("<title>Servlet AnnulerTicket</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AnnulerTicket at " + request.getContextPath() + "</h1>");
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

    public AnnulerTicket() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ReservationModel model = new ReservationModel();
        HttpSession session = request.getSession();
        if (session.getAttribute("type") != null) {
            String bid = request.getParameter("id_reservation");

            if (bid == null) {
                response.sendRedirect("annulerTicket.jsp?msg=Le No de reservation ne peut etre nul");
            }

            model.setId_reservation(bid);
            System.out.println("id_reservation:" + request.getParameter("id_reservation"));
            model.setId_user(String.valueOf(session.getAttribute("id_user")));
            System.out.println("id_user:" + session.getAttribute("id_user").toString());
            int i = model.SupprimerReservationUser();
            if (i > 0) {
                response.sendRedirect("annulerTicket.jsp?msg=Reservation annuler avec succes!");
            } else {
                response.sendRedirect("annulerTicket.jsp?msg=Aucune reservation a ce No!");
            }
        } else {
            String bid = request.getParameter("id_reservation");
            model.setId_reservation(bid);
            model.setId_user(request.getParameter("email"));
            int i = model.SupprimerReservationInvite();
            if (i > 0) {
                response.sendRedirect("annulerTicket.jsp?msg=Reservation annuler avec succes");
            } else {
                response.sendRedirect("annulerTicket.jsp?msg=Aucune reservation a ce No");
            }
        }
    }

}
