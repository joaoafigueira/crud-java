package br.com.joao.simplecrudjava.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.joao.simplecrudjava.model.DataBank;
import br.com.joao.simplecrudjava.model.Company;

public class AdminLogin implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
 
		
		DataBank bank = new DataBank();
		Company admin = bank.adminExist(email, password);

		if (admin != null) {

			HttpSession session = request.getSession();
			session.setAttribute("adminLogged", admin);
			return "redirect:enter?action=ManageCompanyForm";
		} else {
			return "redirect:enter?action=AdminForm";
		}

	}

}
