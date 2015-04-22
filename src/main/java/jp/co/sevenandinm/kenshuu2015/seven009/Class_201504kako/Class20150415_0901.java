package jp.co.sevenandinm.kenshuu2015.seven009.Class_201504kako;

import java.util.Scanner;


public class Class20150415_0901 {
	public static void main (String[] args){
	int[] a = new int[3];
        int[] b = new int[3];
		
	System.out.println("これから三つの要素を持つ二つの配列を比較します");
        

		
	//配列a,bの入力	
   	 Scanner stdIn = new java.util.Scanner(System.in); 	
		
  	System.out.println ("一つ目の配列を入力してください");
	int input_a_1 = stdIn.nextInt();int input_a_2 = stdIn.nextInt();int input_a_3 = stdIn.nextInt();
	System.out.println ("二つ目の配列を入力してください");		
	int input_b_1 = stdIn.nextInt();int input_b_2 = stdIn.nextInt();int input_b_3 = stdIn.nextInt();
	
	a[0]=input_a_1;
	a[1]=input_a_2;
	a[2]=input_a_3;

	b[0]=input_b_1;
	b[1]=input_b_2;
	b[2]=input_b_3;
			

	//判定結果(結果が1なら一致、2ならおけ
	if( input_a_1 == input_b_1 && input_a_2 == input_b_2 && input_a_3 == input_b_3 ){
		System.out.println ("二つの配列は一致しました");
		}else{
			System.out.println ("エラー");
		}	
        

	}
}
	