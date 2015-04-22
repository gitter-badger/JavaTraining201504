package jp.co.sevenandinm.kenshuu2015.seven009.Class_201504kako;

import java.util.Scanner;
import java.util.Arrays;

public class Class20150416_01 {
	public static void main (String[] args){
		
		
		System.out.println("二つの配列を比較します");
		System.out.println("配列のもつ要素数を入力して下さい。");	
    	
		//配列の要素数の入力
   	 	Scanner stdIn1 = new java.util.Scanner(System.in); 
		int number = stdIn1.nextInt();

		String[] list1= new String[number];
		String[] list2= new String[number];
		
		
		//指定された要素数まで入力①
  		System.out.println ("一つ目の配列の要素を入力してください");
		for (int i =0 ; i < number ; i ++ ){
			Scanner stdIn2 = new java.util.Scanner(System.in);
			int input_list_1 = stdIn2.nextInt();
			
		}
			
			
		//指定された要素数まで入力②
  		System.out.println ("二つ目の配列の要素を入力してください");
		for (int j =0 ; j < number ; j ++ ){
			Scanner stdIn3 = new java.util.Scanner(System.in);
			int input_list_2 = stdIn3.nextInt();
		}
		//配列を比較します
		if ( Arrays.equals( list1 ,list2) ) {
			System.out.println("二つの配列は一致します。");
		}else{
			System.out.println("二つの配列は一致しません。");
		}
		
	}
}