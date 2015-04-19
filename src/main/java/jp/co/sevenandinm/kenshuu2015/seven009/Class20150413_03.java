package jp.co.sevenandinm.kenshuu2015.seven009;

public class Class20150413_03{
    public static void main(String args[]){
      	int i;
      	int j;
      	
		for(  i=1; i<=9; i++ ) {
        	for(  j=1; j<=9; j++ ) {
        		if ( ( i *j ) < 10  ){System.out.print( "" + i*j + "  ");
        		}else{ System.out.print( i*j + " ");
             	System.out.println(); }
        	}	
        }
    }
}