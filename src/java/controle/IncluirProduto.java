
package controle;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Produto;
import modelo.Tipo;
import persistencia.ProdutoDao;

/**
 *
 * @author Maq-01
 */
public class IncluirProduto extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher view = null;
        ProdutoDao dao;
        Produto p;
        try {
           dao = new ProdutoDao();
           p = new Produto();
           p.setCodigo(Integer.parseInt(request.getParameter("txtCodigo")));
           p.setValor(Double.parseDouble(request.getParameter("txtValor")));
           p.setDescricao(request.getParameter("txtDescricao"));
           final String tipoTela = request.getParameter("sltTipo");
           if(Tipo.ESTOQUE.name().equals(tipoTela)){
             p.setTipo(Tipo.ESTOQUE);  
           }else{
               p.setTipo(Tipo.MOSTRUARIO);
           }
           
           dao.incluir(p);
           request.setAttribute("produto", p);
           view = request.getRequestDispatcher("sucessoIncluir.jsp");
        }catch(Exception e){
           view = request.getRequestDispatcher("erroIncluir.jsp");
        }finally{
           view.forward(request, response); 
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
