package jp.co.sevenandinm.kenshuu2015.seven008;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;

public class Class20150415_03{
	public static void main(String[] args){
		System.out.println("HashMapの連想配列です");
		
		//HashMapの連想配列
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("name","Hirose");
		map.put("score", "" + 90);
		map.put("age" , "" + 15);
		
		System.out.println("name = " + map.get("name"));
		System.out.println("score = " + map.get("score"));
		System.out.println("age = " + map.get("age"));
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			String o = it.next();
			System.out.println(o + " = " + map.get(o));
		}
		
		//TreeMapの連想配列
		System.out.println("TreeMapの連想配列です");
		
		TreeMap<String,String> map_2 = new TreeMap<String,String>();
 
		map_2.put("name", "Tsutsumi");
		map_2.put("score", "" + 223);
		map_2.put("age",  "" + 223);
 
		Iterator<String> it_2 = map.keySet().iterator();
		while (it_2.hasNext()) {
    		String k = it_2.next();
    		System.out.println(k + " = " + map_2.get(k));
		}
	}
}