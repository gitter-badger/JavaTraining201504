package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.ArrayList;

public class Class20150415_01{
	public static void main(String [] args){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("X");
		list.add("D");
		list.add("A");
		list.add("U");
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}