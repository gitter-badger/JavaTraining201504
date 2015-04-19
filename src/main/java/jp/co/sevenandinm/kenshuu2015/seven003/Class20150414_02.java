package jp.co.sevenandinm.kenshuu2015.seven003;

import java.util.*;
	
public class Class20150414_02{
	public static void main(String[] args){
		
		
		System.out.println("数値を入力してください");
		
		Scanner stdIn = new Scanner (System.in);
			int num = stdIn.nextInt();
		 	int x = num; 
		
		for(int i = 1; i < num; i++){
				x =x * i;
		}
		
		System.out.println("５の階乗は" +x+ "です。");
	}
}
	



	
	
	