package jp.co.sevenandinm.kenshuu2015.seven002;
public class Class03{
	public static void main (String[] args){
		int a = 7;
		int b = 3;
		int c1,c2,c3,c5;
		float c4;
		byte c6;
		int c7;
		
		c1 = a + b;
		c2 = a - b;
		c3 = a * b;
		c4 = (float)a / b;
		c5 = a % b;
		//byte型の範囲は(-128～127)
		c6 = -128;
		c7 = 2147483646;
		
		System.out.println("[足し算]c1=" +c1);
		System.out.println("[引き算]c2=" +c2);
		System.out.println("[掛け算]c3=" +c3);
		System.out.println("[割り算]c4=" +c4);
		System.out.println("[あまり]c5=" +c5);
		System.out.println("[byte範囲]c6=" +c6);
		System.out.println("[int範囲]c7=" +c7);
	}
}