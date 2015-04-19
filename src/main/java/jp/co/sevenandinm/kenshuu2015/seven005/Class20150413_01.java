package jp.co.sevenandinm.kenshuu2015.seven005;

//* スキャナー関数をいちいち書かなくても良い文!!
import java.util.Scanner;


public class Class20150413_01{
	
	//*　メイン関数
	public static void main(String[] args){
	
		System.out.println("これから、最大値を求めます。");
		Scanner stdIn = new Scanner (System.in) ;
		System.out.println("まずは、aの値を入力してください");
		int input_a = stdIn.nextInt();
		System.out.println("次に、bの値を入力してください");
		int input_b = stdIn.nextInt();
		System.out.println("最後に、cの値を入力してください");
		int input_c = stdIn.nextInt();
		
		int max = max3(input_a, input_b, input_c);
		System.out.println("最大値は" + max + "です。");
	}

	
	//*最大値をint型で、返すため、int1関数にする
	//*3つの数字から読み取るから、max3(この中に、型をしてした変数を入れる)
	public static int max3(int a, int b, int c){
		
		
		//*ここで、maxの関数を指定しなおす!!!
		int max = a ; 
			if( max < b ){
				max = b;
			}
			if( max < c ){
				max = c;
			}
		
		//*ほしいのは、最大値なので、まず最初に、リターンを書く!!
			return max;
	
	}	
	
}

