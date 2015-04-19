package jp.co.sevenandinm.kenshuu2015.seven005;
public class Class20150413_04{
	public static void main(String[] args){
	
		System.out.println("今から、掛け算の表を表します。");
		int i ;
		int h ;
		int kuku;
		
		for( i = 1 ; i <= 9 ; i++){
			for( h = 1 ; h <= 9 ; h++){
				kuku = i * h ;
				
				if( kuku > 0 && 9 >= kuku){
					System.out.print(" "+ kuku + "  ");
				}else{
					System.out.print(kuku +"  ");
				}
			}	
				System.out.println();
		}
	}
}

