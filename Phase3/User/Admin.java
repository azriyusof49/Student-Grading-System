package User;

public class Admin extends User {

    private String userName, password;

    public Admin(String name, String userName, String password) {
        super(name);
        setPassword(password);
        setUserName(userName);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void displayInfo(){
        System.out.println("----- ADMIN ------");
        System.out.println("NAME : "+ getName());
        System.out.println("USERNAME : " + getUserName());
        System.out.println("PASSWORD : " + getPassword());
    }

}
