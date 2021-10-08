package br.com.joao.simplecrudjava.model;

import java.util.ArrayList;
import java.util.List;

public class DataBank {
	
	private static  List<Company> companyList = new ArrayList<>();
	private static List<User> userLists = new ArrayList<>();
	private static Integer idKey = 1;
	
	
	static {
		
		Company company = new Company();
		company.setId(idKey++);
		company.setCompanyName("Facebook");
		

		Company company2 = new Company();
		company2.setId(idKey++);
		company2.setCompanyName("Amazon");
		
		companyList.add(company);
		companyList.add(company2);
		
		
		User user = new User();
		user.setEmail("facebook@gmail.com");
		user.setPassword("12345");
		
		

		User user2 = new User();
		user2.setEmail("amazon@gmail.com");
		user2.setPassword("12345");
		
		userLists.add(user);
		userLists.add(user2);
			
	}
	
	
	public User userExist(String email, String password) {
		
		for(User user: userLists) {
			if(user.validateLogin(email, password)) {
				
				return user;
			}
		}
		
		return null;
	}
	
	
	
	
	
	

}
