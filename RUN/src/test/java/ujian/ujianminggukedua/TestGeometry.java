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

public class TestGeometry {
	
		Geometry geo;
		Random rand;
		int intIndexAwal = 0;
		int intIndexAkhir = 0;
		double doInputSatu = 0.0;
		double doInputDua = 0.0;
		double doInputTiga = 0.0;
		
		@BeforeClass
		public void befClass()
		{
			
			System.out.println("Before Class");
		}
		
		@BeforeTest
		public void befTest() {
			geo = new Geometry();
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
		public void testLuasPersegi() {
			System.out.println("===========================");
			System.out.println("       Test Luas Persegi   ");
			System.out.println("===========================");
			intIndexAwal = 5;
			intIndexAkhir = 40;
			doInputSatu = rand.nextDouble(intIndexAwal, intIndexAkhir);
			System.out.println("Sisi Persegi: "+doInputSatu);
			assertEquals(geo.luasPersegiActual(doInputSatu), geo.luasPersegiExcept(doInputSatu), "Kedua Data Tidak Cocok");
			System.out.println("===========================");
		}
		
		@Test (priority=1)
		public void testLuasSegitiga() {
			System.out.println("===========================");
			System.out.println("      Test Luas Segitiga   ");
			System.out.println("===========================");
			intIndexAwal = 10;
			intIndexAkhir = 50;
			doInputSatu = rand.nextDouble(intIndexAwal, intIndexAkhir);
			doInputDua = rand.nextDouble(intIndexAwal, intIndexAkhir);
			System.out.println("Alas Segitiga: "+doInputSatu);
			System.out.println("Tinggi Segitiga: "+doInputDua);
			assertEquals(geo.luasSegitigaActual(doInputSatu, doInputDua), geo.luasSegitigaExcept(doInputSatu, doInputDua), "Kedua Data Tidak Cocok");
			System.out.println("===========================");
		}
		
		@Test (priority=2)
		public void testLuasTrapesium() {
			System.out.println("===========================");
			System.out.println("      Test Luas Trapesium   ");
			System.out.println("===========================");
			intIndexAwal = 10;
			intIndexAkhir = 100;
			doInputSatu = rand.nextDouble(intIndexAwal, intIndexAkhir);
			doInputDua = rand.nextDouble(intIndexAwal, intIndexAkhir);
			doInputTiga = rand.nextDouble(intIndexAwal, intIndexAkhir);
			System.out.println("Sisi A Trapesium: "+doInputSatu);
			System.out.println("Sisi B Trapesium: "+doInputDua);
			System.out.println("Tinggi Trapesium: "+doInputTiga);
			assertEquals(geo.luasTrapesiumActual(doInputSatu, doInputDua, doInputTiga), geo.luasTrapesiumExcept(doInputSatu, doInputDua, doInputTiga), "Kedua Data Tidak Cocok");
			System.out.println("===========================");
		}
		@AfterClass
		public void aftClass()
		{
			System.out.println("Ini Adalah After Class Class");
		}
		
		@AfterMethod
		public void aftMethod()
		{
			System.out.println("Ini Adalah After Method ");
		}
		
		@AfterTest
		public void aftTest()
		{
			System.out.println("===========================");
			System.out.println("Test Sudah Selesai Dilakukan");
			System.out.println("===========================");
		}

}