package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.Scanner;

public class Class20150410_04{
	public static void main(String[] args){
		
		System.out.println("好きな数字を入れてください");
		Scanner stdIn = new Scanner (System.in);
		int num = stdIn.nextInt();
		int i ;
		int sum = 0;
	
		for( i = 1 ; i <= num ; i++){
			sum = i + sum ;
		}
		System.out.println("1からあなたが選んだ数字までの和は " + sum + " です。");
	}		
}

