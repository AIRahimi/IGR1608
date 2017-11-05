package modul8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestAccount {
	
	public static void main (String[] args) {
		
		Account ny = new Account(1122, 2000);
		ny.setAnnualInterestRate(4.5);
		System.out.println("Uttak av 2500 fra kontoen, status: " 
				+ (ny.withdraw(2500) ? "Suksess" : "Feilet")
				+ (ny.deposit(3000) ? "Suksess" : "Feilet"));
		System.out.println("Saldoen er: " + ny.getBalance() + " kroner");
		System.out.println("Månedlig rente: " + ny.getMonthlyInterest() + " kroner");
		System.out.println("Kontoen ble opprettet: ");
		System.out.printf("%tF %tT", ny.getDateCreated(), ny.getDateCreated().getTime());
		
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
