package ujian.ujianminggukedua;

public class Matematika {
	
	double doHasil = 0.0;
	
	public double jumlahNilaiActual(double doNilaiX, double doNilaiY) {
		
		doHasil = (doNilaiX+doNilaiY+doNilaiX+doNilaiY)/2;
		System.out.println(doHasil+"--> Hasil Actual");
		
		return doHasil;
	}
	
	public double jumlahNilaiExpect(double doNilaiX, double doNilaiY) {
		doHasil = (doNilaiX+doNilaiY);
		System.out.println(doHasil+"--> Hasil Expectation");
		return doHasil;
	}
	
	public double kurangNilaiActual(double doNilaiX, double doNilaiY) {
		doHasil = (doNilaiX*2) - (doNilaiX+doNilaiY);
		System.out.println(doHasil+"--> Hasil Actual");
		return doHasil;
	}
	
	public double kurangNilaiExpect(double doNilaiX, double doNilaiY) {
		doHasil = (doNilaiX - doNilaiY);
		System.out.println(doHasil+"--> Hasil Expectation");
		return doHasil;
	}
	
	public double bagiNilaiActual(double doNilaiX, double doNilaiY) {
		doHasil = (doNilaiX / doNilaiY);
		System.out.println(doHasil+"--> Hasil Actual");
		return doHasil;
	}
	public double bagiNilaiExpect(double doNilaiX, double doNilaiY) {
		doHasil = (doNilaiX / doNilaiY);
		System.out.println(doHasil+"--> Hasil Expectation");
		return doHasil;
	}
	
	public double modulusNilaiActual(double doNilaiX, double doNilaiY) {
		doHasil = ((doNilaiX % doNilaiY)*2) - (doNilaiX % doNilaiY) ;
		System.out.println(doHasil+"--> Hasil Actual");
		return doHasil;
	}
	public double modulusNilaiExpect(double doNilaiX, double doNilaiY) {
		doHasil = (doNilaiX % doNilaiY);
		System.out.println(doHasil+"--> Hasil Expectation");
		return doHasil;
	}

}