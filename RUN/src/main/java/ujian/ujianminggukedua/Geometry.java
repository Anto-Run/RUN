package ujian.ujianminggukedua;


public class Geometry {
	
	//luasPersegi, luasSeigitiga dan luasTrapesium.
	double doHasil = 0;
	public double luasPersegiActual(double doSisi) {
		doHasil = doSisi*doSisi;
		System.out.println(doHasil+"--> Hasil Actual");
		return doHasil;
	}
	
	public double luasPersegiExpect(double doSisi) {
		doHasil = java.lang.Math.pow(doSisi, 2);
		System.out.println(doHasil+"--> Hasil Except");
		return doHasil;
		
	}
	
	public double luasSegitigaActual(double doAlas, double doTinggi) {
		doHasil = 0.5 * (doAlas*doTinggi);
		System.out.println(doHasil+"--> Hasil Actual");
		return doHasil;				
	}
	
	public double luasSegitigaExpect(double doAlas, double doTinggi) {
		doHasil = (doAlas * doTinggi)/2;
		System.out.println(doHasil+"--> Hasil Except");
		return doHasil;
		
	}
	
	public double luasTrapesiumActual(double doSisiA, double doSisiB, double doTinggi) {
		doHasil = 0.5 *((doTinggi*doSisiA) + (doTinggi * doSisiB));
		System.out.println(doHasil+"--> Hasil Actual");
		return doHasil;
	}
	
	public double luasTrapesiumExpect(double doSisiA, double doSisiB, double doTinggi) {
		doHasil = ((doSisiA + doSisiB)*doTinggi)/2;;
		System.out.println(doHasil+"--> Hasil Excpect");
		return doHasil;
	}
	
}