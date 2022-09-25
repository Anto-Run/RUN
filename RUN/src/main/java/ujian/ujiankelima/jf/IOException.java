package ujian.ujiankelima.jf;


import java.io.FileInputStream;


public class IOException {

	public static void main(String[] args) {
	
		FileInputStream inputFile = null;
		try {
			inputFile = new FileInputStream("C:\\Users\\NEXSOFT\\Downloads\\BOOTCAMP\\Text Document.txt");
			inputFile.close();
		}catch(Exception e){
			System.out.println("FILE TIDAK DITEMUKAN !!"+e);
		}  
		System.out.println("Statement selanjutnya....");
    }
		

	}

