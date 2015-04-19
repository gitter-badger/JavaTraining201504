
package jp.co.sevenandinm.kenshuu2015.seven004;
import java.util.*;
public class Class20150410_01{
  public static void main(String[] args){
	
    System.out.println("名前を入力してください");
  	//キーボードからの入力
  	Scanner stdIn = new Scanner(System.in);
  	String name = stdIn.nextLine();
  	
  	//メッセージ出力
  	
  	System.out.println("お名前は：" +name);
  	System.out.println("こんにちは" +name+"さん。");
	
  	    Random rnd =new Random();
        String[] fortune = {"大吉", "吉", "中吉", "小吉", "末吉", "末吉", "凶"};

        int index = rnd.nextInt(fortune.length);
  	
        String[] color = {"赤","黒","青"};

        int index2 = rnd.nextInt(color.length);
   
 
    	System.out.println("あなたの今日の運勢は" +fortune[index]+"です。");
  	    System.out.println("あたなの今日のラッキーカラーは" +color[index2]+"です。");
	
	
	}


}







