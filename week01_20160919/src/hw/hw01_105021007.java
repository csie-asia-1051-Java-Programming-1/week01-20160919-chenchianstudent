package hw;
import java.util.Scanner;
public class hw01_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		//���]�ڭ̭n�ΤG�i��Ӫ�� n �ت��A�A�мg�@�ӵ{���ӭp��O���o n �ت��A�ݭn�h�֦줸 (�Ҧp: n = 3 �h�ݭn 2bits)  (log(n)/log(2)
		System.out.print("n=");
		int n =scn.nextInt();
		double c= Math.ceil(Math.log(n)/Math.log(2));
		System.out.print("n�ݭn"+c+"�줸");
		
	}

}
