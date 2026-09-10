package model;

public class Relawan {
    private String nama;
    private String kontak;
    private String asalLembaga;
    private String jabatan;

    public Relawan(String nama, String kontak, String asalLembaga, String jabatan) {
        this.nama = nama;
        this.kontak = kontak;
        this.asalLembaga = asalLembaga;
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public String getKontak() {
        return kontak;
    }

    public String getAsalLembaga() {
        return asalLembaga;
    }

    public String getJabatan() {
        return jabatan;
    }
}