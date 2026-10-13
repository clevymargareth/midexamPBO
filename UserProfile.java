public class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private String doc = "";

    public UserProfile(int userId, String password, String name, int age, String emailId) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    public int getUserId() { return userId; }
    public String getPassword() { return password; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return emailId; }
    public String getDoc() { return doc; }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean setDoc(String doc) {
        if (doc.endsWith(".jpg") || doc.endsWith(".png") || doc.endsWith(".pdf")) {
            this.doc = doc;
            return true;
        }
        return false;
    }

    public void editProfile(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    public void showDocuments() {
        if (doc.equals("")) {
            System.out.println("Belum ada dokumen");
        } else {
            System.out.println("Dokumen: " + doc);
        }
    }
}