//coded by irsyaadul ibaad
import java.util.*;
class MataUang{
	public static void main (String[] args){
		
		MataUang uang = new MataUang();
		uang.lembar();

	}
	public void lembar(){

		int a = 100;
		int b = 200;
		int c = 500;
		int d = 1000;
		int e = 2000;
		int f = 5000;
		int g = 10000;
		int h = 20000;
		int i = 50000;
		int j = 100000;

		System.out.println();

		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Nilai uang : ");
		long nilai = input.nextLong();
		System.out.println();

		if(nilai > j ){

			long lembarJ = nilai / j ;
			long sisaJ = nilai % j ;

			long lembarI = sisaJ / i ;
			long sisaI = sisaJ % i ;

			long lembarH = sisaI / h ;
			long sisaH = sisaI % h ;

			long lembarG = sisaH / g ;
			long sisaG = sisaH % g ;

			long lembarF = sisaG / f ;
			long sisaF = sisaG % f ;

			long lembarE = sisaF / e ;
			long sisaE = sisaF % e ;

			long lembarD = sisaE / d ;
			long sisaD = sisaE % d ;

			long koinC = sisaD / c ;
			long sisaC = sisaD % c ;

			long koinB = sisaC / b ;
			long sisaB = sisaC % b ;

			long koinA = sisaB / a ;
			long sisaA = sisaB % a ;

			long koin50 = sisaA / 50 ;
			long sisa50 = sisaA % 50 ;

			System.out.println(lembarJ + " lembar pecahan 100.000");
			System.out.println(lembarI + " lembar pecahan 50.000");
			System.out.println(lembarH + " lembar pecahan 20.000");
			System.out.println(lembarG + " lembar pecahan 10.000");
			System.out.println(lembarF + " lembar pecahan 5.000");
			System.out.println(lembarE + " lembar pecahan 2.000");
			System.out.println();
			System.out.println(lembarD + " lembar/keping pecahan 1.000");
			System.out.println(koinC + " keping pecahan 500");
			System.out.println(koinB + " keping pecahan 200");
			System.out.println(koinA + " keping pecahan 100");
			System.out.println();
			System.out.println(koin50 + " keping pecahan 50");
			System.out.println();
			System.out.println(sisa50 + " keping pecahan sen");
		}

		else if(nilai < j){

			long lembarI = nilai / i ;
			long sisaI = nilai % i ;

			long lembarH = sisaI / h ;
			long sisaH = sisaI % h ;

			long lembarG = sisaH / g ;
			long sisaG = sisaH % g ;

			long lembarF = sisaG / f ;
			long sisaF = sisaG % f ;

			long lembarE = sisaF / e ;
			long sisaE = sisaF % e ;

			long lembarD = sisaE / d ;
			long sisaD = sisaE % d ;

			long koinC = sisaD / c ;
			long sisaC = sisaD % c ;

			long koinB = sisaC / b ;
			long sisaB = sisaC % b ;

			long koinA = sisaB / a ;
			long sisaA = sisaB % a ;

			long koin50 = sisaA / 50 ;
			long sisa50 = sisaA % 50 ;

			System.out.println("0 lembar pecahan 100.000");
			System.out.println(lembarI + " lembar pecahan 50.000");
			System.out.println(lembarH + " lembar pecahan 20.000");
			System.out.println(lembarG + " lembar pecahan 10.000");
			System.out.println(lembarF + " lembar pecahan 5.000");
			System.out.println(lembarE + " lembar pecahan 2.000");
			System.out.println();
			System.out.println(lembarD + " lembar/keping pecahan 1.000");
			System.out.println(koinC + " keping pecahan 500");
			System.out.println(koinB + " keping pecahan 200");
			System.out.println(koinA + " keping pecahan 100");
			System.out.println();
			System.out.println(koin50 + " keping pecahan 50");
			System.out.println();
			System.out.println(sisa50 + " keping pecahan sen");
		}

		

	}
}