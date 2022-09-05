package ujian.ujianminggukedua;

public class Matematika {
	
	double doHasil = 0.0;
	
	public double jumlahNilaiActual(double doNilaiX, double doNilaiY) {
		
		doHasil = (doNilaiX+doNilaiY+doNilaiX+doNilaiY)/2;
		System.out.println(doHasil+"--> Hasil Actual");
		
		return doHasil;
	}
	
	public double jumlahNilaiExcept(double doNilaiX, double doNilaiY) {
		doHasil = (doNilaiX+doNilaiY);
		System.out.println(doHasil+"--> Hasil Expection");
		return doHasil;
	}
	
	public double kurangNilaiActual(double doNilaiX, double doNilaiY) {
		doHasil = (doNilaiX*2) - (doNilaiX+doNilaiY);
		System.out.println(doHasil+"--> Hasil Actual");
		return doHasil;
	}
	
	public double kurangNilaiExcept(double doNilaiX, double doNilaiY) {
		doHasil = (doNilaiX - doNilaiY);
		System.out.println(doHasil+"--> Hasil Expection");
		return doHasil;
	}
	
	public double bagiNilaiActual(double doNilaiX, double doNilaiY) {
		doHasil = (doNilaiX / doNilaiY);
		System.out.println(doHasil+"--> Hasil Actual");
		return doHasil;
	}
	public double bagiNilaiExcept(double doNilaiX, double doNilaiY) {
		doHasil = (doNilaiX / doNilaiY);
		System.out.println(doHasil+"--> Hasil Expection");
		return doHasil;
	}
	
	public double modulusNilaiActual(double doNilaiX, double doNilaiY) {
		doHasil = ((doNilaiX % doNilaiY)*2) - (doNilaiX % doNilaiY) ;
		System.out.println(doHasil+"--> Hasil Actual");
		return doHasil;
	}
	public double modulusNilaiExcept(double doNilaiX, double doNilaiY) {
		doHasil = (doNilaiX % doNilaiY);
		System.out.println(doHasil+"--> Hasil Expection");
		return doHasil;
	}

}