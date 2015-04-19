//Arraysクラスの使い方
	package jp.co.sevenandinm.kenshuu2015.seven001;

	import java.util.Arrays;
	class Class20150415_07{
		public static void main(String[] args){
	
//配列の宣言
		Integer[] values = { 23, 46, 15, 78, 6, 95, 30 };
	
//降順
		//Arrays.sort(values, Collections.reverseOrder());
		
//昇順
		Arrays.sort(values);

        for(Integer value : values){
            System.out.println(value);
        }
	
	}
	}

