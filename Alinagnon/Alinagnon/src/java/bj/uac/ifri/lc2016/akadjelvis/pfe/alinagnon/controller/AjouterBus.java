/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.controller;

import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.RetournerClass;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusFrequenceModel;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel;
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
public class AjouterBus extends HttpServlet {

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
            out.println("<title>Servlet AjouterBus</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AjouterBus at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }*/
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

    public AjouterBus() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // PrintWriter out=response.getWriter();
        BusModel model = new BusModel();
        BusFrequenceModel model1 = new BusFrequenceModel();
        HttpSession session = request.getSession();
        RetournerClass obj = new RetournerClass();
        boolean obj1;
        String jours_voyages;
        StringBuffer sb = new StringBuffer("");
        String type_bus;
        Boolean b = false;

        if (request.getParameter("jours_voyages1") != null) {
            sb.append(request.getParameter("jours_voyages1"));
            b = true;
        }
        if (request.getParameter("jours_voyages2") != null) {
            sb.append(request.getParameter("jours_voyages2"));
            b = true;
        }
        if (request.getParameter("jours_voyages3") != null) {
            sb.append(request.getParameter("jours_voyages3"));
            b = true;
        }
        if (request.getParameter("jours_voyages4") != null) {
            sb.append(request.getParameter("jours_voyages4"));
            b = true;
        }
        if (request.getParameter("jours_voyages5") != null) {
            sb.append(request.getParameter("jours_voyages5"));
            b = true;
        }
        if (request.getParameter("jours_voyages6") != null) {
            sb.append(request.getParameter("jours_voyages6"));
            b = true;
        }
        if (request.getParameter("jours_voyages7") != null) {
            sb.append(request.getParameter("jours_voyages7"));
            b = true;
        }

        if (!b) {
            response.sendRedirect("ajouterBus.jsp?msg=Selectionner au moins un jour de voyage!");
        }

        type_bus = request.getParameter("type_bus");
        jours_voyages = new String(sb);
        model.setNom_bus(request.getParameter("nom_bus"));
        model.setType_bus(type_bus);
        model.setVille_depart(request.getParameter("ville_depart"));
        model.setVille_arrivee(request.getParameter("ville_arrivee"));
        model.setHeure_depart(request.getParameter("heure_depart"));
        model.setDuree_voyage(request.getParameter("duree_voyage"));
        try {
            model.setPrix_voyage(Float.parseFloat(request.getParameter("prix_voyage")));
            model.setTotal_sieges(Integer.parseInt(request.getParameter("sieges")));
        } catch (Exception e) {
            response.sendRedirect("ajouterBus.jsp?msg=Veuillez entrer des valeurs numeriques!");
        }
        model.setId_compagnie(String.valueOf(session.getAttribute("id_user")));
        String date_depart = request.getParameter("");
        model.setDate_depart(date_depart);

        obj = model.InsererBus();

        if (!obj.getS().equals("")) {
            model1.setId_bus(obj.getS());
            model1.setJours_freq(jours_voyages);

            try {
                obj1 = model1.AjouterJourBus();
                if (obj1) {
                    response.sendRedirect("indexCompagnie.jsp?msg=Bus ajoute avec succes!");
                } else {

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            PrintWriter out = response.getWriter();
            out.print("Erreur");
        }

    }
}
