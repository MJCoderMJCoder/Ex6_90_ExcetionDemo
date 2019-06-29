package com.exceptiondemo;

class InsufficientFundsException extends Exception {
	private Bank excepbank;	//银行对象
	private double excepAmount;	//要取的钱
	public InsufficientFundsException(Bank ba, double dAmount) {	//funds：基金、储备
		super("取款异常");	//调用父类的构造方法
		excepbank = ba;
		excepAmount = dAmount;
	}	//异常类构造方法
	
	public String excepMessage() {
		String str = "银行存款是：" + excepbank.balance + "\n要取的钱是：" + excepAmount;
		return str;
	}	//取款异常时显示的信息
}
