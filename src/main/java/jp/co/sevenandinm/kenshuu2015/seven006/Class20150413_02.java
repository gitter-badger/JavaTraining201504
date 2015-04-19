package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.*;
public class Class20150413_02{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("亀と鶴の数を入力してください");
		int totalNumber =scan.nextInt();
		System.out.println("亀と鶴の足の合計本数を入力してください");
		int totalleg =scan.nextInt();
		int kame=craneAndTortoise(totalNumber, totalleg);
		System.out.println("亀の数は"+kame);
		
		System.out.println("鉛筆とシャープペンシルの合計を入力してください");
		int totalPencilNumber =scan.nextInt();
		System.out.println("合計金額を入力してください");
		int totalPrice =scan.nextInt();
		int pen = pencilNumber(totalPencilNumber,totalPrice);
		
		System.out.println("シャーペンの本数は"+pen);
	}
	
	private static int craneAndTortoise(int totalNumber,int totalFootNumber){
		int tortoise=0;
		return tortoise=(totalFootNumber/2)-totalNumber;
	}
	
	private static int pencilNumber(int totalNumber,int totalPrice){
		int pencilPrice = 40;
		int automaticPecilPrice = 100;
		int pencilNumber=0;
		int automaticPencilNumber=0;
		 automaticPencilNumber =  
		(totalPrice - pencilPrice * totalNumber) / ( automaticPecilPrice - pencilPrice);
		return  automaticPencilNumber;
	}
}