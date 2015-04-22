package jp.co.sevenandinm.kenshuu2015.seven009.Class_201504kako;

import java.util.*;
 
class Class20150415_04 {
    public static void main(String[] args) {
        HashMap < String,String> map = new HashMap<String,String> ();
         
        // map.put("キー", "値") ;
        map.put("name", "Hirose");
        map.put("score", "90");
        map.put("age", "15");
         
        System.out.println("name = " + map.get("name"));
        System.out.println("score = " + map.get("score"));
        System.out.println("age = " + map.get("age"));
    }
}
