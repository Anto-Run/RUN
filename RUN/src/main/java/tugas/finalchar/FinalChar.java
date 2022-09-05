package tugas.finalchar;

import java.util.Scanner;

public class FinalChar {

    public static void main(String[] args) {

        // BUATLAH PROGRAM JAVA CONSOLE DAN FLOW CHART DARI SOAL BERIKUT

        // INPUT TIPE DATA STRING MENGGUNAKAN SCANNER

        // INPUT : 07a45te312qw6M-8so9

        // OUTPUT : 65

        // PANDUAN >> 2+9+6+7+5+3+4+8+10+11 = 65


        // 0 = 2; 7=9; 4=6; 5=7; 3=5; 1=3; 2=4;6=8;8=10;9=11
        // 0=2; 1=3; 3=5; 4=6; 5=7; 6=8; 7=9; 8=10; 9=11;
        // ada selisih 2 antara input dan panduan pada masing-masing karakter pada
        // string.
        // hanya string berbentuk angka saja yang ditampilkan
        // kode ascii angka 0 - 9 adalah dari 48 s/d 57.

        Scanner sc = new Scanner(System.in);
        String strInput = "";
        char chBatasMin = 48;
        char chBatasMax = 57;
        int intSum = 0;
        int intTemp = 0;

        System.out.print("Input data string : ");
        strInput = sc.next();
        for (int i = 0; i < strInput.length(); i++) {

            if (strInput.charAt(i) >= chBatasMin && strInput.charAt(i) <= chBatasMax) {
                intTemp = Integer.parseInt(String.valueOf(strInput.charAt(i)));
                intTemp += 2;
                intSum += intTemp;
            }
        }
        System.out.println("Output:" + intSum);
    }

}