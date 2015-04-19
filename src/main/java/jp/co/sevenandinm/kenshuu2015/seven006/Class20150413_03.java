package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.*;
public class Class20150413_03{
	public static void main(String [] args){
		//表の一番上のテーブル部分
		System.out.print("     |  ");
		for(int i=1;i<10;i++){
			System.out.print("  " +i+ "  ");
		}
		System.out.println("");
		for(int i=0;i<10;i++){
			System.out.print("------");
		}
		System.out.println("");
	
		//中身
		for(int i=1;i<10;i++){
			System.out.println("     "+"|");
			System.out.print("  " +i+ "  "+"|");
			
			for(int j=1;j<10;j++){
				if((i*j)<10){
					System.out.print("    ");
				}
				else{
					System.out.print("   ");
				}
				System.out.print(i*j);
				
			}
			
		System.out.println("");
		}
	}
	
}