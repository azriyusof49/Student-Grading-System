<<<<<<< HEAD
package Phase2.User;

public class User {
    private String firstName, lastName;
    public User(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullname(){
        return (this.firstName + " " + this.lastName);
    }


}
=======
package Phase2.User;

public class User {
    private String firstName, lastName;
    public User(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullname(){
        return (this.firstName + " " + this.lastName);
    }


}
>>>>>>> eabd7a4b3666590e419c1b6567032a848e5f120f
