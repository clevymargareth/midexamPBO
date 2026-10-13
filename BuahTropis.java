public class BuahTropis extends Buah {
    private String daerahAsal;
    private int masaSimpan;
    private int hariSejakPanen;

    public BuahTropis(String nama, String warna, double berat, String daerahAsal, int masaSimpan) {
        super(nama, warna, berat);
        this.daerahAsal = daerahAsal;
        this.masaSimpan = masaSimpan;
        this.hariSejakPanen = 0;
    }

    public String getDaerahAsal() {
        return daerahAsal;
    }

    public int getMasaSimpan() {
        return masaSimpan;
    }

    public int getHariSejakPanen() {
        return hariSejakPanen;
    }

    public void tambahHari(int hari) {
        hariSejakPanen = hariSejakPanen + hari;
    }

    public boolean isBusuk() {
        if (hariSejakPanen > masaSimpan) {
            return true;
        } else {
            return false;
        }
    }

    public String buatJus() {
        if (isBusuk()) {
            return getNama() + " sudah busuk, tidak bisa dibuat jus";
        } else {
            return "Jus " + getNama() + " jadi, kira-kira " + (getBerat() / 2) + " ml";
        }
    }

    public String info() {
        return super.info() + ", Asal: " + daerahAsal + ", Umur panen: " + hariSejakPanen + " hari";
    }
}