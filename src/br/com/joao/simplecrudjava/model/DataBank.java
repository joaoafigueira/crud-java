package br.com.joao.simplecrudjava.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataBank {

	private static List<Company> companyLists = new ArrayList<>();
	private static List<Company> adminLists = new ArrayList<>();
	private static Integer idKey = 1;

	static {

		Company user = new Company();

		user.setId(idKey++);
		user.setEmail("facebook@gmail.com");
		user.setPassword("12345");
		user.setCompanyName("Facebook");

		Company user2 = new Company();

		user2.setId(idKey++);
		user2.setEmail("amazon@gmail.com");
		user2.setPassword("12345");
		user2.setCompanyName("Amazon");

		Company admin = new Company();

		admin.setAdminEmail("admin@gmail.com");
		admin.setAdminPassword("admin123");

		adminLists.add(admin);
		companyLists.add(user);
		companyLists.add(user2);

	}

	public Company searchForCompanyId(Integer id) {

		for (Company company : companyLists) {
			if (company.getId() == id) {
				return company;
			}
		}
		return null;
	}

	public Company userExist(String email, String password) {

		for (Company user : companyLists) {
			if (user.validateLoginUser(email, password)) {

				return user;
			}
		}

		return null;
	}

	public Company adminExist(String email, String password) {

		for (Company admin : adminLists) {
			if (admin.validateLoginAdmin(email, password)) {

				return admin;
			}
		}

		return null;
	}

	public List<Company> getCompany() {
		return DataBank.companyLists;
	}
	
	public void removeCompany(Integer id) {
	
		Iterator<Company> iterator = companyLists.iterator();
		
		while(iterator.hasNext()){
			Company company = iterator.next();
			
			if(company.getId() == id) {
				iterator.remove();
			} 
			
		}
	}
	
	
	
	public void addCompany(Company company) {
		company.setId(DataBank.idKey++);
		DataBank.companyLists.add(company);
	}

}
