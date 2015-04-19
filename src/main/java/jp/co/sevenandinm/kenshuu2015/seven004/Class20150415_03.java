package jp.co.sevenandinm.kenshuu2015.seven004;
import java.util.*;

public class Class20150415_03{
	public static void main(String[] args){

	HashMap<String,String> map = new HashMap<String,String>();
	
	//map.put("キー","値");
	map.put("name","Hirose");
	map.put("name","kabesu");
	map.put("score",""+90);
	map.put("age",""+15);
	
	//System.out.println("name = " + map.get("name"));
	//System.out.println("score = " + map.get("score"));
	//System.out.println("age = " + map.get("age"));

		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o + " = " + map.get(o));
			
	}
}
}
