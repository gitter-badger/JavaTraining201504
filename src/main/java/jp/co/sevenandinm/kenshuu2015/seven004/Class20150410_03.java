
package jp.co.sevenandinm.kenshuu2015.seven004;
import java.util.*;
public class Class20150410_03{
  public static void main(String[] args){
	int i;
  	int sum = 0;
    System.out.println("nの値を入力してください。");
  	
  	//キーボードからの入力
  	Scanner stdIn = new Scanner(System.in);
  	int n = stdIn.nextInt();
  	
  	
  	for(i=1; i<=n; i++){
  		
  		sum= sum + i;
  	
  		
  	}
  	 System.out.println("合計：" +sum);
  
	
	}


}