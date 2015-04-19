package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.*;
public class Class04{
	public static void main(String [] args){
		
		double input=0;
		double surface_area=0;
		double volume=0;
		double pi=3.1416;
		
		System.out.println("入力してください");
		
		Scanner scan = new Scanner(System.in);
		input = scan.nextDouble();
		
		surface_area= 4*pi* Math.pow(input, 2);
		volume=(4/3)*pi*Math.pow(input, 3);
		
		
		System.out.println(surface_area);
		System.out.println(volume);
	
	}
}