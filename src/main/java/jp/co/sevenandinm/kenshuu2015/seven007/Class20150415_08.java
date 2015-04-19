package jp.co.sevenandinm.kenshuu2015.seven007;
import java.util.*;
import java.util.Arrays;
import jp.co.sevenandinm.kenshuu2015.maekawa.Class20150415_02;


public class Class20150415_08 {
    public static void main(String[] args) {
    	
    	

       	
    	int list_a [] = new int [4];
    	int list_b [] = new int [4];
    	
    	System.out.println("数値を４つ入力してください");
    	Scanner stdIn = new Scanner(System. in);
    	for ( int i = 0; i < 4; i++ ){
    		list_a [i] = stdIn.nextInt();
    	}

    	
    	System.out.println("数値を４つ入力してください");
    	Scanner stdInn = new Scanner(System. in);
		for ( int j = 0; j< 4; j++ ){
		    		list_b [j] = stdInn.nextInt();
		    	}
    	
    	if( Arrays.equals(list_a , list_b) ){
    		System.out.println("配列は同じです");
    	}else {
    		System.out.println("配列が違います");
    	}
    	
    	Class20150415_02 hikaku = new Class20150415_02();
		hikaku.execute();
    }	
}


