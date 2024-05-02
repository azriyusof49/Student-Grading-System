package Phase2.User;

public class Student {
    private String sFirstName,sLastName, StudentID;

    public Student(String sFirstName,String sLastName, String StudentID){
        this.StudentID = StudentID;
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
    }

    public String getsFirstName() {
        return sFirstName;
    }
    public String getsLastName() {
        return sLastName;
    }
    public String getStudentID() {
        return StudentID;
    }

    public String getFullname(){
        return (this.sFirstName + " " + this.sLastName);
    }

    public void displayStudent(){
     System.out.println("List Student");
     System.out.println("Name : " + getFullname());   
     System.out.println("Studetn ID : " + getStudentID());
    }

}
