package com.greatlearning.main;

import com.greatlearning.model.Customer;
import com.greatlearning.service.Banking;
import java.util.Scanner;

public class Driver {
	
	public static Customer c = new Customer("1234", "1234");
	private static Banking banking = new Banking();
	static Scanner rs = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		displayWelcomeMessage();
		
	
		if( isreadCheckCredentials()) {
			System.out.println("You have Successfully Authenticated!");
			System.out.println("Enter the Menu Option");
			
			
			int option = rs.nextInt();
			int amount;
			String payeeBankAccNo;
			
			
			do{
				displayMenu();
	
			switch (option) {
			case 1:
				System.out.println("Enter the Deposit amount:");
				amount = rs.nextInt();
			    banking.deposit(amount);
			    break;
			case 2:
				System.out.println("Enter the amount to withdraw:");
			     amount = rs.nextInt();
			    banking.withdraw(amount);
			    break;
			case 3:
				System.out.println("Enter the amount to Transfer:");
				amount = rs.nextInt();
			    System.out.println("Enter the Account Number of Payee:");
			     payeeBankAccNo = rs.next();
			     System.out.println("Enter the OTP to transfer the amount:");
			     banking.transfer(amount, payeeBankAccNo);
			    break;
			   
			}
		 } while (option!= 4);
		}else {
			System.out.println("Authentication failed!!");
		}
		
	}
	
	private static void displayMenu() {
		System.out.println("***************************************");	
		System.out.println("Menu Options");	
		System.out.println("***************************************");
		System.out.println("1. Deposit");	
		System.out.println("2. Withdraw");	
		System.out.println("3. Transfer");	
		System.out.println("4. Logout");	
	}

	private static void displayWelcomeMessage() {
		System.out.println("Welcome to Indian Bank");	
		
	}
	
	private static boolean isreadCheckCredentials() {
		
	
		System.out.println("Enter Account Number:");
		String accountNo = rs.next();
		System.out.println("Enter Password:");
		String pwd = rs.next();
		
		
		return c.getBankAccNo().equals(accountNo) && 
				c.getBankAccNo().equals(pwd);
	}

		
	
}
