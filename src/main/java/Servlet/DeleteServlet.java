package Servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BookService.BookService;
import Model.DbDetails;

public class DeleteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		ServletContext context= getServletContext();
		String url= context.getInitParameter("url");
		String username= context.getInitParameter("username");
		String pwd= context.getInitParameter("pwd");
		DbDetails d1= new DbDetails(url, username, pwd);
		int bookid= Integer.parseInt(arg0.getParameter("id"));
		BookService b1= new BookService();
		String r= b1.deleteBook(bookid,d1);
		arg0.setAttribute("a", r);
		arg0.getRequestDispatcher("DeleteResponse.jsp").forward(arg0, arg1);
	}

}
