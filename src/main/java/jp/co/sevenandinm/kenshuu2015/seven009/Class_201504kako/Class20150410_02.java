package jp.co.sevenandinm.kenshuu2015.seven009.Class_201504kako;

public class Class20150410_02{
	public static void main (String[] args){
		int a;

		
	//数を入力してもらう
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
			System.out.println ("値を入力してください");
			a = stdIn.nextInt();

		
	//if文
		if ( 10 <= a && a <= 99 ){
			 System.out.println ( a );
	
		}else {
			 System.out.println (" エラー ");			
		}
	}	
}