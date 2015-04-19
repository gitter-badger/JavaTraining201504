package jp.co.sevenandinm.kenshuu2015.seven007;
import java.util.*;


public class Class20150415_04 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
         
        // map.put("キー", "値") ;
        map.put("name", "Hirose");
    	map.put("name", "tentake");
        map.put("score", ""+90);
        map.put("age", ""+15);
         
       
    	Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
    		Object o = it.next();
		    System.out.println(o + " = " + map.get(o));
		}
    	
    }
}

