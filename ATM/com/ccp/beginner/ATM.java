package com.ccp.beginner;

import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Initial Balance::");
		double initialBalance = sc.nextDouble();
		System.out.println();
		System.out.print("Withdrawl::");
		double Withdrawl = sc.nextDouble();
		Double charge = 0.50;
		
		if(Withdrawl%5==0 && initialBalance > Withdrawl) {
			Double finalBalance = initialBalance - (Withdrawl+charge);
			System.out.println(String.format("BALANCE::%.2f",finalBalance));
		}
		else {	
			System.out.println(String.format("BALANCE::%.2f",initialBalance));
		}
		
		
	}

}
