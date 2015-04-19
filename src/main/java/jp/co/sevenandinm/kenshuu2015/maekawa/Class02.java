package jp.co.sevenandinm.kenshuu2015.maekawa;

public class Class02 {
	public static void main(String[] args){
		int a = 7;
		int b = 3;
		int c1,c2,c3,c5,c6;
		float c4;
		
		c1 = a * b;
		c2 = a - b;
		c3 = a + b;
		//float     int  int
		c4         = a / (float)b;
		
		c5 = (a + b) - c1;
		c6 = a % b;
		
		System.out.println("[掛け算]c1=" + c1);
		System.out.println("[引き算]c2=" + c2);
		System.out.println("[足し算]c3=" + c3);
		System.out.println("[わり算]c4=" + c4);
		
		System.out.println("[大平さん]c5=" + c5);
		
		System.out.println("[あまり]c6=" + c6);
	}
}