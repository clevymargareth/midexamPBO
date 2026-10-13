public class Main {
    public static void main(String[] args) {
        Customer andi = new Customer(101, "pass123", "Andi", 22, "andi@mail.com");
        Admin rina = new Admin(1, "admin123", "Rina", 30, "rina@mail.com");

       
        andi.logIn(101, "salah");
        andi.recoverPassword("andi@mail.com");
        andi.logIn(101, "reset101");
        andi.applyVerification("ktp.docx");
        andi.applyVerification("ktp.jpg");
        andi.getProfile().showDocuments();
        System.out.println("Status verifikasi: " + andi.getVerificationStatus());
        andi.logOut();

     
        rina.logIn(1, "admin123");
        rina.verifyUser(andi);
        System.out.println("Status verifikasi: " + andi.getVerificationStatus());
        rina.addVehicle("Honda Brio - Manual 2022");
        rina.updateVehicleDetails(1, "Honda Brio - Matic 2022");
        System.out.println("Kendaraan: " + rina.getVehicles());
        rina.addComplain("AC kurang dingin");
        System.out.println("Komplain: " + rina.retrieveComplain());
        rina.logOut();

     
        rina.addVehicle("Toyota Avanza - Manual 2020");
    }
}