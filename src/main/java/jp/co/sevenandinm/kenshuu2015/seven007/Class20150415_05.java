package jp.co.sevenandinm.kenshuu2015.seven007;
import java.util.*;


public class Class20150415_05 {
    public static void main(String[] args) {
        TreeMap<String,String> map = new TreeMap<String,String>();
 
		map.put("name", "Hirose");
		map.put("score", ""+90);
		map.put("age", ""+15);
		 
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
		    Object o = it.next();
		    System.out.println(o + " = " + map.get(o));
		}
    	
    }
}


