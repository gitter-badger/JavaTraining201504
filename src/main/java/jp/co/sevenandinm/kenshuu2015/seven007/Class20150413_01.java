package jp.co.sevenandinm.kenshuu2015.seven007;

public class Class20150413_01{
	public static void main (String[] args){
	
		
		
		String message = "";
		int a;
		int b;
		int c;
		int max = 0;
		
		
		message = "３つの値の最大値を求めます";
		System.out.println( message );
		
		java.util.Scanner stdIN = new java.util.Scanner(System. in);
		a = stdIN.nextInt();
		b = stdIN.nextInt();
		c = stdIN.nextInt();
		
		
		message = ("一つ目の数値は" +a);
		System.out.println( message );
		
		message = ("二つ目の数値は" +b);
		System.out.println( message );
		
		message = ("三つ目の数値は" +c);
		System.out.println( message );
		
		
		max = max3(a,b,c);


		System.out.println("最大値は" +max +"です。");
		
	
	}
	
	public static int max3(int a, int b, int c) {
		int max_max = 0;
		
			
		if(a>b && a>c){
			max_max = a;
		}
		else if (b>c){
			max_max = b;
		}
		else {
			max_max = c;
		}
		
		return max_max;
	}
}

