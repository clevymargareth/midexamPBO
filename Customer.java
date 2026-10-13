public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public boolean getVerificationStatus() { return verificationStatus; }

    public void setVerificationStatus(boolean status) {
        verificationStatus = status;
    }

    public void applyVerification(String doc) {
        if (cekLogin() == false) {
            System.out.println("Harus login dulu");
        } else if (getProfile().setDoc(doc)) {
            System.out.println("Pengajuan verifikasi dikirim, dokumen: " + doc);
        } else {
            System.out.println("Dokumen harus .jpg, .png, atau .pdf");
        }
    }
}