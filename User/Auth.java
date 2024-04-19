
public class Auth{
    private String USERNAME, PASSWORD;

    public Auth(String username, String password){//Constructor
        this.USERNAME = username;
        this.PASSWORD = password;
    }

    public boolean check(){
        if (this.USERNAME.equals("admin")  && this.PASSWORD.equals("admin") ) {
            return true;
        } else {
            return false;
        }
    }
}