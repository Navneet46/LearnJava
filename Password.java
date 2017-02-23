package com;

public class Password {

	private String password;
	String regex = "[0-9]*";

	// String[] arrPassword = new String[password.length()];

	// String[] arrPassword;

	public boolean isNumber(String password) {
		if (password.matches(regex)) {
			return true;
		}
		return false;
	}

	// int arr1[];
//	int[] arr1 = new int[5];

//	int arr2[] = { 1, 4, 7, 3 };

	public String[] covertToCharArray(String password) {
		String[] arrPassword = new String[password.length()];
		for (int i = 0; i < password.length(); i++) {
			arrPassword[i] = String.valueOf(password.charAt(i));
		}
		return arrPassword;
	}

	public void display() {
		String[] arrPassword = new String[getPassword().length()];
		this.covertToCharArray(password);
		System.out.println(arrPassword);
	}

	public boolean isPasswordContainNumberSequence(String password) {
		String[] arrPassword = covertToCharArray(password);
		boolean flag = true;
		// g456hspass
		for (int i = 0; i < arrPassword.length; i++) {
			if (arrPassword[i].matches(regex)
					&& arrPassword[i + 1].matches(regex)) {
				int num1 = Integer.parseInt(arrPassword[i]);
				int num2 = Integer.parseInt(arrPassword[i + 1]);
				if ((num2 - num1) == 1) {
					flag = true;
					break;
				} else
					flag = false;
			} else {
				flag = false;
			}

		}
		return flag;
	}

	public void validatePassword(String password) {
		if (isPasswordContainNumberSequence(password)) {
			System.out.println("Password should not contain Number Sequence");
		} else
			System.out.println("Password is valid");

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {
//		Password pwd = new Password();
//
//		pwd.setPassword("g45h5s67pass");
//		pwd.validatePassword(pwd.getPassword());

	}

}
