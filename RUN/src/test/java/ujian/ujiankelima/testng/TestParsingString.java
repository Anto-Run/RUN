package ujian.ujiankelima.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestParsingString {
	ParsingString ps;
	int intLengthString =0;
    boolean useLetters = false;
    boolean useNumbers = true;
    String strInput = "";
	Random rand = new Random();
	
	
	@BeforeTest
	public void befTest() {
		ps = new ParsingString();
		System.out.println("--------------------- Test Dimulai !! ---------------------");	
		System.out.println("-----------------------------------------------------------");	
		System.out.println("0: Parsing String to byte");
		System.out.println("1: Parsing String to Short");
		System.out.println("2: Parsing String to Int");
		System.out.println("3: Parsing String to Double");
		System.out.println("4: Parsing String to Float");
		System.out.println("5: Parsing String to Long");
		System.out.println("-----------------------------------------------------------");	
		
		
	}
	@BeforeMethod
	public void befMethod(){
	
	}
	
	@Test(priority = 0)
	public void testParsingStringToByte() {
		System.out.println("------------------- Test Parsing String to Byte !! ----------------------");	
		//range -128 s.d. 127 (4 digit) //sudah tidak bisa
		intLengthString = rand.nextInt(1, 3);
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);
		System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToByteActual(strInput),ps.parseStringToByteExpect(strInput), "Kedua data tidak cocok");
	    System.out.println("--------------------------------------------------------------------------");	
	}
	
	@Test(priority = 1)
	public void testParsingStringToShort() {
		System.out.println("------------------- Test Parsing String to Short !! ----------------------");	
		//range -32768 s.d. 32767 (5 digit) //sudah tidak bisa
		intLengthString = rand.nextInt(1, 4);
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);
		System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToShortActual(strInput),ps.parseStringToShortExpect(strInput), "Kedua data tidak cocok");
	    System.out.println("--------------------------------------------------------------------------");	
	}
	
	
	@Test(priority = 2)
	public void testParsingStringToInt() {
		System.out.println("------------------- Test Parsing String to Int !! ------------------------");	
		//range -2147483648 s.d. 2147483647 (10 digit) //sudah tidak bisa
		intLengthString = rand.nextInt(1, 9);
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);
		System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToIntActual(strInput),ps.parseStringToIntExpect(strInput), "Kedua data tidak cocok");
	    System.out.println("--------------------------------------------------------------------------");
	}
	@Test (priority=3)
	public void testParsingStringtoDouble() {
		System.out.println("------------------- Test Parsing String to Double !! ------------------------");	
		// +/- 1.8 x 10308 panjang digit (presisi) : 15/masih bisa
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);
		System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToDoubleActual(strInput),ps.parseStringToDoubleExpect(strInput), "Kedua data tidak cocok");
	    System.out.println("--------------------------------------------------------------------------");
	}

	@Test (priority=4)
	public void testParsingStringToFloat() {
		System.out.println("------------------- Test Parsing String to Float !! ------------------------");
		//range +/- 3.4 x 1038 jumlah digit: 6-7
		intLengthString = rand.nextInt(1, 6);
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);   
	    System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToFloatActual(strInput),ps.parseStringToFloatExpect(strInput), "Kedua data tidak cocok");
	    System.out.println("--------------------------------------------------------------------------");
	}
	
	@Test (priority=5)
	public void testParsingStringToLong() {
		System.out.println("------------------- Test Parsing String to Long !! ------------------------");
		//range-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 jumlah digit: 19
		intLengthString = rand.nextInt(1, 15);
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);   
	    System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToLongActual(strInput),ps.parseStringToLongExpect(strInput), "Kedua data tidak cocok");
	    System.out.println("--------------------------------------------------------------------------");
	}
	@AfterMethod
	public void aftMethod()
	{
		 System.out.println("----------------------------------- Selesai --------------------------------------");
	}
	
	@AfterTest
	public void aftTest()
	{System.out.println("---------------------------------- Test Selesai --------------------------------------");

	}
}