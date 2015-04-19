package jp.co.sevenandinm.kenshuu2015.seven007;

public class Class05{
	public static void main (String[] args){
	
		
		
		String message = "";
		int a = Integer.parseInt( args[0] );
		int b = Integer.parseInt( args[1] );
		int c = Integer.parseInt( args[2] );
		int max = 0;
		
		String d = args[3] + args[4];
		System.out.println( d );
		

		
		message = "３つの値の最大値を求めます";
		System.out.println( message );
		
		
		message = ("一つ目の数値は" +args[0]);
		System.out.println( message );
		
		message = ("二つ目の数値は" +args[1]);
		System.out.println( message );
		
		message = ("三つ目の数値は" +args[2]);
		System.out.println( message );
		
		
		if(a>b && a>c){
			max = a;
		}
		else if (b>c){
			max = b;
		}
		else {
			max = c;
		}
		
		System.out.println("最大値は" +max +"です。");
		
	
	}
}

