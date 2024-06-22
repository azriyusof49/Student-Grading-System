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
            if (course[i] instanceof Subject1 ) {
                Subject1 info = (Subject1) course[i];
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
            if (course[i] instanceof Subject2 ) {
                Subject2 info = (Subject2) course[i];
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
            if (course[i] instanceof Subject3 ) {
                Subject3 info = (Subject3) course[i];
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
            if (course[i] instanceof Subject4 ) {
                Subject4 info = (Subject4) course[i];
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
            if (course[i] instanceof Subject5 ) {
                Subject5 info = (Subject5) course[i];
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
