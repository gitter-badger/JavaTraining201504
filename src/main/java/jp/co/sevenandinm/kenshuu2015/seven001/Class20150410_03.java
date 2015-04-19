package jp.co.sevenandinm.kenshuu2015.seven001;
import java.util.*;
//1からn(入力したもの)までを足す
public class Class20150410_03{
	public static void main(String[] args){
		
		String message = "数値を入力してください。";
		int sum = 0;
		
//画面にメッセージ表示
		System.out.println( message );
		
//キーボードからの入力
		Scanner stdIn = new Scanner(System.in);
		int in_input_no = stdIn.nextInt();
		
//繰り返し
		for( int i = 1 ; i <= in_input_no ; i++ ){
			sum = sum + i;
		}
		System.out.println( sum );
		
	}
}

