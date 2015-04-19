package jp.co.sevenandinm.kenshuu2015.seven002;
import java.util.Arrays;
import java.util.Scanner;
public class Class20150416_01 {

	
public static void main(String[] args) {
       
//2つの配列の作成
	System.out.println("配列の数を入力");
	Scanner stdInS = new Scanner(System.in);
	int S  = stdInS.nextInt();
	
	int array1[] = new int[S];
	int array2[] = new int[S];
		
	Scanner stdIn1 = new Scanner(System.in);
	Scanner stdIn2 = new Scanner(System.in);
	for(int i=0;i<array1.length;i++){
		System.out.println("数を入力 ");
		array1[i] = stdIn1.nextInt();
		array2[i] = stdIn1.nextInt();
	}
	
	for(int i=0;i<array1.length;i++){
		System.out.println(array1[i] + "=" + array2[i]);
	}
	
	if (Arrays.equals(array1 ,array2)){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
}
}   
