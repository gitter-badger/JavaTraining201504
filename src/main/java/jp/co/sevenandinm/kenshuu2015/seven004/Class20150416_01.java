package jp.co.sevenandinm.kenshuu2015.seven004;
import java.util.*;

public class Class20150416_01{
	public static void main(String[] args){
		
		System.out.println("それぞれ配列の要素数を決めてください");
		
		Scanner stdIn = new Scanner(System.in);
		int n1 = stdIn.nextInt();
		int n2= stdIn.nextInt();
		int[] a = new int[n1];
		int[] b = new int[n2];
		
		for(int i=0; i<a.length; i++){
		
			System.out.println("整数を入力してください");
			//整数をキーボードから入力し、配列に記憶
			a[i]=stdIn.nextInt();
			
		}
		
		for(int j=0; j<b.length; j++){
		
			System.out.println("整数を入力してください");
			//整数をキーボードから入力し、配列に記憶
			b[j]=stdIn.nextInt();
			
		}
		for(int i=0; i<a.length; i++){
		if(a[i]==b[i]){
			System.out.println("要素数が一致しました");
		}else{
			System.out.println("要素数が異なりました");
		}
		}
		
	}
}

