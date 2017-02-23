package com;

import java.util.Random;

import com.Password;

public class ForgotPassword {

	public static final String VALID_USERID = "8928124646";
	public static final String VALID_PASSWORD = "Navneet@46";

	public static void main(String[] args) {
		UserId user = new UserId();
		Password pass = new Password();
		user.setUserId("8928124646");
		
		String newPassword ="blahblah123";
		int UserOtp=937507;

		pass.setPassword("Navneet@461");
		String userInput = "y";
		if (VALID_USERID.equals(user.getUserId())) {
			if (VALID_PASSWORD.equals(pass.getPassword())) {
				System.out.println("Welcome");
			} else
				System.out.println("Invalid Credentials");
		} else {
			System.out.println("invalid Credentials");
		}
		if (!(VALID_PASSWORD.equals(pass.getPassword()))) {
			System.out.println("Forgot Password?....Do u want to change(y/n)?");
			if(userInput.equals("y")){
				Random randomGenerator = new Random();
				int randomOtp = randomGenerator.nextInt(999999);
				System.out.println("your otp is " + randomOtp);
				if(randomOtp==UserOtp){
					System.out.println("Your new password is : "+newPassword);
			}
			else
				System.out.println("otp not match Try next time.. Good Bye...!!!");

		}

	}

	}
}
