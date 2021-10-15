package br.com.joao.simplecrudjava.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.joao.simplecrudjava.model.Company;
import br.com.joao.simplecrudjava.model.DataBank;
import br.com.joao.simplecrudjava.model.User;

public class Login implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		DataBank bank = new DataBank();
		User user = bank.userExist(email, password);

		if (user != null) {

			HttpSession session = request.getSession();

			session.setAttribute("userLogged", user);
			return "redirect:enter?action=SimplePageForm";
		} else {
			return "redirect:entrada?acao=LoginForm";
		}

	}

}
