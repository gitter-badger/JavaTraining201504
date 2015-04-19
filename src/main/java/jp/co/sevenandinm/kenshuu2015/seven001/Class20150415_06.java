//TreeMapの使い方

		package jp.co.sevenandinm.kenshuu2015.seven001;

		import java.util.*;
		 
		class Class20150415_06 {
		    public static void main(String[] args) {
				TreeMap <String,String> map = new TreeMap<String,String>();
					 
				map.put("name", "Hirose");
				map.put("score", "" + 90);
				map.put("age", "" + 15);
		    	map.put("name", "小林");
					 
				Iterator<String> it = map.keySet().iterator();
				while (it.hasNext()) {
					 String o = it.next();
					 System.out.println(o + " = " + map.get(o));
					}
		    }
		}

