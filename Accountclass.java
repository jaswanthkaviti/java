package com.jaswanth;
import java.util.Date;
public class Main{
	public static void main(String[] args) {
		
		Account testaccount = new Account(1122,20000,4.5);
		
		if(testaccount.withdraw(2500)) {
			System.out.println("withdraw successfully....");
		}
		else {
			System.out.println("insuffucient balance");
		}
		
		testaccount.deposit(3000);
		
		System.out.println("ID: "+testaccount.getId()+" "+
		"Current balance: "+testaccount.getBalance()+" "+
		"Annual intrest rate: "+testaccount.getAnnualIntrestRate()+" "+
				"date of created: "+testaccount.getDateCreated().toString());
	}
	}


public class Account {
	
	private int id;
	private double balance;
	private double annualIntrestRate;
	private Date dateCreated;
	
	public Account(int id , double balance , double annualIntrestRate) {
		
		this.id=id;
		this.balance=balance;
		this.annualIntrestRate=annualIntrestRate;
		
		dateCreated=new Date();
		
	}
	
	public boolean withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			
			return true;
		}
		return false;
	}
	
	public void deposit(double amount) {
		
		balance += amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualIntrestRate() {
		return annualIntrestRate;
	}

	public void setAnnualIntrestRate(double annualIntrestRate) {
		this.annualIntrestRate = annualIntrestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}	

}
