package br.com.joao.simplecrudjava.model;

public class Company {

	private String email;
	private String adminEmail;
	private String adminPassword;
	private String password;
	private String companyName;
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean validateLoginUser(String email, String password) {

		if (!this.email.equals(email)) {
			return false;
		}

		if (!this.password.equals(password)) {
			return false;
		}

		return true;

	}
	
	
	public boolean validateLoginAdmin(String email, String password) {

		if (!this.adminEmail.equals(email)) {
			return false;
		}

		if (!this.adminPassword.equals(password)) {
			return false;
		}

		return true;

	}
	

}
