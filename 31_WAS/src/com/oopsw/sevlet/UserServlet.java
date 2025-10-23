package com.oopsw.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user") //servlet 3~ 에서 이름 정의할 때 @WebServlet
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int count;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
    	System.out.println("update UserServlet()" + ++count);
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()" + ++count);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy()" + ++count);
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("service()" + ++count);
		
		PrintWriter out = response.getWriter();
		out.println("server message ok");
		out.flush();
		out.close();
	}

}
