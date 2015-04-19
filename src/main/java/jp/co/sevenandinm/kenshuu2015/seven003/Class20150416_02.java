package jp.co.sevenandinm.kenshuu2015.seven003;
import java.util.*;

import jp.co.sevenandinm.kenshuu2015.maekawa.Class20150415_02;



public class Class20150416_02 {
	public static void main(String[] args){
		
		System.out.println("これから配列を比較します");
		
		System.out.println("まず、一つ目の配列の数値を４つ入力してください");
			Scanner stdIn1 = new Scanner (System.in);
				
			int[] a,b ; 
			a = new int [4];
			b = new int [4];
		
			for(int i=0; i<4; i++){
				 a [i] = stdIn1.nextInt();
	       }
	       
		System.out.println("では、二つ目の配列を入力してください");
			Scanner stdIn2 = new Scanner (System.in);
			
			for(int i=0; i<4; i++){
				 b [i] = stdIn2.nextInt();
			}
		
		if (Arrays.equals(a,b) ){
			System.out.println("これらの配列は等しいです");
		}else{
			System.out.println("これらの配列は異なります");
		}
		
		
		
		Class20150415_02 hikaku = new Class20150415_02();
		hikaku.execute();
	
	}
}
        
	