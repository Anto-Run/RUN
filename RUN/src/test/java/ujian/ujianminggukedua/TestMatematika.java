package ujian.ujianminggukedua;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Random;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class TestMatematika {
	
	Matematika mtk;
	Random rand;
	int intIndexAwal = 0;
	int intIndexAkhir = 0;
	double doInputSatu = 0.0;
	double doInputDua = 0.0;
	
	@BeforeClass
	public void befClass() {
		System.out.println("===========================");
	}
	@BeforeTest
	public void befTest() {
		mtk = new Matematika();
		rand = new Random();
		System.out.println("===========================");
		System.out.println("      Test Dimulai !!");
		System.out.println("===========================");
		
	}
	@BeforeMethod
	public void befMethod(){
		System.out.println("Before Method");
	}
	
	@Test(priority=0)
	public void testJumlahNilai() {
		System.out.println("===========================");
		System.out.println("  Test Penjumlahan Nilai   ");
		System.out.println("===========================");
		intIndexAwal = 1;
		intIndexAkhir = 100;
		doInputSatu = rand.nextDouble(intIndexAwal, intIndexAkhir);
		doInputDua = rand.nextDouble(intIndexAwal, intIndexAkhir);
		System.out.println("Nilai x: "+doInputSatu);
		System.out.println("Nilai x: "+doInputDua);
		assertEquals(mtk.jumlahNilaiActual(doInputSatu, doInputDua), mtk.jumlahNilaiExpect(doInputSatu, doInputDua));
		System.out.println("===========================");
		
	}
	
	@Test(priority=1)
	public void testKurangNilai() {
		System.out.println("===========================");
		System.out.println("  Test Pengurangan Nilai   ");
		System.out.println("===========================");
		intIndexAwal = 1;
		intIndexAkhir = 100;
		doInputSatu = rand.nextInt(intIndexAwal, intIndexAkhir);
		doInputDua = rand.nextInt(intIndexAwal, intIndexAkhir);
		System.out.println("Nilai x: "+doInputSatu);
		System.out.println("Nilai x: "+doInputDua);
		assertEquals(mtk.kurangNilaiActual(doInputSatu, doInputDua), mtk.kurangNilaiExpect(doInputSatu, doInputDua));
		System.out.println("===========================");
	}
	
	@Test (priority=2)
	public void testBagiNilai() {
		
		System.out.println("===========================");
		System.out.println("  Test Pembagian Nilai   ");
		System.out.println("===========================");
		intIndexAwal = 1;
		intIndexAkhir = 50;
		doInputSatu = rand.nextDouble(intIndexAwal, intIndexAkhir);
		doInputDua = rand.nextDouble(intIndexAwal, intIndexAkhir);
		System.out.println("Nilai x: "+doInputSatu);
		System.out.println("Nilai x: "+doInputDua);
		assertEquals(mtk.bagiNilaiActual(doInputSatu, doInputDua), mtk.bagiNilaiExpect(doInputSatu, doInputDua));
		System.out.println("===========================");
		
	}
	
	@Test (priority=3)
	public void testModulusNilai() {
		System.out.println("===========================");
		System.out.println("  Test Modulus Nilai   ");
		System.out.println("===========================");
		intIndexAwal = 1;
		intIndexAkhir = 50;
		doInputSatu = rand.nextDouble(intIndexAwal, intIndexAkhir);
		doInputDua = rand.nextDouble(intIndexAwal, intIndexAkhir);
		System.out.println("Nilai x: "+doInputSatu);
		System.out.println("Nilai x: "+doInputDua);
		assertEquals(mtk.modulusNilaiActual(doInputSatu, doInputDua), mtk.modulusNilaiExpect(doInputSatu, doInputDua));
		System.out.println("===========================");
		
	}
	
	@AfterClass
	public void aftClass()
	{
		
	}
	
	@AfterMethod
	public void aftMethod()
	{
		System.out.println("Test Method Selanjutnya");
		System.out.println("===========================");
	}
	
	@AfterTest
	public void aftTest()
	{
		System.out.println("===========================");
		System.out.println("Test Sudah Selesai Dilakukan");
		System.out.println("===========================");
	}

}