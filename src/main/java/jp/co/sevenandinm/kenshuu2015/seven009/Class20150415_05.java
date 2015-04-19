package jp.co.sevenandinm.kenshuu2015.seven009;

import java.util.*;
 
class Class20150415_05 {
    public static void main(String[] args) {
        HashMap < String,String> map = new HashMap<String,String> ();
         
        // map.put("キー", "値") ;
        map.put("name", "Hirose");
        map.put("score", "90");
        map.put("age", "15");
        map.put("name", "meguko");
    	
    	
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
    	String o = it.next();
    	System.out.println(o + " = " + map.get(o));
		}
    	
     
    }
}
