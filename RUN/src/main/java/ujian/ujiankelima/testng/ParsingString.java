package ujian.ujiankelima.testng;

public class ParsingString {

	
	public boolean parseStringToShortActual(String strX) {
		boolean isActual = true;
		try {
			short soY = Short.parseShort(strX);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("            Hasil Actual");
			System.out.println("Status Parse String : "+isActual);
			System.out.println("Hasil Parse String ke float: "+soY);
			System.out.println("----------------------------------------------------------------------------");
		}
		catch (Exception e){
			isActual = false;
			
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("        Hasil Actual : "+isActual);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("----------------------------------------------------------------------------");
		}
		return isActual;
		
	}
	public boolean parseStringToShortExpect(String strX) {
		boolean isExpect = true;
		try {
			short soY = Short.valueOf(strX);

			System.out.println("----------------------------------------------------------------------------");
			System.out.println("            Hasil Expectation");
			System.out.println("Status Parse String : "+isExpect);
			System.out.println("Hasil Parse String ke float : "+soY);
			System.out.println("----------------------------------------------------------------------------");
		}
		catch (Exception e){
			isExpect = false;
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("        Hasil Expectation : "+isExpect);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("----------------------------------------------------------------------------");
		}
		return isExpect;
	}
	
	public boolean parseStringToByteActual(String strX) {
		boolean isActual = true;
		try {
			byte byteY = Byte.parseByte(strX);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("            Hasil Actual");
			System.out.println("Status Parse String : "+isActual);
			System.out.println("Hasil Parse String ke float: "+byteY);
			System.out.println("----------------------------------------------------------------------------");
		}
		catch (Exception e){
			isActual = false;
			
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("        Hasil Actual : "+isActual);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("----------------------------------------------------------------------------");
		}
		return isActual;
		
	}
	public boolean parseStringToByteExpect(String strX) {
		boolean isExpect = true;
		try {
			byte byteY = Byte.valueOf(strX);

			System.out.println("----------------------------------------------------------------------------");
			System.out.println("            Hasil Expectation");
			System.out.println("Status Parse String : "+isExpect);
			System.out.println("Hasil Parse String ke float : "+byteY);
			System.out.println("----------------------------------------------------------------------------");
		}
		catch (Exception e){
			isExpect = false;
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("        Hasil Expectation : "+isExpect);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("----------------------------------------------------------------------------");
		}
		return isExpect;
	}
	
	public boolean parseStringToIntActual(String strX) {
		boolean isActual = true;
		try {
			int  intY = Integer.parseInt(strX);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("            Hasil Actual");
			System.out.println("Status Parse String : "+isActual);
			System.out.println("Hasil Parse String ke int: "+intY);
			System.out.println("----------------------------------------------------------------------------");
		}
		catch (Exception e){
			isActual = false;
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("        Hasil Actual : "+isActual);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("----------------------------------------------------------------------------");
		}
		return isActual;
		
	}
	public boolean parseStringToIntExpect(String strX) {
		boolean isExpect = true;
		try {
		int intY = Integer.valueOf(strX);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("            Hasil Expectation");
		System.out.println("Status Parse String : "+isExpect);
		System.out.println("Hasil Parse String ke int : "+intY);
		System.out.println("----------------------------------------------------------------------------");
		}
		catch (Exception e){
			isExpect = false;
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("        Hasil Expectation : "+isExpect);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("----------------------------------------------------------------------------");
		}
		
		return isExpect;
	}
	
	public boolean parseStringToDoubleActual(String strX) {
		boolean isActual = true;
		try {
			double doY = Double.parseDouble(strX);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("            Hasil Actual");
			System.out.println("Status Parse String : "+isActual);
			System.out.println("Hasil Parse String ke double : "+doY);
			System.out.println("----------------------------------------------------------------------------");
		}
		catch (Exception e){
			isActual = false;
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("        Hasil Actual : "+isActual);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("----------------------------------------------------------------------------");
		}
		return isActual;
		
	}
	public boolean parseStringToDoubleExpect(String strX) {
		boolean isExpect = true;
		try {
			double doY = Double.valueOf(strX);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("            Hasil Expectation");
			System.out.println("Status Parse String : "+isExpect);
			System.out.println("Hasil Parse String ke double : "+doY);
			System.out.println("----------------------------------------------------------------------------");
		}
		catch (Exception e){
			isExpect = false;
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("        Hasil Expectation : "+isExpect);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("----------------------------------------------------------------------------");
		}
		return isExpect;
	}
	public boolean parseStringToFloatActual(String strX) {
		boolean isActual = true;
		try {
			float floatY = Float.parseFloat(strX);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("            Hasil Actual");
			System.out.println("Status Parse String : "+isActual);
			System.out.println("Hasil Parse String ke float: "+floatY);
			System.out.println("----------------------------------------------------------------------------");
		}
		catch (Exception e){
			isActual = false;
			
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("        Hasil Actual : "+isActual);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("----------------------------------------------------------------------------");
		}
		return isActual;
		
	}
	public boolean parseStringToFloatExpect(String strX) {
		boolean isExpect = true;
		try {
			float floatY = Float.valueOf(strX);

			System.out.println("----------------------------------------------------------------------------");
			System.out.println("            Hasil Expectation");
			System.out.println("Status Parse String : "+isExpect);
			System.out.println("Hasil Parse String ke float : "+floatY);
			System.out.println("----------------------------------------------------------------------------");
		}
		catch (Exception e){
			isExpect = false;
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("        Hasil Expectation : "+isExpect);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("----------------------------------------------------------------------------");
		}
		return isExpect;
	}
	
	public boolean parseStringToLongActual(String strX) {
		boolean isActual = true;
		try {
			long longY = Long.parseLong(strX);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("            Hasil Actual");
			System.out.println("Status Parse String : "+isActual);
			System.out.println("Hasil Parse String ke float: "+longY);
			System.out.println("----------------------------------------------------------------------------");
		}
		catch (Exception e){
			isActual = false;
			
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("        Hasil Actual : "+isActual);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("----------------------------------------------------------------------------");
		}
		return isActual;
		
	}
	public boolean parseStringToLongExpect(String strX) {
		boolean isExpect = true;
		try {
			long longY = Long.valueOf(strX);

			System.out.println("----------------------------------------------------------------------------");
			System.out.println("            Hasil Expectation");
			System.out.println("Status Parse String : "+isExpect);
			System.out.println("Hasil Parse String ke float : "+longY);
			System.out.println("----------------------------------------------------------------------------");
		}
		catch (Exception e){
			isExpect = false;
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("        Hasil Expectation : "+isExpect);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("----------------------------------------------------------------------------");
		}
		return isExpect;
	}
}