package com.exceptiondemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			Bank ba = new Bank(50);	//�½����ж���ba������50
			ba.withdrawl(100);	//���ж���baȡ��100��withdraw���ջء�����
			System.out.println("ȡ��ɹ�");
		} catch(InsufficientFundsException e) {
			System.out.println(e.toString());	//e.toString()�������쳣�ļ���������쳣������ԭ��
			System.out.println(e.excepMessage());
		}

	}

}
