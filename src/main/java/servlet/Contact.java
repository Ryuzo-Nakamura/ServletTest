package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Form;


@WebServlet(urlPatterns={"/servlet/contact"})
public class Contact extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		try {
			
			String name = request.getParameter("name");
			String company = request.getParameter("company");
			String mail = request.getParameter("mail");
			String content = request.getParameter("content");
			
			String[] magazines = request.getParameterValues("magazine");
		
			String information = request.getParameter("information");
		
			Form form = new Form();
			form.setName(name);
			form.setCompany(company);
			form.setMail(mail);
			form.setContent(content);
			form.setMagazines(magazines);
			form.setInformation(information);
					
			request.setAttribute("form", form);
		
			if(information.equals("Yes")) {
				request.getRequestDispatcher("../jsp/contact-true.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("../jsp/contact-false.jsp").forward(request, response);
			}
		}catch(Exception e) {
			out.println("不適切な入力がありました。");
		}
	}

}
