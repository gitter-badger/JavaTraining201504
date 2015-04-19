package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.*;

public class Class20150410_03{
	public static void main(String[] args){
		
		System.out.println("好きな数字を入れてください");
		
		while(true){
			
			Scanner stdIn = new Scanner (System.in);
			int num = stdIn.nextInt();
		
				if(10 <= num && 99 >= num){
					System.out.println("あなたが選んだ数字は " + num +  "です。");	
					break;
				}else{
					System.out.println("あなた選んだ数字は表示できません。好きな数字は2桁に限ります。");
				}
			
		}	
	}
	
	
}
