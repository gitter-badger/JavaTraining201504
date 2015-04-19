package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Class20150415_11{
	public static void main(String[] args){
		
		int in_A[] = new int[5];
		Scanner stdIn = new Scanner(System.in);
		for(int i = 0; i < in_A.length ; i++){
			System.out.println("整数を入力");
			in_A[i] = stdIn.nextInt();
		}
		
		for(int i = 0 ; i < in_A.length ; i ++){
			System.out.println(in_A[i]);
		}
	}
}


