package jp.co.sevenandinm.kenshuu2015.seven007;

//１～ｎまでの和を求めるプログラム

public class Class20150410_03{
	public static void main (String[] args){
		
		int in_number;
		int i = 1;
		int in_sum = 0;
		
		System.out.println("数値を入力してください");
		
		java.util.Scanner stdIn = new java.util.Scanner(System. in);
		in_number = stdIn.nextInt();
		
		while( i <= in_number ){
			in_sum = in_sum+i;
			i++;
		}
		
		System.out.println("和は" +in_sum +"です。");
	}
}
