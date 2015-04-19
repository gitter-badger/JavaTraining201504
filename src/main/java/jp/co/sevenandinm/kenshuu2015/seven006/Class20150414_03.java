package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.*;

public class Class20150414_03{
	public static void main(String [] args){
		
		HashMap<String,String> map= new HashMap<String,String>();
		
		map.put("name", "Hirose");
		map.put("score",""+ 90);
		map.put("age", ""+15);
		
		System.out.println("name = " + map.get("name"));
		System.out.println("score = " + map.get("score"));
		System.out.println("age = " + map.get("age"));
    }
}