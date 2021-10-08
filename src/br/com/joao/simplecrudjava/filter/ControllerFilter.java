package br.com.joao.simplecrudjava.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.joao.simplecrudjava.action.Action;


public class ControllerFilter implements Filter {

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		String paramAction = request.getParameter("action");

		String className = "br.com.joao.simplecrudjava.action." + paramAction;

		String name = null;

		try {
			Class class1 = Class.forName(className);
			Action action = (Action) class1.newInstance();
			name = action.execute(request, response);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {

			throw new ServletException(e);
		}

		String[] adressType = name.split(":");
		if (adressType[0].equals("forward")) {

			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + adressType[1]);
			rd.forward(request, response);

		} else {
			response.sendRedirect("enter?action=SimplePageForm");
		}

	}

}
