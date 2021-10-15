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
		boolean usernotLogged = (session.getAttribute("companyLogged") == null);
		boolean protectAction = !(actionParam.equals("Login") || actionParam.equals("LoginForm") || actionParam.equals("NewCompanyForm") || actionParam.equals("NewCompany")); //todas as ações que não login e login form são protegidas
		
		if(protectAction && usernotLogged) {
			response.sendRedirect("enter?action=LoginForm");
			return;
		}
		
		
		
		chain.doFilter(request, response);
	}

	

}
