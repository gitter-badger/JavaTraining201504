//HashMapの使い方

package jp.co.sevenandinm.kenshuu2015.seven001;

	import java.util.*;
	 
	class Class20150415_05 {
	    public static void main(String[] args) {
	        HashMap < String,String > map = new HashMap < String,String >();
	         
	        // map.put("キー", "値") ;
	    	map.put("name", "hirose");
	        map.put("score", ""+90);
	        map.put("age", ""+15);
	    	map.put("name", "小林");
	         
	        //System.out.println("name = " + map.get("name"));
	        //System.out.println("score = " + map.get("score"));
	        //System.out.println("age = " + map.get("age"));
	    	
	    	
	    	Iterator <String> it = map.keySet().iterator();
			while (it.hasNext()) {
			    String o = it.next();
			    System.out.println(o + " = " + map.get(o));
			}
	    }
	}
	