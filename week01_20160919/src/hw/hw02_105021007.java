package hw;
//105021007 ���Q�w
import java.util.Random;
import java.util.Scanner;
public class hw02_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �мg�@�ӵ{�����ϥΪ̿�J n �ò��� 6 �Ӥ��� 1~n �������ü� (��X���üƥi����)
		
		Random rnd = new Random();
		Scanner scn=new Scanner(System.in);
		System.out.print("n=");
	int n =scn.nextInt();
	   int v1 =rnd.nextInt(n)+1;
	   System.out.print(v1);
	   int v2 =rnd.nextInt(n)+1;
	   System.out.print(v2);
	   int v3 =rnd.nextInt(n)+1;
	   System.out.print(v3);
	   int v4 =rnd.nextInt(n)+1;
	   System.out.print(v4);
	   int v5 =rnd.nextInt(n)+1;
	   System.out.print(v5);
	   int v6 =rnd.nextInt(n)+1;
	   System.out.print(v6);
	}

}
