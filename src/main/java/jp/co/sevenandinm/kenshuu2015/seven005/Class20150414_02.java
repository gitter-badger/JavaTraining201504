package jp.co.sevenandinm.kenshuu2015.seven005;

import java.util.Scanner;
public class Class20150414_02{
	public static void main(String[] args){


		System.out.println("階乗を求めます。");
		System.out.println("何か数字を入力してください");
		Scanner stdIn = new Scanner (System.in);
		int input_a = stdIn.nextInt();
		int a = input_a ;
		int i ;
		int answer =1;

		
			for( i = 1 ; i <= a ; i++){
				answer = i * answer;
			}

		System.out.println(input_a + " の階乗は " + answer + "です。");
	}
}
