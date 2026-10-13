public class BuahMain {
    public static void main(String[] args) {
        Mangga mangga = new Mangga("Arummanis", 400);
        double hargaPerKg = 30000;

        System.out.println("Hari ke-0");
        System.out.println(mangga.info());
        System.out.println(mangga.makan());
        System.out.println("Harga: Rp" + mangga.hitungHarga(hargaPerKg));

        mangga.tambahHari(4);
        System.out.println("\nHari ke-4");
        System.out.println(mangga.info());
        System.out.println(mangga.makan());
        System.out.println("Harga: Rp" + mangga.hitungHarga(hargaPerKg));

        mangga.tambahHari(3);
        System.out.println("\nHari ke-7");
        System.out.println("Kondisi: " + mangga.getKematangan());
        System.out.println(mangga.buatJus());
        System.out.println("Harga: Rp" + mangga.hitungHarga(hargaPerKg));

        mangga.tambahHari(3);
        System.out.println("\nHari ke-10");
        System.out.println(mangga.makan());
        System.out.println(mangga.buatJus());
        System.out.println("Harga: Rp" + mangga.hitungHarga(hargaPerKg));

        BuahTropis pisang = new BuahTropis("Pisang", "Kuning", 120, "Lampung", 5);
        System.out.println("\n" + pisang.info());
    }
}