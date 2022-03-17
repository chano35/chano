package jservlet02;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/school2")
public class School2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		Enumeration<String> school = request.getParameterNames();

		while (school.hasMoreElements()) {
			String name = (String) school.nextElement();
			String[] values = request.getParameterValues(name);

			System.out.println("[요청목록]");

			for (String value : values) {
				System.out.printf("이름(%s), 목록(%s) %n ", name, value);
			}
		}

	}
}
