package Phase2.Report;
import java.util.List;

import Phase2.Course.AssignPercentage;
import Phase2.Course.MarkModule;


public class Calculate{
    private double[] totalMark;
    private double[] gradePoint;
    private double[] gpa;
    private double TotalCreaditUnit,CreaditUnit;
    List<String> studentId;
    public Calculate(MarkModule mark,double totalCreaditUnit, String filePath, AssignPercentage creaditUnit) {
        this.TotalCreaditUnit = totalCreaditUnit;
        this.CreaditUnit = creaditUnit.getCreaditUnit();
        this.totalMark = mark.calculateTotalMark();
        studentId = mark.getStudentId();
    }

    public double[] getGradePoint(){
        gradePoint = new double[totalMark.length];
        for(int i = 0; i < totalMark.length; i++){
            gradePoint[i] = (totalMark[i]/100) * CreaditUnit;
        }
        return gradePoint;
    }

    public double[] getGpa(){
        gpa = new double[totalMark.length];
        gradePoint = getGradePoint();
        for(int i = 0; i < totalMark.length; i++){
            gpa[i] = gradePoint[i]/getTotalCreaditUnit();
        }
        return gpa;
        
    }

    public void displayGpa() {
        //List<String> studentId = mark.getStudentId(); // Accessing MarkModule method
        gpa = getGpa();
        for (int i = 0; i < studentId.size(); i++) {
            System.out.println();
            System.out.println((i + 1) + ".");
            System.out.println("Student ID : " + studentId.get(i));
            System.out.println("Total Mark : " + totalMark[i] + "%");
            System.out.println("GPA : " + gpa[i]);
        }
    }
    

    public double getTotalCreaditUnit() {
        return TotalCreaditUnit;
    }

    public void displayResult(){
        gpa = getGpa();
        gradePoint = getGradePoint();

        for (int i = 0; i < gpa.length; i++) {
            System.out.println("GPA : " + gpa[i]);
            System.out.println("GradePoint : " + gradePoint[i]);
        }
    }

    

}

