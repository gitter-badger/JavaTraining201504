package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.Scanner;

public class Class20150416_01{
	public static void main(String[] args){


	int input_a [] = new int[2];
    int input_b [] = new int[2];
    
    
	System.out.println("これから2つの配列を等しいか判別していきます");
	
	System.out.println("まず、１つ目の配列を入力してください");
    Scanner stdIn_a = new Scanner(System.in);
    input_a [0] = stdIn_a.nextInt();
    input_a [1] = stdIn_a.nextInt();
    
    
	System.out.println("次に、２つ目の配列を入力してください");
    Scanner stdIn_b = new Scanner(System.in);
    input_b [0] = stdIn_b.nextInt();
    input_b [1] = stdIn_b.nextInt();
    
    
		if(input_a [0] == input_b [0] && input_a [1] == input_b [1]){
			System.out.println("この２つの配列は正しいです。");
		}else{
            System.out.println("この２つの配列は、等しくありません");
        }
	}
}

