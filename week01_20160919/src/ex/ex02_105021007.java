package ex; 
/* 
* Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤) 
* Date: 2016/09/19 
* Author: 105021007 陳麒安 
*/ 

import java.util.Scanner; 
public class ex02_105021007 { 

 
public static void main(String[] args) { 
// TODO Auto-generated method stub 
	Scanner scn=new Scanner(System.in);
	System.out.print("公斤=");
	float 公斤=scn.nextFloat( );
	double 磅=公斤*0.45359;
	System.out.print("換算成磅後="+磅);
	
	
} 

 
} 
