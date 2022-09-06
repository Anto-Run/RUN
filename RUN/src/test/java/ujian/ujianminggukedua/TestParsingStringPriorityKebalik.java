package ujian.ujianminggukedua;

import static org.testng.Assert.assertEquals;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestParsingStringPriorityKebalik {
	ParsingString ps;
	int intLengthString =0;
    boolean useLetters = false;
    boolean useNumbers = true;
    String strInput = "";
	
	@BeforeClass
	public void befClass()
	{
		System.out.println("=============================   Before Class!!  ============================");
	}
	
	@BeforeTest
	public void befTest() {
		ps = new ParsingString();
		System.out.println("========================= Test Dimulai !! ================================");	
		System.out.println("==========================  Priority !! ==================================");
		System.out.println("0: Parsing String to Float");
		System.out.println("1: Parsing String to Double");
		System.out.println("2: Parsing String to Int");
		System.out.println("===========================================================================");
		
		
	}
	@BeforeMethod
	public void befMethod(){
		System.out.println("=============================   Before Method!!  ============================");
	}
	
	@Test(priority = 2)
	public void testParsingStringToInt() {
		System.out.println("=================== Test Parsing String to Int !! ========================");	
		System.out.println("==========================  Mulai !! =====================================");
		//range -2147483648 s.d. 2147483647 (10 digit) //sudah tidak bisa
	    intLengthString = 9;
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);
		System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToIntActual(strInput),ps.parseStringToIntExpect(strInput), "Kedua data tidak cocok");
		System.out.println("==========================  Selesai !! ====================================");
	}
	@Test(priority = 1)
	public void testParsingStringtoDouble() {
		System.out.println("=================== Test Parsing String to Double !! ====================");	
		System.out.println("==========================  Mulai !! ====================================");
		// +/- 1.8 x 10308 panjang digit (presisi) : 15/masih bisa
	    intLengthString = 15;
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);
		System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToDoubleActual(strInput),ps.parseStringToDoubleExpect(strInput), "Kedua data tidak cocok");
	    System.out.println("==========================  Selesai !! ====================================");
	}

	@Test (priority=0)
	public void testParsingStringToFloat() {
		System.out.println("=================== Test Parsing String to Float !! ====================");	
		System.out.println("==========================  Mulai !! ====================================");
		//range +/- 3.4 x 1038 jumlah digit: 6-7
	    intLengthString = 6;
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);   
	    System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToFloatActual(strInput),ps.parseStringToFloatExpect(strInput), "Kedua data tidak cocok");
	    System.out.println("==========================  Selesai !! ====================================");
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