package model;

import java.util.ArrayList;
import java.util.Scanner;

public class KaryarasaService {
    private ArrayList<ProgramSosial> daftarProgram;
    private Scanner scanner;

    public KaryarasaService(Scanner scanner) {
        this.daftarProgram = new ArrayList<>();
        this.scanner = scanner;
    }

    public void tambahProgram() {
        System.out.println("\n--- 1. INFORMASI PENGAJU / RELAWAN ---");
        System.out.print("Nama Pengaju       : ");
        String nama = scanner.nextLine();
        System.out.print("Kontak (No HP/WA)  : ");
        String kontak = scanner.nextLine();
        System.out.print("Asal Lembaga       : ");
        String asalLembaga = scanner.nextLine();
        System.out.print("Jabatan di Lembaga : ");
        String jabatan = scanner.nextLine();

        // Membuat objek Relawan pengaju
        Relawan pengajuBaru = new Relawan(nama, kontak, asalLembaga, jabatan);

        System.out.println("\n--- 2. DETAIL PROGRAM SOSIAL ---");
        System.out.print("ID Program         : ");
        String idProgram = scanner.nextLine();
        System.out.print("Nama Program       : ");
        String namaProgram = scanner.nextLine();
        System.out.print("Tujuan Program     : ");
        String tujuan = scanner.nextLine();
        System.out.print("Jumlah Peserta     : ");
        int jumlahPeserta = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
        System.out.print("Skala Program (cth: Lokal/Nasional): ");
        String skala = scanner.nextLine();
        System.out.print("Anggaran (Rp)      : ");
        double anggaran = scanner.nextDouble();
        scanner.nextLine(); // Membersihkan buffer

        // Membuat objek ProgramSosial dengan menyertakan data pengaju
        ProgramSosial programBaru = new ProgramSosial(idProgram, namaProgram, tujuan, jumlahPeserta, skala, anggaran, pengajuBaru);
        daftarProgram.add(programBaru);

        System.out.println("\n>> Program sosial beserta data pengaju berhasil ditambahkan!");
    }

    public void tampilkanProgram() {
        if (daftarProgram.isEmpty()) {
            System.out.println("\n>> Belum ada data program sosial di Karyarasa.");
            return;
        }
        
        System.out.println("\n==================================================================================");
        System.out.println("                        DAFTAR PROGRAM SOSIAL KARYARASA                           ");
        System.out.println("==================================================================================");
        for (int i = 0; i < daftarProgram.size(); i++) {
            ProgramSosial p = daftarProgram.get(i);
            Relawan r = p.getPengaju();
            
            System.out.println("[" + (i + 1) + "] ID Program   : " + p.getIdProgram());
            System.out.println("    Nama Program : " + p.getNamaProgram());
            System.out.println("    Tujuan       : " + p.getTujuan());
            System.out.println("    Peserta      : " + p.getJumlahPeserta() + " orang  |  Skala: " + p.getSkala());
            System.out.println("    Anggaran     : Rp " + String.format("%,.2f", p.getAnggaran()));
            System.out.println("    --------------------------------------------------------------");
            System.out.println("    [Info Pengaju] Nama: " + r.getNama() + " (" + r.getJabatan() + " - " + r.getAsalLembaga() + ")");
            System.out.println("                   Kontak: " + r.getKontak());
            System.out.println("==================================================================================");
        }
    }  

    public void hapusProgram() {
        System.out.print("Masukkan ID Program yang akan dihapus: ");
        String idTarget = scanner.nextLine();

        for (int i = 0; i < daftarProgram.size(); i++) {
            if (daftarProgram.get(i).getIdProgram().equalsIgnoreCase(idTarget)) {   
                daftarProgram.remove(i);
                System.out.println(">> Program sosial berhasil dihapus!");
                return;
            }
        }
        System.out.println(">> Program dengan ID tersebut tidak ditemukan.");
    }

    public void updateAnggaran() {
        System.out.print("Masukkan ID Program yang akan diupdate anggarannya: ");
        String idTarget = scanner.nextLine();

        for (ProgramSosial p : daftarProgram) {
            if (p.getIdProgram().equalsIgnoreCase(idTarget)) {
                System.out.print("Anggaran Baru (Rp): ");
                double anggaranBaru = scanner.nextDouble();
                scanner.nextLine();
                
                p.setAnggaran(anggaranBaru);
                System.out.println(">> Anggaran program berhasil diperbarui!");
                return;
            }
        }
        System.out.println(">> Program dengan ID tersebut tidak ditemukan.");
    }
}