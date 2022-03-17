package exercises;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ninetimestable2")
public class NineTimesTable2 extends HttpServlet{  
	public void init(){	
		System.out.println("init 메서드 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)                    throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");            
		response.setContentType("text/html;charset=utf-8");  
  
		int times = Integer.parseInt(request.getParameter("times"));
		if(times < 2 || times > 9) {
			invalidTimes(response.getWriter());
			return;
		}
      
      sendResponseFormat(response.getWriter(), times);
   }
   
	static void invalidTimes(PrintWriter out) {
		StringBuffer html = new StringBuffer();
		html.append("<html><body>");
		html.append("<h3>구구단수가 잘못되었습니다.</h3>");
		html.append("<a href='http://localhost:8090/JServlet03/ninetimestable1.html'>구구단수 입력화면으로 이동</a>");
		html.append("</body></html>");
		
		out.print(html);
	}
   
	static void sendResponseFormat(PrintWriter out, int times) {
		out.print("<html><body>");
		out.print(" <table border=1 width=400 align=center>");
		out.print("<tr align=center bgcolor='#ccc'>"); 
		out.print("<td colspan=2>" +  times+ " 단 출력  </td>");
		out.print("</tr>");
		  
		for(int cnt=1; cnt < 10;cnt++){ 
	    	if(cnt % 2 == 0) {
	    		out.print("<tr align=center bgcolor='#fbc'> ");
	    	}
	    	else {
	    		out.print("<tr align=center bgcolor='#bca'> ");
	    	}
			out.print("<td width=200>"); 
			out.print(times+" *  "+ cnt );    
		    out.print("</td>");
			out.print("<td width=200>");
			out.print(cnt*times); 
			out.print("</td>");
			out.print("</tr>");
      	}
		
		out.print("<tr>"); 
		out.print("<td colspan=2 align=center>");
		out.print("<a href='http://localhost:8090/JServlet03/ninetimestable2.html'>구구단수 입력화면으로 이동</a>");
		out.print("</td>");
		out.print("</tr>");
		
      	out.print("</table>");

		out.print("<html><body>");
   }

   public void destroy(){
      System.out.println("destroy 메서드 호출");
   }
}