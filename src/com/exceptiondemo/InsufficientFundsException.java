package com.exceptiondemo;

class InsufficientFundsException extends Exception {
	private Bank excepbank;	//���ж���
	private double excepAmount;	//Ҫȡ��Ǯ
	public InsufficientFundsException(Bank ba, double dAmount) {	//funds�����𡢴���
		super("ȡ���쳣");	//���ø���Ĺ��췽��
		excepbank = ba;
		excepAmount = dAmount;
	}	//�쳣�๹�췽��
	
	public String excepMessage() {
		String str = "���д���ǣ�" + excepbank.balance + "\nҪȡ��Ǯ�ǣ�" + excepAmount;
		return str;
	}	//ȡ���쳣ʱ��ʾ����Ϣ
}
