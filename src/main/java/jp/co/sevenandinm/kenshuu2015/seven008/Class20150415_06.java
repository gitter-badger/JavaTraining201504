package jp.co.sevenandinm.kenshuu2015.seven008;
import java.util.Scanner;
import java.util.Arrays;

public class Class20150415_06{
	public static void main(String[] args){
		
		int in_A[] = new int[5];
		int in_B[] = new int[5];
		
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
		
		//条件分岐
		if (Arrays.equals(in_A ,in_B)){
			System.out.println("入力された数値はすべて一致しています");
		}else {
			System.out.println("入力された数値のすべては一致してません");
		}
	}
}
