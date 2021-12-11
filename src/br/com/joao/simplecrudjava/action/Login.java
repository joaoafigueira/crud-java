package br.com.joao.simplecrudjava.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.joao.simplecrudjava.model.DataBank;
import br.com.joao.simplecrudjava.model.Company;

public class Login implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		DataBank bank = new DataBank();
		Company company = bank.userExist(email, password);

		if (company != null) {

			HttpSession session = request.getSession();

			session.setAttribute("companyLogged", company);

			return "redirect:enter?action=SimplePageForm";
		} else {
			return "redirect:enter?action=LoginForm";
		}

	}

}
