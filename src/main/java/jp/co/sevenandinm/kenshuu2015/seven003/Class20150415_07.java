package jp.co.sevenandinm.kenshuu2015.seven003;
import java.util.*;

public class Class20150415_07 {
	public static void main(String[] args){
		
		System.out.println("これから配列を比較します");
		
		System.out.println("まず、一つ目の配列の数値を４つ入力してください");
			Scanner stdIn1 = new Scanner (System.in);
				
		
			int[] a,b ; 
			a = new int [4];
			b = new int [4];
		
			int input1 = stdIn1.nextInt(); 
			int input2 = stdIn1.nextInt();
			int input3 = stdIn1.nextInt();
			int input4 = stdIn1.nextInt();
		
			a[0] = input1;
			a[1] = input2;
			a[2] = input3;
			a[3] = input4;
	
		System.out.println("では、二つ目の配列を入力してください");
			Scanner stdIn2 = new Scanner (System.in);
		
			int no1 = stdIn2.nextInt(); 
			int no2 = stdIn2.nextInt();
			int no3 = stdIn2.nextInt();
			int no4 = stdIn2.nextInt();
		
			b[0] = no1;
			b[1] = no2;
			b[2] = no3;
			b[3] = no4;
		
		if (Arrays.equals(a,b) ){
			System.out.println("これらの配列は等しいです");
		}else{
			System.out.println("これらの配列は異なります");
		}
		
		
	}
}
        
	