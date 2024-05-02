package Phase2.User;

public class Admin {
    private String USERNAME, PASSWORD;

    public Admin (String username, String password){
        this.USERNAME = username;
        this.PASSWORD = password;
    }

    public boolean check(){
        if(this.USERNAME.equals("admin") && this.PASSWORD.equals("admin")){
            return true;
        }
        return false;
    }
}
