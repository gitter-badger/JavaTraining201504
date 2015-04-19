package jp.co.sevenandinm.kenshuu2015.seven006;
public class Class03{
	public static void main(String [] args){
		
		int a=100;
		int b=2000;
		long c7;
		
		Addition(a,b);
		Subtraction(a,b);
		Multiplication(a,b);
		Division(a,b);
		TooMuch(a,b);
		
	}
	public static void Addition(int a,int b){
		int c;
		c=a+b;
		System.out.println("a+b="+c);
	}
	public static void Subtraction(int a,int b){
		int c;
		c=a-b;
		System.out.println("a-b="+c);
	}
	public static void Multiplication(int a,int b){
		int c;
		c=a*b;
		System.out.println("a*b="+c);
	}
	public static void Division(int a,int b){
		float c;
		c=(float)a/(float)b;
		System.out.println("a/b="+c);
	}
	public static void TooMuch(int a,int b){
		float c;
		c=(float)a % (float)b;
		System.out.println("a%b="+c);
	}
}