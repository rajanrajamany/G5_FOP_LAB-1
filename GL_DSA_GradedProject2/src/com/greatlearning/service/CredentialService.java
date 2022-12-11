package com.greatlearning.service;

import java.util.Random;
import com.greatlearning.interfaces.iCredentials;

public class CredentialService implements iCredentials {
	
	public char randSmallAlphabet() {		
		Random rand = new Random();
		return (char)(rand.nextInt(26)+'a');
	}
	
	public char randCapsAlphabet() {		
		Random rand = new Random();
		return (char)(rand.nextInt(26)+'A');
	}
	
	public int randNumber() {		
		Random rand = new Random();
		return rand.nextInt(10);
	}

	public char randSpecialChar() {		
				
		char[] cArr;
		cArr = new char[6];
		cArr[0]='!';
		cArr[1]='@';
		cArr[2]='#';
		cArr[3]='$';
		cArr[4]='%';
		cArr[5]='*';
		
		int temp;
		Random rand = new Random();
		temp = rand.nextInt(6);
		return cArr[temp];
		
	}
	
	public String generatePassword() {
		String sPwd = Character.toString(randSmallAlphabet())+
						Character.toString(randSmallAlphabet())+
						Character.toString(randSmallAlphabet())+
						Character.toString(randCapsAlphabet()) +
						randNumber()+
						Character.toString(randCapsAlphabet())+
						Character.toString(randSpecialChar())+
						Character.toString(randCapsAlphabet())
						;
		
		
		return sPwd;
	
	}
	
	public String generateEmailAddress(String firstName,String lastName,String dept,String Company) {
		return firstName+lastName+"@"+dept+"."+Company+".com";
	}

	@Override
	public void showCredentials(String EmailID, String pwd) {
		// TODO Auto-generated method stub
		System.out.println("Email ID generated is  : " +EmailID);
		System.out.println("Password generated is  : " + pwd);
		
	}
}
