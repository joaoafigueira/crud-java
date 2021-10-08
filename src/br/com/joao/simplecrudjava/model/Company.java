package br.com.joao.simplecrudjava.model;

import java.util.Date;

public class Company {
	
	private Integer id;
	private String companyName;
	private Date openDate = new Date();
	
	
	
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
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	
	
	
	
	

}
