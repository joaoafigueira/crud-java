package br.com.joao.simplecrudjava.model;

import java.util.ArrayList;
import java.util.List;

public class DataBank {
	
	private static List<Company> companyLists = new ArrayList<>();
	private static Integer idKey = 1;
	
	
	static {
		
		
		Company user = new Company();
		
		user.setId(idKey++);
		user.setEmail("facebook@gmail.com");
		user.setPassword("12345");
		user.setCompanyName("facebook");
		

		Company user2 = new Company();
		
		user2.setId(idKey++);
		user2.setEmail("amazon@gmail.com");
		user2.setPassword("12345");
		user2.setCompanyName("Amazon");
		
		
		companyLists.add(user);
		companyLists.add(user2);
			
	}
	
	
	public Company userExist(String email, String password) {
		
		for(Company company:companyLists) {
			if(company.validateCompany(email, password)) {
				
				return company;
			}
		}
		
		return null;
	}
	
	
	public List<Company> getCompany(){
		return DataBank.companyLists;
	}
	
	public void addCompany(Company company) {
		company.setId(DataBank.idKey++);
		DataBank.companyLists.add(company);
	}
	
	

}
