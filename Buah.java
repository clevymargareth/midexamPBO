public class Buah {
    private String nama;
    private String warna;
    private double berat;

    public Buah(String nama, String warna, double berat) {
        this.nama = nama;
        this.warna = warna;
        this.berat = berat;
    }

    public String getNama() {
        return nama;
    }

    public String getWarna() {
        return warna;
    }

    public double getBerat() {
        return berat;
    }

    public double hitungHarga(double hargaPerKg) {
        return berat / 1000 * hargaPerKg;
    }

    public String makan() {
        return nama + " dimakan";
    }

    public String info() {
        return "Nama: " + nama + ", Warna: " + warna + ", Berat: " + berat + " gram";
    }
}