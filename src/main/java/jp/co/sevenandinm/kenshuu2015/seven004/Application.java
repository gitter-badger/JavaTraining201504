package jp.co.sevenandinm.kenshuu2015.seven004;

import java.util.Scanner;

public class Application{

	public static void main(String[] args) {



	System.out.println("生年月日を入力して下さい");

	Scanner stdIn = new Scanner(System.in);


	int nen = stdIn.nextInt();
	System.out.println("年:" + nen);

	int tsuki = stdIn.nextInt();
	System.out.println("月:"+ tsuki);

	int hi = stdIn.nextInt();
	System.out.println("日:"+ hi);


	if(3==tsuki && 21>=hi || 4==tsuki && 19>=hi){

      Ohituji ohituji = new Ohituji();

      System.out.println("星座は:"+ohituji.getJapaneseName());

	}else if(4==tsuki && 20>=hi || 5==tsuki && 20>=hi){

	      Oushi oushi = new Oushi();

	      System.out.println("星座は:"+oushi.getJapaneseName());

		}else if(5==tsuki && 21>=hi || 6==tsuki && 21>=hi){

		      Hutago hutago = new Hutago();

		      System.out.println("星座は:"+hutago.getJapaneseName());

			}else if(6==tsuki && 22>=hi || 7==tsuki && 22>=hi){

			      Kani kani = new Kani();

			      System.out.println("星座は:"+kani.getJapaneseName());

				}else if(7==tsuki && 23>=hi || 8==tsuki && 22>=hi){

				      Shishi shishi = new Shishi();

				      System.out.println("星座は:"+shishi.getJapaneseName());

					}else if(8==tsuki && 23>=hi || 9==tsuki && 22>=hi){

					      Otome otome = new Otome();

					      System.out.println("星座は:"+otome.getJapaneseName());

						}else if(5==tsuki && 21>=hi || 6==tsuki && 21>=hi){

						      Tenbin tenbin = new Tenbin();

						      System.out.println("星座は:"+tenbin.getJapaneseName());

							}else if(10==tsuki && 24>=hi || 11==tsuki && 22>=hi){

							      Sasori sasori = new Sasori();

							      System.out.println("星座は:"+sasori.getJapaneseName());

								}else if(11==tsuki && 23>=hi || 12==tsuki && 21>=hi){

								      Ite ite = new Ite();

								      System.out.println("星座は:"+ite.getJapaneseName());

									}else if(12==tsuki && 22>=hi || 1==tsuki && 19>=hi){

									      Yagi yagi = new Yagi();

									      System.out.println("星座は:"+yagi.getJapaneseName());

										}else if(1==tsuki && 20>=hi || 2==tsuki && 18>=hi){

										      Mizugame mizugame = new Mizugame();

										      System.out.println("星座は:"+mizugame.getJapaneseName());

											}else if(2==tsuki && 19>=hi || 3==tsuki && 20>=hi){

											      Uo uo = new Uo();

         									      System.out.println("星座は:"+uo.getJapaneseName());

												}

	 int nenrei;
	 nenrei=2015-nen;
	 System.out.println("年齢は:"+nenrei);

	 int umaretekara;
	 umaretekara= nenrei*365;
	 System.out.println("生まれてから今日まで:"+umaretekara+"日が経過しています。");

	}




}
