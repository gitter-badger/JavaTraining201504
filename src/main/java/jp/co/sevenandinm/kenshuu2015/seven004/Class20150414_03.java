package jp.co.sevenandinm.kenshuu2015.seven004;
import java.util.*;
public class Class20150414_03{

		public static void main(String[] args){
			
			System.out.println("値を入力して下さい。");
			
			//数値を入力
			Scanner stdIn = new Scanner(System.in);
			int num =stdIn.nextInt();
			int ans=1;
			
			
			//計算
			for(int i=0; i<num; i++){
				ans=(num-i)*ans;
			}
			
			System.out.println(num +"!=" + ans);
		}
}	

