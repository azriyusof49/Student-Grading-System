package User;

import Course.*;

public class Student extends User{
    
    private Course[] course;
    private String StudentID;

    public Student(String name, String StudentID,Course[] course){
        super(name);
        this.course = course;
        this.StudentID = StudentID;
    }

    public Course[] getCourses(){
        return course;
    }

    public String getStudentID(){
        return StudentID;
    }

    public void displayInfoCourse(){
        System.out.println("--------INFO "+getStudentID()+"--------");
        System.out.println("Student Name : " + getName());
        System.out.println("COURSE ENROLL : ");
        for (int i = 0; i < course.length; i++) {
            if (course[i] instanceof Module1 ) {
                Module1 info = (Module1) course[i];
                System.out.println("Module: " + info.getCourseName());
                System.out.println("Creadit Unit: " + info.getCreaditUnit());
                System.out.println("Quantity of Quiz: " + info.getQuiz());
                System.out.println("Quantity of Assignment: " + info.getAssignment());
                System.out.println("Quantity of Test: " + info.getTest());
                if (info.getFinalExam() != 0) {
                    System.out.println("Final Exam : Y");
                }else{
                    System.out.println("Final Exam : N");
                }
                System.out.println();
            }
            if (course[i] instanceof Module2 ) {
                Module2 info = (Module2) course[i];
                System.out.println("Module: " + info.getCourseName());
                System.out.println("Creadit Unit: " + info.getCreaditUnit());
                System.out.println("Quantity of Quiz: " + info.getQuiz());
                System.out.println("Quantity of Assignment: " + info.getAssignment());
                System.out.println("Quantity of Test: " + info.getTest());
                System.out.println("Quantity of Practical Test : " + info.getPracticalTest());
                if (info.getFinalExam() != 0) {
                    System.out.println("Final Exam : Y");
                }else{
                    System.out.println("Final Exam : N");
                }
                System.out.println();
            }
            if (course[i] instanceof Module3 ) {
                Module3 info = (Module3) course[i];
                System.out.println("Module: " + info.getCourseName());
                System.out.println("Creadit Unit: " + info.getCreaditUnit());
                System.out.println("Quantity of Quiz: " + info.getQuiz());
                System.out.println("Quantity of Assignment: " + info.getAssignment());
                System.out.println("Quantity of Test: " + info.getTest());
                //System.out.println("Quantity of Practical Test : " + info.getPracticalTest());
                if (info.getFinalExam() != 0) {
                    System.out.println("Final Exam : Y");
                }else{
                    System.out.println("Final Exam : N");
                }
                System.out.println();
            }
            if (course[i] instanceof Module4 ) {
                Module4 info = (Module4) course[i];
                System.out.println("Module: " + info.getCourseName());
                System.out.println("Creadit Unit: " + info.getCreaditUnit());
                System.out.println("Quantity of Quiz: " + info.getQuiz());
                System.out.println("Quantity of Assignment: " + info.getAssignment());
                System.out.println("Quantity of Test: " + info.getTest());
                //System.out.println("Quantity of Practical Test : " + info.getPracticalTest());
                if (info.getFinalExam() != 0) {
                    System.out.println("Final Exam : Y");
                }else{
                    System.out.println("Final Exam : N");
                }
                System.out.println();
            }
            if (course[i] instanceof Module5 ) {
                Module5 info = (Module5) course[i];
                System.out.println("Module: " + info.getCourseName());
                System.out.println("Creadit Unit: " + info.getCreaditUnit());
                System.out.println("Quantity of Quiz: " + info.getQuiz());
                System.out.println("Quantity of Assignment: " + info.getAssignment());
                System.out.println("Quantity of Test: " + info.getTest());
                System.out.println("Quantity of Video Assigment : " + info.getVideoAssignment());
                if (info.getFinalExam() != 0) {
                    System.out.println("Final Exam : Y");
                }else{
                    System.out.println("Final Exam : N");
                }
                System.out.println();
            }
        }
        //System.out.println("---------------------------------------------");
        
    }
}
