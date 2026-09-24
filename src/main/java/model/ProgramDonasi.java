package model;


public class ProgramDonasi extends ProgramSosial {
    private String jenisBarang;
    private double targetDonasi;

    public ProgramDonasi(String idProgram, String namaProgram, String tujuan, int jumlahPeserta,
                          String skala, double anggaran, Relawan pengaju,
                          String jenisBarang, double targetDonasi) {
        // Keyword 'super' memanggil constructor superclass (ProgramSosial)
        super(idProgram, namaProgram, tujuan, jumlahPeserta, skala, anggaran, pengaju);
        setJenisBarang(jenisBarang);
        setTargetDonasi(targetDonasi);
    }

    public String getJenisBarang() { return jenisBarang; }
    public double getTargetDonasi() { return targetDonasi; }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = (jenisBarang != null && !jenisBarang.trim().isEmpty())
                ? jenisBarang : "Umum";
    }

    public void setTargetDonasi(double targetDonasi) {
        if (targetDonasi >= 0) {
            this.targetDonasi = targetDonasi;
        } else {
            System.out.println(">> ERROR: Target donasi tidak boleh negatif!");
            this.targetDonasi = 0;
        }
    }

    // POLYMORPHISM 
    @Override
    public void tampilkanInfo() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("[KATEGORI: PROGRAM DONASI]");
        super.tampilkanInfo(); // memanggil versi milik superclass dulu
        System.out.println("Jenis Barang : " + jenisBarang);
        System.out.println("Target Donasi: Rp " + String.format("%,.2f", targetDonasi));
        System.out.println("----------------------------------------------------------------");
    }
}