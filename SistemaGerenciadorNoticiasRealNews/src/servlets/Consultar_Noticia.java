package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Noticia;
import service.NoticiaService;


@WebServlet("/Consultar_Noticia.do")
public class Consultar_Noticia extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id_noticia"));
		
		Noticia noticia = new Noticia();
		noticia.setId(id);
		
		NoticiaService noticiaService = new NoticiaService();
		Noticia noticiaConsultada = noticiaService.consultar(id);
		
		//PrintWriter saida = response.getWriter();
		//saida.println(noticiaConsultada);		

		HttpSession sessao = request.getSession();
		
		sessao.setAttribute("noticiaConsultada", noticiaConsultada);
		
		response.sendRedirect("Noticias.do");
		
	}

}
