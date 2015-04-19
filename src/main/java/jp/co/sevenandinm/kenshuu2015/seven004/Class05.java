package jp.co.sevenandinm.kenshuu2015.seven004;
public class Class05{
  public static void main(String[] args){
  	
  	
  	int input1,input2,input3,d;
  	int Max_num=0;
  
  	//メッセージ出力
  	System.out.println("３つの数字の最大値を求めます");
	
  	//キーボードからの入力
	java.util.Scanner stdIn = new java.util.Scanner(System.in);
	input1= stdIn.nextInt();
	input2= stdIn.nextInt();
	input3= stdIn.nextInt();
  	
  	//計算
  	
  	//d=Math.max(input1,input2);
  	//Max_num= Math.max(d,input3);
  	
  	/*
  	Max_num=input1;
  	if(input2>Max_num){
  		Max_num=input2;
  		if(Max_num<input3){
  			Max_num=input3;
  		}
  		
  		
  		
  	}else{
  		if(input3>Max_num){
  			Max_num=input3;
  			
  		}
  	*/
  		if(input1>input2 && input1>input3){
  			Max_num=input1;
  			
  		}
  		
  		else if(input3<input2){
  		     Max_num=input2;
  		}
  		else {
  			Max_num=input3;
  		}

  	System.out.println("最大値は" +Max_num+ "です。");
}
	
}
