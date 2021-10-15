package br.com.joao.simplecrudjava.model;

public class User {
	
	
	private String email;
	private String password;
	private String companyName;
	
	
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validateLogin(String email, String password) {
		
		
		if(!this.email.equals(email)) {
			return false;
		}
		
		if(!this.password.equals(password)) {
			return false;
		}
		
		return true;
		
	}
	

}
