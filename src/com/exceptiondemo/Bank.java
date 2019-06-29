package com.exceptiondemo;

class Bank {
	double balance;	//�������balance����ƽ����ƽ����Ŀ��
	
	Bank(double balance) {		//���췽��
		this.balance = balance;
	}
	
	public void deposite(double dAmount) {	//amount�������ܶ�
		if(dAmount > 0.0)
			balance += dAmount;
	}	//����
	
	public void withdrawl(double dAmount) throws InsufficientFundsException {
		if(balance < dAmount)
			throw new InsufficientFundsException(this, dAmount);
		balance = balance-dAmount;
	}	//ȡ���
	
	public void showBalance() {
		System.out.println("The balance is " + (int)balance);
	}	//��ʾ���д�����

}	//������
