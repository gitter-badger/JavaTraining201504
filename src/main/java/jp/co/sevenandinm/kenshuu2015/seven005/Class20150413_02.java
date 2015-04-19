package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.Scanner;

public class Class20150413_02{
	public static void main(String[] args){
		
		
		System.out.println("これから、最大値を求めます。");
		Scanner stdIn = new Scanner (System.in) ;
		System.out.println("まずは、aの値を入力してください");
		int input_a = stdIn.nextInt();
		System.out.println("次に、bの値を入力してください");
		int input_b = stdIn.nextInt();
		System.out.println("最後に、cの値を入力してください");
		int input_c = stdIn.nextInt();
		
		 max(input_a, input_b, input_c);
	
	}
	
	public static void max(int a, int b, int c){;
		int max = a ; 
			if( max < b ){
				max = b;
			}
			if( max < c ){
				max = c;
			}
	
	
		
		System.out.println("最大値は" + max + "です。");
	}
}