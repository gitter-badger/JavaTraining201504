package jp.co.sevenandinm.kenshuu2015.seven008;
import java.util.Scanner;
import java.util.Arrays;

public class Class20150415_06b{
	public static void main(String[] args){
		
		System.out.println("配列の個数を入力してください");
		Scanner stdIn_S = new Scanner(System.in);
		int s = stdIn_S.nextInt();
		
		int[] in_A = new int[s];
		int[] in_B = new int[s];
		
		//入力した値を配列へ
		Scanner stdIn1 = new Scanner(System.in);
		Scanner stdIn2 = new Scanner(System.in);
		for(int i = 0; i < in_A.length ; i++){
			System.out.println("整数を入力");
			in_A[i] = stdIn1.nextInt();
			in_B[i] = stdIn2.nextInt();
		}
		
		System.out.println();
		
		//配列の値を表示
		for(int i = 0 ; i < in_A.length ; i ++){
			System.out.println(in_A[i] + "：" + in_B[i]);
		}
		
		//条件分岐①
		//if (Arrays.equals(in_A ,in_B)){
		//	System.out.println("入力された数値はすべて一致しています");
		//}else {
		//	System.out.println("入力された数値のすべては一致してません");
		//}
		
		array_evaluate(s, in_A ,in_B);
	}
	
	public static void array_evaluate (int s , int[] in_A , int[] in_B ){
		//条件分岐②
		int in_Flag = 0;
		for(int g = 0;g < in_A.length ; g++){
			if(in_A[g] == in_B[g]){
				in_Flag += 1;
			}else{
				in_Flag -= 1;
			}
		}
		
		if(in_Flag == s){
			System.out.println("入力された数値はすべて一致しています");
		}else{
			System.out.println("入力された数値のすべては一致してません");
		}
	}
}
