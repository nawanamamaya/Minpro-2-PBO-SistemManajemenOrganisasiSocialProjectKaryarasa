package com.mycompany.karyarasa;

import controller.KaryarasaController;
import view.KaryarasaView;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KaryarasaView view = new KaryarasaView();
        KaryarasaController controller = new KaryarasaController(scanner, view);
        boolean berjalan = true;

        while (berjalan) {
            view.tampilkanMenu();
            String inputMenu = scanner.nextLine();
            int pilihan;
            try {
                pilihan = Integer.parseInt(inputMenu.trim());
            } catch (NumberFormatException e) {
                view.tampilkanPesan("Input harus berupa angka!");
                continue;
            }

            switch (pilihan) {
                case 1 -> controller.tambahProgram();
                case 2 -> controller.tampilkanProgram();
                case 3 -> controller.hapusProgram();
                case 4 -> controller.updateAnggaran();
                case 5 -> {
                    berjalan = false;
                    view.tampilkanPesan(">> Keluar dari program. Terima kasih telah menggunakan Karyarasa!");
                }
                default -> view.tampilkanPesan("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}