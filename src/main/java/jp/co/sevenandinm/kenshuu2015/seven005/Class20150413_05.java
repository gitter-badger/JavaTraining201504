
package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.Scanner;

public class Class20150413_05{
	public static void main(String[] args){

		System.out.println("");
		Scanner stdIn = new Scanner (System.in) ;
		System.out.println("まずは、10進数を入力してください");
		int a = stdIn.nextInt();
		System.out.println("次に、変えたい進数を入力してください");
		int b = stdIn.nextInt();
		String c = Integer.toString(a, b);
		System.out.println(c);
	}
}

