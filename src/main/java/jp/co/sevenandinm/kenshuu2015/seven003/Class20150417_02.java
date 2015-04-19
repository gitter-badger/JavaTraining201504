package jp.co.sevenandinm.kenshuu2015.seven003;

import java.util.Scanner;

public class Class20150417_02 {
 public static void main(String[] args){


		System.out.println("これからあなたのユーザーIDを作成します");
		System.out.println("まず、登録年月日を入力してください");

		Scanner stdIn = new Scanner (System.in);
			String getUserId = stdIn.nextLine();

		System.out.println("これがあなたのユーザーIDです");
		System.out.println(getUserId + 8085);

 }
}

