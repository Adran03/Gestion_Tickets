/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andre
 */
@WebServlet(name = "Registrar", urlPatterns = {"/Registrar"})
public class Registrar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("btnIngresar") != null){
                /*atención al boton de Registro*/
                /*redirecciona al servlet para que despliegue otra pagina*/
                //response.sendRedirect("ProfePrincipal.html");
                PrintWriter out = response.getWriter();
                
                out.println("<!DOCTYPE html>\n" +
"<!--\n" +
"To change this license header, choose License Headers in Project Properties.\n" +
"To change this template file, choose Tools | Templates\n" +
"and open the template in the editor.\n" +
"-->\n" +
"<html>\n" +
"    <head>\n" +
"        <title>Pantalla Principal</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"            <h1>\n" +
"                Cursos\n" +
"            </h1>\n" +
"            <form name=\"formProfePrincipal\" action=\"ProfePrincipal\" >\n" +
"                \n" +
"                <input type=\"submit\" value=\"Configuración\" name=\"btnConfiguracion\" />\n" +
"                \n" +
"                <br>\n" +
"                <br>\n" +
"                \n" +
"               <br>"
                        + "<div>"
                        + "<select name=\"Cursos\">");
                
                
                
                out.println( "                </select>" +
                        "                </div>"+
"                \n" +
"                <br>\n" +
"                \n" +
"                <input type=\"submit\" value=\"Ticktes\" name=\"btnTickets\" />\n" +
"                &nbsp;\n" +
"                <input type=\"submit\" value=\"Ticktes por Curso\" name=\"btnTicketsCurso\" />\n" +
"                &nbsp;\n" +
"                <input type=\"submit\" value=\"Salir\" name=\"btnSalir\" />\n" +
"   \n" +
"            </form>\n" +
"    </body>\n" +
"</html>\n" +
"");
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
    @Override
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
