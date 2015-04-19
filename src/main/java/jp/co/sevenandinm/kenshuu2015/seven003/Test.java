package jp.co.sevenandinm.kenshuu2015.seven003;

import java.util.*;

public class Test{
	public static void main (String[] args) {
		//ArrayList list = new ArrayList();
		ArrayList<String> list = new ArrayList <String> ();
		list.add("X");
		list.add("D"); 
		list.add("A");
		list.add("U");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}


