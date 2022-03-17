package services;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ebooks.EBookDAO;
import ebooks.EBookVO;

@WebServlet("/ebooksvc.do")
public class EBookServices extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		EBookDAO ebookDAO = new EBookDAO();

		String svcid = request.getParameter("svcid");
		if(svcid != null) {
			if(svcid.equals("addBook")) {
				// String serial = request.getParameter("serial");
				String serial = null;
				String title  = request.getParameter("title");
				String author = request.getParameter("author");
				String price  = request.getParameter("price");
				String qty    = request.getParameter("qty");
				
				System.out.printf("[ebooksvc] addBook: (%s)(%s)(%s)(%s)(%s)%n", serial, title, author, price, qty);
				EBookVO ebook = new EBookVO(serial, title, author, price, qty);
				ebookDAO.insertBook(ebook);
			}
			else if(svcid.equals("delBook")) {
				String serial = request.getParameter("serial");
				System.out.printf("[ebooksvc] delBook: serial(%s)%n", serial);
		
				if(serial != null && serial.isEmpty() != true) { 
					ebookDAO.deleteBook(serial);
				}
			}
			else if(svcid.equals("editBook")) {
				String serial = request.getParameter("serial");
				String title  = request.getParameter("title");
				String author = request.getParameter("author");
				String price  = request.getParameter("price");
				String qty    = request.getParameter("qty");
			
				System.out.printf("[ebooksvc] editBook: (%s)(%s)(%s)(%s)(%s)%n", serial, title, author, price, qty);
		
				EBookVO ebook = new EBookVO(serial, title, author, price, qty);
				ebookDAO.updateBook(ebook);
			}
		}
		
		List<EBookVO> ebooks = ebookDAO.getBooks();
		
		request.setAttribute("ebooks", ebooks);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ebooks/ebookview.jsp");
		dispatcher.forward(request, response);
		
	}

}
