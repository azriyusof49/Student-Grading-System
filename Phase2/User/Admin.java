package Phase2.User;


public class Admin extends User {
    private String USERNAME, PASSWORD;
    

    public Admin(String fname, String lname,String username, String password) {
        super(fname, lname);
        this.USERNAME = username;
        this.PASSWORD = password;
    }

    public boolean check() {
        if (this.USERNAME.equals("admin") && this.PASSWORD.equals("admin")) {
            return true;
        }
        return false;
    }
}
