package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.NoticiaService;
import model.Noticia;

@WebServlet("/Lista_Noticia.do")
public class Lista_Noticia extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		NoticiaService noticiaService = new NoticiaService();
		
		ArrayList<Noticia> listaNoticias = noticiaService.listarNoticias();
		
		response.setContentType("text/html");
		
		PrintWriter saida = response.getWriter();
		saida.println("Lista de Notícias:  " + "<br>");
		
		listaNoticias.forEach(n -> {
			
			saida.println("- ID:  " + n.getId() + "<br>");
			saida.println("- Descrição:  " + n.getDescricao() + "<br>");
			saida.println("- Titulo:  " + n.getTitulo() + "<br>");
			saida.println("- Texto:  " + n.getTexto() + "<br>");
			saida.println("<br>");
			
		});
		
		
	
	}
}
