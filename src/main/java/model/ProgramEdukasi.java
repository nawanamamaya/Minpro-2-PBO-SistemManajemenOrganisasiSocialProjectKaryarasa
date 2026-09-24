package model;


public class ProgramEdukasi extends ProgramSosial {
    private int jumlahSesi;
    private String materiUtama;

    public ProgramEdukasi(String idProgram, String namaProgram, String tujuan, int jumlahPeserta,
                           String skala, double anggaran, Relawan pengaju,
                           int jumlahSesi, String materiUtama) {
        super(idProgram, namaProgram, tujuan, jumlahPeserta, skala, anggaran, pengaju);
        setJumlahSesi(jumlahSesi);
        setMateriUtama(materiUtama);
    }

    public int getJumlahSesi() { return jumlahSesi; }
    public String getMateriUtama() { return materiUtama; }

    public void setJumlahSesi(int jumlahSesi) {
        if (jumlahSesi > 0) {
            this.jumlahSesi = jumlahSesi;
        } else {
            System.out.println(">> ERROR: Jumlah sesi harus lebih dari 0! Diatur ke 1.");
            this.jumlahSesi = 1;
        }
    }

    public void setMateriUtama(String materiUtama) {
        this.materiUtama = (materiUtama != null && !materiUtama.trim().isEmpty())
                ? materiUtama : "-";
    }

    // POLYMORPHISM - METHOD OVERRIDING
    @Override
    public void tampilkanInfo() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("[KATEGORI: PROGRAM EDUKASI]");
        super.tampilkanInfo();
        System.out.println("Jumlah Sesi  : " + jumlahSesi + " sesi");
        System.out.println("Materi Utama : " + materiUtama);
        System.out.println("----------------------------------------------------------------");
    }
}