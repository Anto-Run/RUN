package ujian.ujianminggukedua;


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
	
	@BeforeClass
	public void befClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void befTest() {
		ps = new ParsingString();
		System.out.println("===========================");
		System.out.println("      Test Dimulai !!");
		System.out.println("===========================");
		
	}
	@BeforeMethod
	public void befMethod(){
		System.out.println("Before Method");
	}
	
	@Test (priority = 0)
	public void testParsingStringToInt() {
		System.out.println("==================================");
		System.out.println("  Test Parse String to Int ");
		System.out.println("==================================");
		//range -2147483648 s.d. 2147483647 (10 digit) //sudah tidak bisa
	    intLengthString = 9;
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);
		System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToIntActual(strInput),ps.parseStringToIntExcept(strInput));
		System.out.println("==================================");
	}
	@Test (priority=1)
	public void testParsingStringtoDouble() {
		System.out.println("==================================");
		System.out.println("  Test Parse String to Double ");
		System.out.println("==================================");
		// +/- 1.8 x 10308 panjang digit (presisi) : 15/masih bisa
	    intLengthString = 15;
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);
		System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToDoubleActual(strInput),ps.parseStringToDoubleExcept(strInput));
		System.out.println("==================================");
	}

	@Test (priority=2)
	public void testParsingStringToFloat() {
		System.out.println("==================================");
		System.out.println("  Test Parse String to Float ");
		System.out.println("==================================");
		//range +/- 3.4 x 1038 jumlah digit: 6-7
	    intLengthString = 6;
	    strInput = RandomStringUtils.random(intLengthString, useLetters, useNumbers);   
	    System.out.println("String Input: "+strInput);
	    assertEquals(ps.parseStringToFloatActual(strInput),ps.parseStringToFloatExcept(strInput));
		System.out.println("==================================");
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