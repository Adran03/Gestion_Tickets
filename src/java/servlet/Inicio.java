/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Control.Controlador;
import Modelo.Curso;
import Negocio.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andre
 */
@WebServlet(name = "Inicio", urlPatterns = {"/Inicio"})
public class Inicio extends HttpServlet {

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
           
            if (request.getParameter("btnEstudiante") != null){
                /*atención al boton de Registro*/
                /*redirecciona al servlet para que despliegue otra pagina*/
                //response.sendRedirect("EstudiantePrincipal.html");
                PrintWriter out = response.getWriter();
                
                out.println("<!DOCTYPE html>"
                        + "<!--"
                        + "To change this license header, choose License Headers in Project Properties."
                        + "To change this template file, choose Tools | Templates"
                        + "and open the template in the editor."
                        + "-->"
                        + "<html>"
                        + "<head>"
                        + "        <title>Bienvenido</title>"
                        + "        <meta charset=\"UTF-8\">"
                        + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                        + "    </head>"
                        + "    <body>"
                        + "        <div>"
                        + "            <h1>"
                        + "                Pantalla principal de Estudiantes"
                        + "            </h1>"
                        + "            <p>"
                        + "                      Bienvenido a la plataforma de tiquetes. Porfavot selecciones un Curso y un profesor para enviar un tiquete"
                        + "                o bien coloque su número de carnet para ver una lista de sus tiquetes enviados."
                        + "            </p>"
                        + "            <form name=\"formEstudiantePrincipal\" action=\"EstudiantePrincipal\" >"
                        + "                <div>"
                        + "                <input type=\"text\" name=\"carnet\">"
                        + "                &nbsp;"
                        + "                <input type=\"submit\" value=\"Buscar\" name=\"btnBuscar\" />"
                        + "                </div>"
                        + "                "
                        + "                <br>"
                        + "                "
                        + "                <div>"
                        + "                <select name=\"Cursos\">");
                Controlador controller = Controlador.getInstance();
                ArrayList<Curso> ac = (ArrayList<Curso>)controller.verCursos();
                for(Curso c : ac){
                    out.println("<option value=\"" + c.getCodigo()+":"+c.getNbr() + "\">" +  c.getCodigo()+":"+c.getNbr() + "</option>");
                }
                
                out.println( "                </select>"
                        + "&nbsp; &nbsp;"
                        + "<input type=\"submit\" value=\"Cargar Profes\" name=\"btnCargar\" />"
                        + "                </div>"
                        + "                <br>"
                        + "                <div>"
                        + "                <select>");
        
                        out.println("</select>"
                        + "                </div>                                   "
                        + "                <br>"
                        + ""
                        + "                <input type=\"submit\" value=\"Ticket Consulta\" name=\"btnTicketC\" />"
                        + "                <input type=\"submit\" value=\"Ticket Revision\" name=\"btnTicketRP\" />"
                        + "                <input type=\"submit\" value=\"Ticket Reclamo\" name=\"btnTicketRE\" />"
                        + "            </form>"
                        + "        </div>"
                        + "    </body>"
                        + "</html>");
                
            }
            else{
                if (request.getParameter("btnProfesor") != null){
                    response.sendRedirect("ProfeLogIn.html");
                }
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
