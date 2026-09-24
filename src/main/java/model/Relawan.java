package model;


public class Relawan {
    private String nama;
    private String kontak;
    private String asalLembaga;
    private String jabatan;

    public Relawan(String nama, String kontak, String asalLembaga, String jabatan) {
        setNama(nama);
        setKontak(kontak);
        setAsalLembaga(asalLembaga);
        setJabatan(jabatan);
    }

    // ---------- Getter ----------
    public String getNama() { return nama; }
    public String getKontak() { return kontak; }
    public String getAsalLembaga() { return asalLembaga; }
    public String getJabatan() { return jabatan; }

    // ---------- Setter (dengan validasi input) ----------
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println(">> ERROR: Nama pengaju tidak boleh kosong! Diatur ke default.");
            this.nama = "Tanpa Nama";
        }
    }

    public void setKontak(String kontak) {
        if (kontak != null && !kontak.trim().isEmpty()) {
            this.kontak = kontak;
        } else {
            System.out.println(">> ERROR: Kontak tidak boleh kosong! Diatur ke default.");
            this.kontak = "-";
        }
    }

    public void setAsalLembaga(String asalLembaga) {
        this.asalLembaga = (asalLembaga != null && !asalLembaga.trim().isEmpty())
                ? asalLembaga : "Perseorangan";
    }

    public void setJabatan(String jabatan) {
        this.jabatan = (jabatan != null && !jabatan.trim().isEmpty())
                ? jabatan : "Relawan";
    }
}