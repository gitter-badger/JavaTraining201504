package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class05{
	public static void main(String[] args){
		String message = "";
		int a,b,c;
		int int_max = 0;
		
		message = "3つの数字の最大値を求めます";
		System.out.println(message);
		
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		c = stdIn.nextInt();
		
		if(a > b && a > c){
			int_max = a;
		}else if(b > c) {
			int_max = b;
		}else
			int_max = c;
		
		System.out.println("最大値は" + int_max + "です。");
	}
}