public class Mangga extends BuahTropis {
    private String varietas;

    public Mangga(String varietas, double berat) {
        super("Mangga " + varietas, "Hijau", berat, "Jawa Timur", 8);
        this.varietas = varietas;
    }

    public String getVarietas() {
        return varietas;
    }

    public String getKematangan() {
        int hari = getHariSejakPanen();
        if (isBusuk()) {
            return "busuk";
        } else if (hari < 3) {
            return "mentah";
        } else if (hari <= 6) {
            return "matang";
        } else {
            return "terlalu matang";
        }
    }

    public double hitungHarga(double hargaPerKg) {
        double harga = super.hitungHarga(hargaPerKg);
        String kondisi = getKematangan();
        if (kondisi.equals("matang")) {
            return harga + (harga * 10 / 100);
        } else if (kondisi.equals("terlalu matang")) {
            return harga / 2;
        } else if (kondisi.equals("busuk")) {
            return 0;
        } else {
            return harga;
        }
    }

    public String makan() {
        String kondisi = getKematangan();
        if (kondisi.equals("mentah")) {
            return getNama() + " masih mentah, rasanya asam";
        } else if (kondisi.equals("busuk")) {
            return getNama() + " sudah busuk, tidak boleh dimakan";
        } else if (kondisi.equals("matang")) {
            return super.makan() + ", rasanya manis";
        } else {
            return super.makan() + ", rasanya terlalu lembek";
        }
    }

    public String info() {
        return super.info() + ", Kondisi: " + getKematangan();
    }
}