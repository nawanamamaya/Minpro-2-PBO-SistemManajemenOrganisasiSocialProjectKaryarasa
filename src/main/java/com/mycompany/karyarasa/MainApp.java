package com.mycompany.karyarasa;

import model.KaryarasaService;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KaryarasaService service = new KaryarasaService(scanner);
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=== SISTEM MANAJEMEN SOCIAL PROJECT 'KARYARASA' ===");
            System.out.println("1. Tambah Program Sosial & Pengaju");
            System.out.println("2. Tampilkan Daftar Program Sosial");
            System.out.println("3. Hapus Program Sosial");
            System.out.println("4. Update Anggaran Program");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            if (scanner.hasNextInt()) {
                int pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan buffer newline
                switch (pilihan) {
                    case 1 -> service.tambahProgram();
                    case 2 -> service.tampilkanProgram();
                    case 3 -> service.hapusProgram();
                    case 4 -> service.updateAnggaran();
                    case 5 -> {
                        berjalan = false;
                        System.out.println(">> Keluar dari program. Terima kasih telah menggunakan Karyarasa!");
                    }
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } else {
                System.out.println("Input harus berupa angka!");
                scanner.next(); 
            }
        }
        scanner.close();
    }
}