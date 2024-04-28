public class Auth{
    private String USERNAME, PASSWORD;

    public Auth(String username, String password){//Constructor
        this.USERNAME = username;
        this.PASSWORD = password;
    }

    public boolean check(){
        String[] validUsernames = {"admin", "ad", "user2"};
        String[] validPasswords = {"admin", "ad", "password2"};
        for (int i = 0; i < validUsernames.length; i++) {
            if (this.USERNAME.equals(validUsernames[i])  && this.PASSWORD.equals(validPasswords[i]) ) {
                return true;
            } 
        }
        return false;
    }
}