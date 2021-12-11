package br.com.joao.simplecrudjava.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.joao.simplecrudjava.model.Company;
import br.com.joao.simplecrudjava.model.DataBank;

public class ListCompany implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		DataBank bank = new DataBank();
		List<Company> companyList = bank.getCompany();
		
		request.setAttribute("companys", companyList);
		return "forward:manage-company.jsp";
	}

}
