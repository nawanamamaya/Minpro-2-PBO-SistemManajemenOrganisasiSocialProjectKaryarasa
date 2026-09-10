package model;

public class ProgramSosial {
    private String idProgram;
    private String namaProgram;
    private String tujuan;
    private int jumlahPeserta;
    private String skala;
    private double anggaran;
    private Relawan pengaju;

    public ProgramSosial(String idProgram, String namaProgram, String tujuan, int jumlahPeserta, String skala, double anggaran, Relawan pengaju) {
        this.idProgram = idProgram;
        this.namaProgram = namaProgram;
        this.tujuan = tujuan;
        this.jumlahPeserta = jumlahPeserta;
        this.skala = skala;
        setAnggaran(anggaran);
        this.pengaju = pengaju;
    }

    public String getIdProgram() {
        return idProgram;
    }

    public String getNamaProgram() {
        return namaProgram;
    }

    public String getTujuan() {
        return tujuan;
    }

    public int getJumlahPeserta() {
        return jumlahPeserta;
    }

    public String getSkala() {
        return skala;
    }

    public double getAnggaran() {
        return anggaran;
    }

    public Relawan getPengaju() {
        return pengaju;
    }

    public void setAnggaran(double anggaran) {
        if (anggaran < 0) {
            System.out.println("Anggaran tidak boleh negatif!");
            return;
        }
        this.anggaran = anggaran;
    }
}