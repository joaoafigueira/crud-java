package br.com.joao.simplecrudjava.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.joao.simplecrudjava.model.Company;
import br.com.joao.simplecrudjava.model.DataBank;

public class NewCompany implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String companyEmail = request.getParameter("email");
		String companyName = request.getParameter("companyName");
		String companyPassWord = request.getParameter("passoword");
		
		Company company = new Company();
		company.setCompanyName(companyName);
		company.setEmail(companyEmail);
		company.setPassword(companyPassWord);
		
		DataBank data = new DataBank();
		data.addCompany(company);
		
		
		
		
		return "redirect:enter?action=LoginForm";
	}

}
