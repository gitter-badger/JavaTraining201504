package jp.co.sevenandinm.kenshuu2015.seven009;
import java.util.Scanner;

public class Regx_PhoneNumber {


	public static void main (String[] args){
		Regx_PhoneNumber my =new Regx_PhoneNumber();
		String str = my.inputData();
		boolean truefalse = my.execute(str);
		my.dispOut(truefalse);

	}
	private String inputData() {   //-------------------------------------------------------入力
		Scanner stdIn = new java.util.Scanner(System.in);
	  	System.out.println ("番号を入力して下さい");String num = stdIn.next();

		boolean judge= execute(num);//judgeが帰ってくる

		return num;
	}


	private boolean execute(String num ) {   //-------------------------------------------------------判定


		boolean re ;

		re = num.matches("[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]");

		return re;
	}

	private void dispOut(boolean judge) {   //-------------------------------------------------------出力

		if(judge == true){
			System.out.println ("あなたの打ち込んだ番号は電話番号ですね");
		}else if(judge == false){
			System.out.println ("あなたの打ち込んだ番号はただの番号でしかありません");

		}

	}




	}
//}

