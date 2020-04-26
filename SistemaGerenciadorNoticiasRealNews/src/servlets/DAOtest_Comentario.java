package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ComentarioDAO;
import model.Comentario;


@WebServlet("/DAOtest_Comentario.do")
public class DAOtest_Comentario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Comentario c = new Comentario(8, "Darah", "Reportagem muito legal.", 1);
		
		ComentarioDAO cDAO = new ComentarioDAO();
		cDAO.inserir(c);
		
	}

}
