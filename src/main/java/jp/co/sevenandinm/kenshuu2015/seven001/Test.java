//ArrayListの使い方
package jp.co.sevenandinm.kenshuu2015.seven001;

	import java.util.*;
	class Test{
	public static void main(String[] args){
		ArrayList <String> list = new ArrayList<String>();
		list.add("X");
		list.add("D");
		list.add("A");
		list.add("U");
		
		for (int i = 0; i < list.size() ; i++){
			System.out.println(list.get(i));
		}
		}

	}
