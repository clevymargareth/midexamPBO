import java.util.ArrayList;

public class Admin extends User {
    private ArrayList<String> vehicles = new ArrayList<>();
    private ArrayList<String> complains = new ArrayList<>();

    public Admin(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public String addVehicle(String vehicle) {
        if (cekLogin() == false) {
            System.out.println("Harus login dulu");
            return null;
        }
        vehicles.add(vehicle);
        System.out.println("Kendaraan ditambahkan, id " + vehicles.size());
        return vehicle;
    }

    public void updateVehicleDetails(int vehicleId, String detail) {
        if (cekLogin() == false) {
            System.out.println("Harus login dulu");
        } else if (vehicleId < 1 || vehicleId > vehicles.size()) {
            System.out.println("Kendaraan tidak ditemukan");
        } else {
            vehicles.set(vehicleId - 1, detail);
            System.out.println("Kendaraan " + vehicleId + " diubah jadi: " + detail);
        }
    }

    public ArrayList<String> getVehicles() { return vehicles; }

    public void addComplain(String komplain) {
        complains.add(komplain);
    }

    public ArrayList<String> retrieveComplain() {
        return complains;
    }

    public void verifyUser(Customer c) {
        if (cekLogin() == false) {
            System.out.println("Harus login dulu");
        } else if (c.getProfile().getDoc().equals("")) {
            System.out.println(c.getProfile().getName() + " belum upload dokumen");
        } else {
            c.setVerificationStatus(true);
            System.out.println(c.getProfile().getName() + " sudah diverifikasi");
        }
    }
}