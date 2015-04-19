package jp.co.sevenandinm.kenshuu2015.seven002;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Class20150415_04 {

public static void main(String[] args) {
HashMap <String,String> map = new HashMap<String,String>();
 
 // map.put("キー", "値") ;
	map.put("name", "zaki");
	map.put("score",""+ 90);
	map.put("age", ""+15);
	
Iterator<String> it = map.keySet().iterator();
	while (it.hasNext()) {
    	String o = it.next();
    System.out.println(o + " = " + map.get(o));
	
	for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + "  value :" + value);
        }
}
}
}
 