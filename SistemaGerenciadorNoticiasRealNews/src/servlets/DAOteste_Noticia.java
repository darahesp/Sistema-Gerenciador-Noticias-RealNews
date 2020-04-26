package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NoticiaDAO;
import model.Noticia;


@WebServlet("/DAOteste_Noticia.do")
public class DAOteste_Noticia extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Teste de inserção:
		Noticia n = new Noticia(1, "Sobre gatos malhados.", "Gatos Malhados", "Os gatos malhados costuma ter listra verticais de cores diversificadas, sua melhor fase é quando "
				+ "criança com 2 anos de vida, com muita disposição, esse gatinho deixa seus donos de cabelos em pé.");
		
		NoticiaDAO nDAO = new NoticiaDAO();
		nDAO.inserir(n);
		
		
	}

}
