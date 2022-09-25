package ujian.ujiankelima.jf;

import java.util.Scanner;

public class MenghitungMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double doX = 0.0;
		double doY = 0.0;
		String strChoice = new String();
		do {
			try {
				System.out.print("Masukan Nilai (bilangan bulat/desimal) X : ");
				doX = sc.nextDouble();
				System.out.print("Masukan Nilai Y (bilangan bulat/desimal) : ");
				doY = sc.nextDouble();
				
				System.out.println("Hasil Math.Sqrt(x) : " + Math.sqrt(doX));
				System.out.println("Hasil Math.pow(x, y): " + Math.pow(doX, doY));
				System.out.println("Hasil Math.Round(x) : " + Math.round(doX));
				System.out.println("Hasil Math.ceil (y) : " + Math.ceil(doY));
				System.out.println("Hasil Math.floor (x) : " + Math.floor(doX));
				System.out.println("Hasil Math.max(x, y): " + Math.max(doX, doY));
				System.out.println("Hasil Math.min(x, y): " + Math.min(doX, doY));
				System.out.println("Hasil Math.sin(x): "+Math.sin(doX));
				System.out.println("Hasil Math.cos(y): "+Math.cos(doY));
			}catch(NumberFormatException e) {
				System.out.println("Terjadi Eror : "+ e);
			}
			System.out.print("Apakah anda akan menghitung Math lagi? (Y / N) : ");
			strChoice= sc.next();
			
		}while (strChoice.equalsIgnoreCase("y"));
		System.out.println("Selesai");

	}

}
