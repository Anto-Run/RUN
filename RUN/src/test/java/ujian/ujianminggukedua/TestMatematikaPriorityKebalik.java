package ujian.ujianminggukedua;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

class TestMatematikaPriorityKebalik {
	
	Matematika mtk;
	Random rand;
	int intIndexAwal = 0;
	int intIndexAkhir = 0;
	double doInputSatu = 0.0;
	double doInputDua = 0.0;
	
	@BeforeClass
	public void befClass() {
		System.out.println("=============================   Before Class!!  ===========================");
	}
	@BeforeTest
	public void befTest() {
		mtk = new Matematika();
		rand = new Random();
		System.out.println("========================= Test Dimulai !! ================================");	
		System.out.println("==========================  Priority !! ==================================");
		System.out.println("0: Modulus Nilai");
		System.out.println("1: Pembagian Nilai");
		System.out.println("2: Pengurangan Nilai");
		System.out.println("3: Penjumlahan Nilai");
		System.out.println("===========================================================================");
		
	}
	@BeforeMethod
	public void befMethod(){
		System.out.println("=============================   Before Method!!  ============================");
	}
	@Test(priority=3)
	public void testJumlahNilai() {
		System.out.println("========================== Test Penjumlahan Nilai ===========================");
		System.out.println("=============================   Mulai!!  ====================================");
		intIndexAwal = 1;
		intIndexAkhir = 100;
		doInputSatu = rand.nextDouble(intIndexAwal, intIndexAkhir);
		doInputDua = rand.nextDouble(intIndexAwal, intIndexAkhir);
		System.out.println("Nilai x: "+doInputSatu);
		System.out.println("Nilai x: "+doInputDua);
		assertEquals(mtk.jumlahNilaiActual(doInputSatu, doInputDua), mtk.jumlahNilaiExpect(doInputSatu, doInputDua),"Kedua data tidak cocok");
		System.out.println("=============================   Selesai!!  ====================================");
		
	}
	
	@Test(priority=2)
	public void testKurangNilai() {
		System.out.println("========================== Test Pengurangan Nilai ===========================");
		System.out.println("=============================   Mulai!!  ====================================");
		intIndexAwal = 1;
		intIndexAkhir = 100;
		doInputSatu = rand.nextInt(intIndexAwal, intIndexAkhir);
		doInputDua = rand.nextInt(intIndexAwal, intIndexAkhir);
		System.out.println("Nilai x: "+doInputSatu);
		System.out.println("Nilai x: "+doInputDua);
		assertEquals(mtk.kurangNilaiActual(doInputSatu, doInputDua), mtk.kurangNilaiExpect(doInputSatu, doInputDua),"Kedua data tidak cocok");
		System.out.println("=============================   Selesai!!  ====================================");
	}
	@Test(priority=1)
	public void testBagiNilai() {
		
		System.out.println("========================== Test Pembagian Nilai ===========================");
		System.out.println("=============================   Mulai!!  ====================================");
		intIndexAwal = 1;
		intIndexAkhir = 50;
		doInputSatu = rand.nextDouble(intIndexAwal, intIndexAkhir);
		doInputDua = rand.nextDouble(intIndexAwal, intIndexAkhir);
		System.out.println("Nilai x: "+doInputSatu);
		System.out.println("Nilai x: "+doInputDua);
		assertEquals(mtk.bagiNilaiActual(doInputSatu, doInputDua), mtk.bagiNilaiExpect(doInputSatu, doInputDua),"Kedua data tidak cocok");
		System.out.println("=============================   Selesai!!  ====================================");
		
	}
	
	@Test(priority=0)
	public void testModulusNilai() {
		System.out.println("========================== Test Modulus Nilai ===============================");
		System.out.println("=============================   Mulai!!  ====================================");
		intIndexAwal = 1;
		intIndexAkhir = 50;
		doInputSatu = rand.nextDouble(intIndexAwal, intIndexAkhir);
		doInputDua = rand.nextDouble(intIndexAwal, intIndexAkhir);
		System.out.println("Nilai x: "+doInputSatu);
		System.out.println("Nilai x: "+doInputDua);
		assertEquals(mtk.modulusNilaiActual(doInputSatu, doInputDua), mtk.modulusNilaiExpect(doInputSatu, doInputDua),"Kedua data tidak cocok");
		System.out.println("=============================   Selesai!!  ====================================");
		
	}
	
	@AfterClass
	public void aftClass()
	{
		System.out.println("=============================   After Class!  ================================");
	}
	
	@AfterMethod
	public void aftMethod()
	{
		System.out.println("=============================   After Method!!  ==============================");
	}
	
	@AfterTest
	public void aftTest()
	{
		System.out.println("========================= Test Selesai !! ===================================");
	}

}