package ujian.ujiankeempat.openweather;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import latihan.restassured.utils.ExcelReader;

public class ByCityNameStateCode {
	private ExcelReader excelReader;
	private Object [][] dDriven ;
	private int intColumnNums;
	private int intRowNums;
	private JSONObject req ;
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "https://api.openweathermap.org/";
		req = new JSONObject();
		String excelPath = "./Data/RUN_Ujian_Keempat.xlsx";
		String sheetName = "ByCityNameStateCode";
		excelReader = new ExcelReader(excelPath, sheetName);
		intRowNums = excelReader.getRowCount();
		intColumnNums = excelReader.getColCount();
	}
	
	@DataProvider(name = "DataProviderFirst")
	public Object[][] dataDrivenGet()
	{
		dDriven = new Object[intRowNums][intColumnNums];
		
		Iterator<Row> r = excelReader.getIter();
		int intRows = 0;
		int intLoop = 1;
		System.out.println("---------------------------------------------");
		while(r.hasNext())
		{
			Row rows = r.next();
			System.out.println("--------" + "Data ke :" + intLoop +" --------");
			for(int columns=0;columns<intColumnNums;columns++)
			{
				dDriven[intRows][columns] = excelReader.getCellData(intRows, columns);
				System.out.println(dDriven[intRows][columns]);
			}
			System.out.println("---------------------------------------------");
			intRows++;
			intLoop++;
		}
		
		
		return dDriven;		
	}
	
	@Test(priority = 0, dataProvider="DataProviderFirst")
	public void testGet(String cityName, String stateCode, String countryCode)
	{
		System.out.println();
		System.out.println("---------Test By City Name State Code---------");
		
		String apiKey ="866c46b6980be1e3e4dbdd7f4ebf28d3";
		
		given().
		param("q", cityName, stateCode, countryCode).and().
		param("appid", apiKey).	
		when().
		get("/data/2.5/weather").
		then().
		statusCode(200).log().all();
		
		System.out.println("---------------------------------------------");
	}

}
