package hw;

import java.util.Scanner;

public class hw04_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�мg�@�ӵ{�����ϥΪ̿�J a �P b, �{����X a �} b ����᪺���G�A�Ҧp 9.0 �} 3���� ���G�� 2.080083823051904
		Scanner scn=new Scanner(System.in);
		System.out.print("a=");
		float a = scn.nextFloat();
		System.out.print("b=");
		float b = scn.nextFloat();
		double c=Math.pow(a, 1/b);
		System.out.print(c);
		
	}

}
