package hw;
import java.util.Scanner;
public class hw03_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//叫糶祘Α琵ㄏノ块 6 计(Τ计)–常彼き块硂 6 计い程
		Scanner scn=new Scanner(System.in);
		System.out.print("n1=");
		float n1 = scn.nextFloat();
			Math.round(n1);
		System.out.print("n2=");
		float n2 = scn.nextFloat();
		Math.round(n2);
		float test1=Math.min(n1, n2);
		System.out.print("n3=");
		float n3=scn.nextFloat();
		Math.round(n3);
		float test2= Math.min(test1, n3);
		System.out.print("n4=");
		float n4= scn.nextFloat();
		Math.round(n4);
		float test3= Math.min(test2, n4);
		System.out.print("n5=");
		float n5 = scn.nextFloat();
		Math.round(n5);
		float test4 =Math.min(test3, n5);
		System.out.print("n6=");
		float n6 = scn.nextFloat();
		Math.round(n6);
		float test5 = Math.min(test4, n6);
		System.out.print(test5);
		
	}

}
