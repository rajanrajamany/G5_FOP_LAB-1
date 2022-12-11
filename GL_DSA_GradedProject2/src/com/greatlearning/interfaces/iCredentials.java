package com.greatlearning.interfaces;

public interface iCredentials {
	public String generateEmailAddress(String firstName, String lastName, String dept, String company);
	public String generatePassword();
	public void showCredentials(String EmailID, String pwd); 
}
