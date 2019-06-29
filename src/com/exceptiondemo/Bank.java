package com.exceptiondemo;

class Bank {
	double balance;	//存款数；balance：天平、结平（账目）
	
	Bank(double balance) {		//构造方法
		this.balance = balance;
	}
	
	public void deposite(double dAmount) {	//amount：量、总额
		if(dAmount > 0.0)
			balance += dAmount;
	}	//存款方法
	
	public void withdrawl(double dAmount) throws InsufficientFundsException {
		if(balance < dAmount)
			throw new InsufficientFundsException(this, dAmount);
		balance = balance-dAmount;
	}	//取款方法
	
	public void showBalance() {
		System.out.println("The balance is " + (int)balance);
	}	//显示银行存款余额

}	//银行类
