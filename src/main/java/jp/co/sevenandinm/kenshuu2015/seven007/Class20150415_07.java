package jp.co.sevenandinm.kenshuu2015.seven007;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;


public class Class20150415_07 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
         
        // map.put("キー", "値") ;
        map.put("name", "Hirose");
        map.put("score", ""+90);
        map.put("age", ""+15);
    	
    	
    	Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o + " = " + map.get(o));

        }
	
    	Set<Entry<String,String>> set = map.entrySet();
    	Iterator<Entry<String,String>> it2 = set.iterator();
    	while(it2.hasNext()){
    		Entry<String,String> o = it2.next();
    		System.out.println(o);
    	}
    	
    	for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + "  value :" + value);
        }
    	
    }
}







