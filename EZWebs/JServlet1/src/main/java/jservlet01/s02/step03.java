package jservlet01.s02;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class step03
 */
@WebServlet("/step03")
public class step03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int count;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public step03() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("[step03]");
    }
    
    @Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("[step03] init...");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.printf("[step03] deGet() : count(%d)\n", this.count++);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
