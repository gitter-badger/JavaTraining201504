package jp.co.sevenandinm.kenshuu2015.seven001;
//キャストの変換問題
public class Class20150414_01 {

    public static void main(String[] args) {

        int a;
        int b;
    	long c;

        a = 100;
        b = 120;
    	c = (long)( a + b ) * b * 100000000;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    	short d =  500; 
        c = a + d;
        System.out.println(c);

    	d = (short) (a + d);
        System.out.println(d);     
    }

}
