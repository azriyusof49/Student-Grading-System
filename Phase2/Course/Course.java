package Phase2.Course;

public class Course {
    private String CourseName;
    public Course(String CourseName){
        this.CourseName = CourseName;
    }
    public String getCourseName(){
        return this.CourseName;
    }

    public void displayCourseName(){
        System.out.println("Couse Name : " + this.CourseName);
    }

}
