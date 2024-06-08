package Course;

public class Course  implements Expand{
    private String courseName;
    public Course(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    
    @Override
    public void assignPercentage(){

    };
    @Override
    public void getTotalMark(String filePath){
        
    };

}