package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Noticia;
import service.NoticiaService;


@WebServlet("/Excluir_Noticia.do")
public class Excluir_Noticia extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id_noticia"));
		
		NoticiaService noticiaService = new NoticiaService();
		
		Noticia noticia = new Noticia();
		noticia.setId(id);		
		noticiaService.excluir(noticia);
		
		PrintWriter saida = response.getWriter();
		saida.println("A notícia de ID " + id + " foi excluída." );
	}

}
