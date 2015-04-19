package jp.co.sevenandinm.kenshuu2015.seven002;
import java.util.TreeMap;
import java.util.Iterator;
public class Class20150415_03 {

public static void main(String[] args) {
TreeMap <String,String> map = new TreeMap<String,String>();

	// map.put("キー", "値") ;
	map.put("name", "zaki");
	map.put("score",""+ 90);
	map.put("age", ""+15);
	
Iterator<String> it = map.keySet().iterator();
	while (it.hasNext()) {
    	String o = it.next();
    System.out.println(o + " = " + map.get(o));
}
	
	
 System.out.println("name = " + map.get("name"));
        System.out.println("score = " + map.get("score"));
        System.out.println("age = " + map.get("age"));
    }
}





