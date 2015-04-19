package jp.co.sevenandinm.kenshuu2015.seven004;
import java.util.*;
public class Class20150410_02{
  public static void main(String[] args){
	
    System.out.println("整数を入力してください");
  	
  	//キーボードからの入力
  	Scanner stdIn = new Scanner(System.in);
  	int num = stdIn.nextInt();
  	
  	if(num >=10 && num<=100){
  		 System.out.println(+num);
  		
  	}
  	else{
  		System.out.println("エラーです。");
  	}
  	
  	   
	
	
	}


}