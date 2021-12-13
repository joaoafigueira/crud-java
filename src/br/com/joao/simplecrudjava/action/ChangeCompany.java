package br.com.joao.simplecrudjava.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.joao.simplecrudjava.model.Company;
import br.com.joao.simplecrudjava.model.DataBank;

public class ChangeCompany implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String companyName = request.getParameter("name");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		DataBank data  = new DataBank();
		Company company = data.searchForCompanyId(id);
		company.setCompanyName(companyName);
		
		
		return "redirect:enter?action=ListCompany";
	}

}
