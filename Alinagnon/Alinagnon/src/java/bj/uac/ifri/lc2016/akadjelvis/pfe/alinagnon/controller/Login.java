/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.controller;

import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.Validation;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.AdminModel;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.CompagnieModel;
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
public class Login extends HttpServlet {

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
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
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

    public Login() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String mdp = request.getParameter("mdp");
        String type = request.getParameter("type");
        String msgderreur = Validation.validationLogin(email, mdp);
        if (!msgderreur.equalsIgnoreCase("")) {
            if (type.equalsIgnoreCase("User")) {
                response.sendRedirect("index.jsp?msg=" + msgderreur);
            } else if (type.equalsIgnoreCase("Compagnie")) {
                response.sendRedirect("compagnieLogin.jsp?msg=" + msgderreur);
            } else {
                response.sendRedirect("adminLogin.jsp?msg=" + msgderreur);
            }
        } else if (type.equalsIgnoreCase("Compagnie")) {
            String msg = "";
            CompagnieModel bom = new CompagnieModel();
            bom.setEmail(request.getParameter("email"));
            bom.setMdp(request.getParameter("mdp"));
            try {
                if (bom.Login()) {
                    HttpSession session = request.getSession();
                    session.setAttribute("email", email);
                    session.setAttribute("type", type);
                    String id_user = "";
                    id_user = bom.getIdUserByEmail(email);
                    session.setAttribute("id_user", id_user);
                    response.sendRedirect("indexCompagnie.jsp");
                } else {
                    msg = msg + "E-mail ou mot de passe incorrecte!";
                    response.sendRedirect("compagnieLogin.jsp?msg=" + msg);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (type.equalsIgnoreCase("Admin")) {

            AdminModel am = new AdminModel();
            am.setId_user(email);
            am.setMdp(mdp);
            Boolean login = false;
            try {
                login = am.AdminLogin();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (login == true) {
                HttpSession session = request.getSession();
                session.setAttribute("email", email);
                session.setAttribute("id_user", email);
                session.setAttribute("type", type);
                response.sendRedirect("indexAdmin.jsp");
            } else {
                String msg = "E-mail ou mot de passe incorrecte!";
                response.sendRedirect("index.jsp?msg=" + msg);
            }

        } else if (type.equalsIgnoreCase("User")) {
            UserModel um = new UserModel();
            um.setEmail(email);
            um.setMdp(mdp);
            Boolean login = false;
            try {
                login = um.Login1();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (login == true) {
                HttpSession session = request.getSession();
                session.setAttribute("email", email);
                session.setAttribute("type", type);
                String id_user = "";
                try {
                    id_user = um.getIdUserByAmin(email);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                session.setAttribute("id_user", id_user);
                response.sendRedirect("indexUser.jsp");
            } else {
                String msg = "E-mail ou mot de passe incorrecte!";
                response.sendRedirect("index.jsp?msg=" + msg);
            }
        }
    }

}
