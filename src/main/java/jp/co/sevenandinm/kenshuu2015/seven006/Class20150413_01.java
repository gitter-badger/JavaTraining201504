package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.*;
public class Class20150413_01{
	public static void main(String [] args){
		
		int[] numBox=new int[3];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3つの数字の最大値を求めます");
		for(int i=0; i<numBox.length; i++){
			System.out.println(i+1+"番目の数字を入力してください");
			numBox[i] = scan.nextInt();
		}
		
		int max =maxNum(numBox[0],numBox[1],numBox[2]);
		
		System.out.println("3つの最大値は"+max+"です");
	}
	
	private static int maxNum(int number1,int number2,int number3){
		int max=number1;
		
		if(max<number2){
			max=number2;
		}
		if(max<number3){
			max=number3;
		}
		return max;
		
	}
}