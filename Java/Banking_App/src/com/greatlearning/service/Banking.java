package com.greatlearning.service;
import java.util.Scanner;

public class Banking {
	
	private int balance = 100000;
	static Scanner rs = new Scanner(System.in);
	
	public void deposit(int amount) {
		
		if (amount > 0) {
			
			balance += amount;
			System.out.println("You have Successfully deposited the amount Rs."+amount+" and Current balance is Rs."+balance);
			
		}
		
	}

	public void withdraw(int amount) {
		if (amount > balance) {
			System.out.println("You do not have sufficient balance to withdraw. Your Current balance is Rs."+ balance);
			
		}else {
		balance-= amount;
		
		System.out.println("You have Successfully withdrawn the amount Rs."+amount+" and Current balance is Rs."+balance);
		}
	}
	public void transfer(int amount ,String payeeBankAccNo) {
		int generatedOtp = OtpGenerator.generateOtp();

		System.out.println("OTP generated:" + generatedOtp);
		System.out.println("Please enter OTP:" );
		
		int enteredOtp = rs.nextInt();
		
		if (generatedOtp != enteredOtp) {
			System.out.println("OTP entered incorrect:" );
		}else {
		if (amount > balance) {
			System.out.println("You do not have sufficient balance to withdraw. Your Current balance is Rs."+ balance);
			
		}else {
		balance-= amount;
		
		System.out.println("You have Successfully withdrawn the amount Rs."+amount+" and Current balance is Rs."+balance);
		}
	}
	}
}
