package com.greatlearning.service;

public class OtpGenerator {
	
	public static int generateOtp() {
		return (int) (Math.random() * 9000);
		
	}

}
