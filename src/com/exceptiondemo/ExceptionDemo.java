package com.exceptiondemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			Bank ba = new Bank(50);	//新建银行对象ba并存入50
			ba.withdrawl(100);	//银行对象ba取款100；withdraw：收回、撤退
			System.out.println("取款成功");
		} catch(InsufficientFundsException e) {
			System.out.println(e.toString());	//e.toString()：返回异常的简短描述（异常类名、原因）
			System.out.println(e.excepMessage());
		}

	}

}
