package jp.co.sevenandinm.kenshuu2015.seven002;

public class Class20150414_02 {
public static void main(String[] arg) {
        
	System.out.print("値を入力してください ");
	java.util.Scanner stdIn = new java.util.Scanner(System.in);
	int n= stdIn.nextInt();	
	
	 	;
	int i = 1;              
	
	int fact = 1;          
	while (i <= n) {        
		fact = fact * i;
			i++;                
	}

	System.out.println("結果 " + fact);
  }
}



//C:\Users\newemployee2\Desktop\work\repo_seven_2015\trunk\kenshuu2015\src\main\java>java jp.co.sevenandinm.kenshuu2015.seven002.Class20150414_02


//public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);

  //      if (n <0) 
//            System.out.println("非負の整数値を入力してください");
   //     else
 //           System.out.println(n + " の階乗 = " + factorial(n));
//    }

//    static int factorial(int n){
  //      int fact = 1;
//        if (n == 0)
    //        return  fact;
  //      else { // in case of n > 0
//            for (int i = n; i > 0; i--)
 //               fact *= i;
      //      return fact;
    //    }
  //  }
//}
