package ujian.ujianminggukedua;

public class ParsingString {

	public boolean parseStringToIntActual(String strX) {
		boolean isActual = true;
		try {
			int  intY = Integer.parseInt(strX);
			System.out.println("====================================");
			System.out.println("            Hasil Actual");
			System.out.println("Status Parse String : "+isActual);
			System.out.println("Hasil Parse String ke int: "+intY);
			System.out.println("====================================");
		}
		catch (Exception e){
			isActual = false;
			System.out.println("====================================");
			System.out.println("        Hasil Actual : "+isActual);
			System.out.println("====================================");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("====================================");
		}
		return isActual;
		
	}
	public boolean parseStringToIntExcept(String strX) {
		boolean isExcept = true;
		try {
		Integer intY = Integer.parseInt(strX);
		System.out.println("====================================");
		System.out.println("            Hasil Exception");
		System.out.println("Status Parse String : "+isExcept);
		System.out.println("Hasil Parse String ke int : "+intY);
		System.out.println("====================================");
		}
		catch (Exception e){
			isExcept = false;
			System.out.println("====================================");
			System.out.println("        Hasil Exception : "+isExcept);
			System.out.println("====================================");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("====================================");
		}
		
		return isExcept;
	}
	
	public boolean parseStringToDoubleActual(String strX) {
		boolean isActual = true;
		try {
			double doY = Double.parseDouble(strX);
			System.out.println("====================================");
			System.out.println("            Hasil Actual");
			System.out.println("Status Parse String : "+isActual);
			System.out.println("Hasil Parse String ke double : "+doY);
			System.out.println("====================================");
		}
		catch (Exception e){
			isActual = false;
			System.out.println("====================================");
			System.out.println("        Hasil Actual : "+isActual);
			System.out.println("====================================");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("====================================");
		}
		return isActual;
		
	}
	public boolean parseStringToDoubleExcept(String strX) {
		boolean isExcept = true;
		try {
			double doY = Double.parseDouble(strX);
			System.out.println("====================================");
			System.out.println("            Hasil Exception");
			System.out.println("Status Parse String : "+isExcept);
			System.out.println("Hasil Parse String ke double : "+doY);
			System.out.println("====================================");
		}
		catch (Exception e){
			isExcept = false;
			System.out.println("====================================");
			System.out.println("        Hasil Exception : "+isExcept);
			System.out.println("====================================");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("====================================");
		}
		return isExcept;
	}
	public boolean parseStringToFloatActual(String strX) {
		boolean isActual = true;
		try {
			float floatY = Float.parseFloat(strX);
			System.out.println("====================================");
			System.out.println("            Hasil Actual");
			System.out.println("Status Parse String : "+isActual);
			System.out.println("Hasil Parse String ke float: "+floatY);
			System.out.println("====================================");
		}
		catch (Exception e){
			isActual = false;
			System.out.println("====================================");
			System.out.println("        Hasil Actual : "+isActual);
			System.out.println("====================================");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("====================================");
		}
		return isActual;
		
	}
	public boolean parseStringToFloatExcept(String strX) {
		boolean isExcept = true;
		try {
			float floatY = Float.parseFloat(strX);

			System.out.println("====================================");
			System.out.println("            Hasil Exception");
			System.out.println("Status Parse String : "+isExcept);
			System.out.println("Hasil Parse String ke float : "+floatY);
			System.out.println("====================================");
		}
		catch (Exception e){
			isExcept = false;
			System.out.println("====================================");
			System.out.println("        Hasil Exception : "+isExcept);
			System.out.println("====================================");
			System.out.println("String tidak bisa dikonvert");
			System.out.println("Problem string tidak bisa konvert : "+e);
			System.out.println("====================================");
		}
		return isExcept;
	}
}