package jp.co.sevenandinm.kenshuu2015.seven004;
import java.util.*;
public class Class20150414_04{

		public static void main(String[] args){
			
			System.out.println("値を入力して下さい。");
			
			//数値を入力
			Scanner stdIn = new Scanner(System.in);
			int num =stdIn.nextInt();
			int ans=1;
			
			
			//計算
			for(int i=0; i<num; i++){
			
				ans= (num-i)*ans;
				
				
			}
			
			System.out.println(num+"!=+"+ans);
     
		}
	private static int factorialNumber(int num){
		int sum=1;
		if(num!=0){
			sum=num*factorialNumber(num-1);
			System.out.println(num);
			System.out.println("この時点の合計値は"+num);
	}
	return sum;
	}	
}
