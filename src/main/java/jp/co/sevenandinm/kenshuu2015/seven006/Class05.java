package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.*;
public class Class05{
	public static void main(String [] args){
		MaxNum();
		MinNum();
	}
	
	public static void MaxNum(){
		int[] numbox=new int[3];
		int max=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3つの数字の最大値を求めます");
		for(int i=0;i<3;i++){
			System.out.println(i+1+"番目の数字を入力してください");
			numbox[i] = scan.nextInt();
			if(max<numbox[i]){
				max=numbox[i];
			}
		}
		System.out.println("3つの最大値は"+max+"です");
	}
	
	public static void MinNum(){
		int[] numbox=new int[3];
		int min=999999;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3つの数字の最小値を求めます");
		for(int i=0;i<3;i++){
			System.out.println(i+1+"番目の数字を入力してください");
			numbox[i] = scan.nextInt();
			if(min>numbox[i]){
				min=numbox[i];
			}
		}
		System.out.println("3つの最小値は"+min+"です");
	}
}