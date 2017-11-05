package modul9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ATM {
	
	public static void main(String[] args) {
		System.out.println(accounts[1].getBalance());
	}
	
	public void askForId() {
		
	}
	
	public int getChoice() {
		return 0;
	}
	
	public void printBalance() {
		
	}
	
	public void withDraw() {
		
	}
	
	public void deposit() {
		
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