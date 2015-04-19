package jp.co.sevenandinm.kenshuu2015.seven005;
public class Class20150410_05{
	public static void main(String[] args){
		
		int max = 0 ;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		max = a ; 

		if( max < b){
			max = b;
		}
		
		if( max < c ){
			max = c;
		}
		
		System.out.println("最大値は " +max +" です。");

	}
}


