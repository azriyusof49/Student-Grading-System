<<<<<<< HEAD
package Phase2.Report;

import Phase2.User.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import Phase2.Course.*;

public class Report {

    private List<String> studentIDs;
    private List<String> studentNames;
    private double creaditUnit;
    private String CourseName;
    double[] gpa, gradePoint;

    public Report() {

    }

    public Report(Student infoStudent, AssignPercentage infoModule, Calculate infoMark) {
        studentIDs = infoStudent.getStudentIDs();
        studentNames = infoStudent.getStudentNames();

        this.creaditUnit = infoModule.getCreaditUnit();
        this.gpa = infoMark.getGpa();
        this.gradePoint = infoMark.getGradePoint();
        CourseName = infoModule.getCourseName();
    }

    // GENERATE REPORT
    public void displayReport() {
        System.out.println("Exporting File.....");
        System.out.println();
        for (int i = 0; i < studentIDs.size(); i++) {
            System.out.println((i + 1) + ".");
            System.out.println("Student ID: " + studentIDs.get(i));
            System.out.println("Name: " + studentNames.get(i));
            System.out.println("Course Name : " + CourseName);
            System.out.printf("Creadit: %.3f\n", creaditUnit);
            System.out.println("Grade Point: " + gradePoint[i]);
            System.out.println("GPA : " + gpa[i]);
            System.out.println();
        }

    }

    public void generateCSVReport(String filePath) {
        try {
            FileWriter csvWriter = new FileWriter(filePath);
            csvWriter.append("Student ID,Name,Course Name,Credit,Grade Point,GPA\n");

            for (int i = 0; i < studentIDs.size(); i++) {
                csvWriter.append(studentIDs.get(i) + ",");
                csvWriter.append(studentNames.get(i) + ",");
                csvWriter.append(CourseName + ","); // Assuming courseName is a String variable
                csvWriter.append(String.format("%.3f,", creaditUnit)); // Assuming creaditUnit is a double variable
                csvWriter.append(gradePoint[i] + ",");
                csvWriter.append(gpa[i] + "\n");
            }

            csvWriter.flush();
            csvWriter.close();
            System.out.println("File exported successfully to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
=======
package Phase2.Report;

import Phase2.User.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import Phase2.Course.*;

public class Report {

    private List<String> studentIDs;
    private List<String> studentNames;
    private double creaditUnit;
    private String CourseName;
    double[] gpa, gradePoint;

    public Report() {

    }

    public Report(Student infoStudent, AssignPercentage infoModule, Calculate infoMark) {
        studentIDs = infoStudent.getStudentIDs();
        studentNames = infoStudent.getStudentNames();

        this.creaditUnit = infoModule.getCreaditUnit();
        this.gpa = infoMark.getGpa();
        this.gradePoint = infoMark.getGradePoint();
        CourseName = infoModule.getCourseName();
    }

    // GENERATE REPORT
    public void displayReport() {
        System.out.println("Exporting File.....");
        System.out.println();
        for (int i = 0; i < studentIDs.size(); i++) {
            System.out.println((i + 1) + ".");
            System.out.println("Student ID: " + studentIDs.get(i));
            System.out.println("Name: " + studentNames.get(i));
            System.out.println("Course Name : " + CourseName);
            System.out.printf("Creadit: %.3f\n", creaditUnit);
            System.out.println("Grade Point: " + gradePoint[i]);
            System.out.println("GPA : " + gpa[i]);
            System.out.println();
        }

    }

    public void generateCSVReport(String filePath) {
        try {
            FileWriter csvWriter = new FileWriter(filePath);
            csvWriter.append("Student ID,Name,Course Name,Credit,Grade Point,GPA\n");

            for (int i = 0; i < studentIDs.size(); i++) {
                csvWriter.append(studentIDs.get(i) + ",");
                csvWriter.append(studentNames.get(i) + ",");
                csvWriter.append(CourseName + ","); // Assuming courseName is a String variable
                csvWriter.append(String.format("%.3f,", creaditUnit)); // Assuming creaditUnit is a double variable
                csvWriter.append(gradePoint[i] + ",");
                csvWriter.append(gpa[i] + "\n");
            }

            csvWriter.flush();
            csvWriter.close();
            System.out.println("File exported successfully to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
>>>>>>> eabd7a4b3666590e419c1b6567032a848e5f120f
}