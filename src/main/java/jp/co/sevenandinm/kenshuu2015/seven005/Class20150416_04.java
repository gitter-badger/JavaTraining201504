package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.Scanner;
import java.util.Arrays;

public class Class20150416_04{
	public static void main(String[] args){

	int input_a [] = new int[10];
    int input_b [] = new int[10];
    
    
	System.out.println("これから2つの配列を等しいか判別していきます");
	
	System.out.println("まず、１つ目の配列を入力してください");
    Scanner stdIn_a = new Scanner(System.in);
	int i;
		for(i = 0; i < input_a.length; i++){
			System.out.println("数字を入力してください");
			input_a[i] = stdIn_a.nextInt();
		}
	
	System.out.println("次に２つ目の配列を入力してください");
    Scanner stdIn_b = new Scanner(System.in);
	int h;
		for(h = 0; h < input_b.length; h++){
			System.out.println("数字を入力してください");
			input_b[h] = stdIn_b.nextInt();
		}
		
		for(int s = 0; s < input_a.length; s++){
			System.out.println(input_a[s] + "；" + input_b[s]);	
		}
		
		if(Arrays.equals(input_a, input_b)){
			System.out.println("この2つの配列は等しいです");
		}else{
			System.out.println("この2つの配列は等しくありません");
		}
	}
}

