package jp.co.sevenandinm.kenshuu2015.seven003;	
public class Class20150413_03 {
	
        public static void main(String[] args) {
	
             System.out.println("九九の表");
	
				int kuku[][] = new int[9][9];
	
	
                    for( int i=0; i<9; i++ ) {
	                	for( int j=0; j<9; j++ ){
	                		 kuku[i][j] = (i+1) * (j+1);	
                      }
                    }
        			         
        	
                    for( int i=0; i<9; i++ ) {	
                      for( int j=0; j<9; j++ ) { 
                              System.out.print(kuku[i][j] +"");
                      	if(i+j<9){
                      		System.out.print("  ");
                      	} else{
                      		System.out.print("  ");
                          }
                      }
     						  System.out.println();	
                    }
        	
        }
	
}

	
	
	