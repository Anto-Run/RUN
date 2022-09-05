package tugas.remedial;

import java.util.Scanner;

public class Remedial {
	public static void main(String[] args) {
        // 1. Buat sebuah program Java yang memungkinkan pengguna memasukkan angka-angka
        // sepuasnya. Jika sudah puas, pengguna tinggal memasukkan karakter. Program
        // akan mengeluarkan jumlah dari seluruh angka yang telah dimasukkan. Contoh:
        // Input:
        // Masukkan angka sepuasnya. Jika sudah puas masukkan karakter:
        // 13
        // 8
        // 7
        // 131
        // X
        // Output:
        // Jumlah: 159

        // Requirement :
        // a. Input menggunakan Scanner.
        // b. Hanya angka yang akan diproses (Menggunakan Handling Exception)
        // c. Source Code dan Flow Chart digabungkan ke dalam 1 dokumen
        // d. Format dokumen Nama_Lengkap.docx

        Scanner sc = new Scanner(System.in);
        int intInput = 0;
        boolean isCheck = true;
        int intSum = 0;

        System.out.println("Masukkan angka sepuasnya. Jika sudah puas masukkan karakter:");
        do {
            try {
                intInput = sc.nextInt();
                intSum += intInput;
            } catch (Exception e) {
                // TODO: handle exception
                isCheck = false;
                System.out.println("Jumlah: " + intSum);
            }

        } while (isCheck);

    }
}
