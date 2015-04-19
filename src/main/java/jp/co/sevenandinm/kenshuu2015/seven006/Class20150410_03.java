package jp.co.sevenandinm.kenshuu2015.seven006;

import java.util.Scanner;
public class Class20150410_03{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("1から入力値までの和を計算します。");
		int inputUserNumber=scan.nextInt();

		int sum = sumNumber(inputUserNumber);
		System.out.println("1から"+inputUserNumber+"までの和は"+sum+"です");
		System.out.print(args[0]);
	}

	private static int sumNumber(int inputUserNumber){
		int sum = 0;
		for(int i=1;i<=inputUserNumber;i++){
			sum+=i;
		}
		return sum;
	}

}
