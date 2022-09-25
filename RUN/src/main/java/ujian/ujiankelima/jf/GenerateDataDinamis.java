package ujian.ujiankelima.jf;

import java.util.Random;

public class GenerateDataDinamis {
	static Random rand = new Random();

	public static void main(String[] args) {
		generateInteger(10, 1, 100);
		generateDouble(10, 1, 100);
	}
	public static void generateInteger(int jumlahData, int indexAwal, int indexAkhir) {
		System.out.println("---------------------------------------------------------------");
		System.out.println("            Generate Data Integer");
		System.out.println("---------------------------------------------------------------");
		int[] intNext = new int[jumlahData];
		for(int i=0;i<jumlahData;i++)
		{
			intNext[i] = rand.nextInt(indexAwal,indexAkhir);
		}
		for(int i=0;i<jumlahData;i++)
		{
			System.out.println("Data ke "+ i + ": "+intNext[i]);
		}
		System.out.println("---------------------------------------------------------------");
		
	}
	public static void generateDouble(int jumlahData, int indexAwal, int indexAkhir) {
		System.out.println("---------------------------------------------------------------");
		System.out.println("         Generate Data Double");
		System.out.println("---------------------------------------------------------------");
		double[] doNext = new double[jumlahData];
		for(int i=0;i<jumlahData;i++)
		{
			doNext[i] = rand.nextDouble(indexAwal, indexAkhir);
		}
		for(int i=0;i<jumlahData;i++)
		{
			System.out.println("Data ke " + i + ": "+doNext[i]);
		}
		System.out.println("---------------------------------------------------------------");
		
	}
}
