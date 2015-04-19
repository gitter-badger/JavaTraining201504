package jp.co.sevenandinm.kenshuu2015.seven005;

import java.util.*;

public class Class05{
	public static void main(String[] args){
		
		int input_a = 0 ;
		int input_b = 0 ;
		int input_c = 0 ;
		int max = 0 ;
		

		System.out.println("これから、最大値を求めます。");
		Scanner stdIn = new Scanner (System.in) ;
		System.out.println("まずは、aの値を入力してください");input_a = stdIn.nextInt();
		System.out.println("次に、bの値を入力してください");input_b = stdIn.nextInt();
		System.out.println("最後に、cの値を入力してください");input_c = stdIn.nextInt();
		
			
			max = input_a ; 
			if( max < input_b ){
				max = input_b;
			}
			if( max < input_c ){
				max = input_c;
			}
		
			
		
		
		
		
				/*
		
				max = input_a
		
					if( input_a < input_b ){
					max = input_b ;
						if( max < input_c) {
						max = input_c;
						}		
					}
				*/
		
		
		/*
		
		max = 0;
			if(input_a > input_b && input_a > input_c){
			max = input_a;
			}
			else if(input_c < input_b){
			max = input_b;	
			}
			else{
			max = input_c ;	
			}
		
		*/
		
		
		
		System.out.println("最大値は " +max +" です。");
	}
}

