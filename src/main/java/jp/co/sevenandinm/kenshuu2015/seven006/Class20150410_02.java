package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.*;
import java.io.*;
public class Class20150410_02{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		while(true){
		System.out.print("2桁の数値を入力してください");
			
			int userInputNumber = scan.nextInt();
			if(10<=userInputNumber && userInputNumber<100){
				System.out.println("2桁の入力を確認しました。"+userInputNumber+"です");
			break;
			}
		}
	}
}
