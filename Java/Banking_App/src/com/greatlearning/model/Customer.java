package com.greatlearning.model;

public class Customer {
	
	private String bankAccountNo;
	private String password;
	
	public Customer(String bankAccountNo, String password){
		
		this.bankAccountNo = bankAccountNo;
		this.password = password;
		
	}

	public String getBankAccNo() {
		return bankAccountNo;
		
	}
	public void setBankAccNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
		
	}
	 
	public String getPassword() {
			return password;
			
		}
	public void setPassword(String password) {
			this.password = password;
			
		}
	
}
