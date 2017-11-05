package modul9;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ATM {
	
	private static Scanner input = new Scanner(System.in);
	private static Account[] accounts = new Account[10];
	private static int id;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			accounts[i] = new Account(i+1, 1000);
		}
		
		askForId();
		
		int choice = getChoice();
		
		while (choice == 4) {
			System.out.println();
			askForId();
			choice = getChoice();
		}
		
		switch (choice) {
			case 1: 
				printBalance();
				break;
			case 2:
				withdraw();
				break;
			case 3:
				deposit();
				break;
			case 4:
				System.out.println();
				askForId();
				break;
		}
			
	}
	
	public static void askForId() {
		System.out.println("Oppgi konto id: ");
		id = input.nextInt();
		
		while (1 > id || id > 10) {
			System.out.println("Oppgi id mellom 1 og 10."
					+ "\nOppgi konto id: ");
			id = input.nextInt();
		}
	}
	
	public static int getChoice() {
		int choice = 0;
		String choose = "\nMeny" + "\n1: Saldo"	+ "\n2: Uttak"	+ "\n3: Innskudd" 
				+ "\n4: Avbryt" + "\nDitt valg? ";
		System.out.println(choose);
		choice = input.nextInt();
		while (1 > choice || choice > 4) {
			System.out.println("\nDu må velge et av alternativene.");
			System.out.println(choose);
			choice = input.nextInt();			
		}
		return choice;
	}
	
	public static void printBalance() {
		System.out.printf("Saldo for konto nr: %d er %.2f", id, accounts[id-1].getBalance());		
	}
	
	public static void withdraw() {
		System.out.println("Oppgi uttaksverdi: ");
		double withdrawAmount = input.nextDouble();
		
		if (accounts[id-1].withdraw(withdrawAmount)) 
			System.out.printf("Tatt ut %.2f fra konto nr %d\n"
					+ "Saldo for konto nr: %d er %.2f", withdrawAmount, id, id, accounts[id-1].getBalance());
		else
			System.out.println("Ugyldig operasjon");
	}
	
	public static void deposit() {
		System.out.println("Oppgi innskuddsverdi: ");
		double depositAmount = input.nextDouble();
		
		if (accounts[id-1].deposit(depositAmount))
			System.out.printf("Satt inn %.2f på konto nr %d\n"
					+ "Saldo for konto nr: %d er %.2f", depositAmount, id, id, accounts[id-1].getBalance());
		else
			System.out.println("Ugyldig operasjon");
	}
}


class Account {
	private int id; // bankkontoens id
	private double balance; // bankkontoens saldo
	private Calendar dateCreated = new GregorianCalendar();
	private static double annualInterestRate; // bankens årlige rente for alle kontoer
	
	public Account(int i, double b) {
		id = i;
		balance = b;
		dateCreated = Calendar.getInstance();
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Calendar getDateCreated() {
		return dateCreated;
	}
	
	public static double annualInterestRate() {
		return annualInterestRate;
	}
	
	public double getMonthlyInterest() {
		return balance * (annualInterestRate/1200);
	}
	
	public void setAnnualInterestRate(double rate) {
		annualInterestRate = rate;
	}
	
	public boolean withdraw(double amount) {
		if (amount >= 1 && amount <= balance) {
			balance = balance - amount;
			return true;
			}
		return false;
	}
	
	public boolean deposit(double amount) {
		if (amount >= 1) {
			balance = balance + amount;
			return true;
		}
		return false;
	}
}