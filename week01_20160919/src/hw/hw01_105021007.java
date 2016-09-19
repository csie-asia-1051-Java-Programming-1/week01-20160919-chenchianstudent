package hw;
import java.util.Scanner;
public class hw01_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		//假設我們要用二進制來表示 n 種狀態，請寫一個程式來計算記錄這 n 種狀態需要多少位元 (例如: n = 3 則需要 2bits)  (log(n)/log(2)
		System.out.print("n=");
		int n =scn.nextInt();
		double c= Math.ceil(Math.log(n)/Math.log(2));
		System.out.print("n需要"+c+"位元");
		
	}

}
