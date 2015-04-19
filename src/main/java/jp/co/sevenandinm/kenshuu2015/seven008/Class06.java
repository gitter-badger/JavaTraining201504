package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class06{
	public static void main(String[] args){
		String message = "";
		int a,b,c;
		int int_min = 0;
		
		message = "3つの数字の最小値を求めます";
		System.out.println(message);
		
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		c = stdIn.nextInt();
		
		if(a < b && a < c){
			int_min = a;
		}else if(b < c) {
			int_min = b;
		}else
			int_min = c;
		
		System.out.println("最小値は" + int_min + "です。");
	}
}