package br.com.joao.simplecrudjava.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter("/enter")
public class FilterAutorization implements Filter {


	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
	
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String actionParam = request.getParameter("action");
		
		HttpSession session = request.getSession();
		boolean userNotLogged = (session.getAttribute("companyLogged") == null);
		boolean adminNotLogged = (session.getAttribute("adminLogged") == null);
		boolean protectAction = !(actionParam.equals("Login") || actionParam.equals("LoginForm") || actionParam.equals("NewCompanyForm") || actionParam.equals("NewCompany") || actionParam.equals("AdminForm") || actionParam.equals("AdminLogin")); //every action that is not this are protected
		
		if(protectAction && userNotLogged && adminNotLogged) {
			response.sendRedirect("enter?action=LoginForm");
			return;
		}
		
		
		
		chain.doFilter(request, response);
	}

	

}
