package jp.co.sevenandinm.kenshuu2015.seven009;

public class Class20150410_03{
	public static void main (String[] args){
		int n;
		int i;

		
	//数を入力してもらう
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
			System.out.println ("値を入力してください");
			n = stdIn.nextInt();

		
	//forループ文
		int sum = 0;
		for ( i = 1 ; i <= n ; i ++ ){ 
		sum = sum + i;  
		}
			
	
	



		
		System.out.println ("1から" + n + "までの和は" + sum + "です。");
	}	
}