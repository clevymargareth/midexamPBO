public class User {
    private UserProfile profile;
    private boolean sudahLogin = false;

    public User(int userId, String password, String name, int age, String emailId) {
        profile = new UserProfile(userId, password, name, age, emailId);
    }

    public UserProfile getProfile() { return profile; }

    public boolean cekLogin() { return sudahLogin; }

    public void logIn(int userId, String password) {
        if (userId == profile.getUserId() && password.equals(profile.getPassword())) {
            sudahLogin = true;
            System.out.println(profile.getName() + " berhasil login");
        } else {
            System.out.println("Login gagal");
        }
    }

    public void recoverPassword(String email) {
        if (email.equals(profile.getEmail())) {
            profile.setPassword("reset" + profile.getUserId());
            System.out.println("Password baru: reset" + profile.getUserId());
        } else {
            System.out.println("Email tidak terdaftar");
        }
    }

    public void logOut() {
        sudahLogin = false;
        System.out.println(profile.getName() + " logout");
    }
}