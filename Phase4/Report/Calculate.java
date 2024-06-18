package Report;

import java.util.*;
import Course.*;
import User.Student;

public class Calculate {

     // Attributes
    private ArrayList<Student> students;
    private List<Double> studentTotalMarkModule1;
    private List<Double> studentTotalMarkModule2;
    private List<Double> studentTotalMarkModule3;
    private List<Double> studentTotalMarkModule4;
    private List<Double> studentTotalMarkModule5;

    public List<Double> gradePointsModule1 = new ArrayList<>();
    public List<Double> gradePointsModule2 = new ArrayList<>();
    public List<Double> gradePointsModule3 = new ArrayList<>();
    public List<Double> gradePointsModule4 = new ArrayList<>();
    public List<Double> gradePointsModule5 = new ArrayList<>();

    // Constructor
    public Calculate(ArrayList<Student> students, List<Double> totalMark1, List<Double> totalMark2,
                     List<Double> totalMark3, List<Double> totalMark4,
                     List<Double> totalMark5) {
        this.students = students;
        this.studentTotalMarkModule1 = totalMark1;
        this.studentTotalMarkModule2 = totalMark2;
        this.studentTotalMarkModule3 = totalMark3;
        this.studentTotalMarkModule4 = totalMark4;
        this.studentTotalMarkModule5 = totalMark5;
        calculateGradePoints();
    }

     // Getter for students
    public ArrayList<Student> getStudents() {
        return students;
    }

    // Method to calculate grade points for each student
    private void calculateGradePoints() {
        for (Student student : students) {
            Course[] courses = student.getCourses();
            for (Course course : courses) {
                if (course instanceof Module1) {
                    Module1 module = (Module1) course;
                    gradePointsModule1.add(getGradePoint(studentTotalMarkModule1, students.indexOf(student), module.getCreaditUnit()));
                } else if (course instanceof Module2) {
                    Module2 module = (Module2) course;
                    gradePointsModule2.add(getGradePoint(studentTotalMarkModule2, students.indexOf(student), module.getCreaditUnit()));
                } else if (course instanceof Module3) {
                    Module3 module = (Module3) course;
                    gradePointsModule3.add(getGradePoint(studentTotalMarkModule3, students.indexOf(student), module.getCreaditUnit()));
                } else if (course instanceof Module4) {
                    Module4 module = (Module4) course;
                    gradePointsModule4.add(getGradePoint(studentTotalMarkModule4, students.indexOf(student), module.getCreaditUnit()));
                } else if (course instanceof Module5) {
                    Module5 module = (Module5) course;
                    gradePointsModule5.add(getGradePoint(studentTotalMarkModule5, students.indexOf(student), module.getCreaditUnit()));
                }
            }
        }
    }

    // Method to calculate grade point for a student
    private double getGradePoint(List<Double> studentMarks, int studentIndex, double creditUnit) {
        if (studentMarks.size() > studentIndex) {
            double mark = studentMarks.get(studentIndex);
            return (mark / 100) * creditUnit;
        } else {
            return 0.0; // Default grade point if mark is not available
        }
    }

    // Method to calculate GPA for each student
    public List<Double> getGPA() {
        double[] studentSumGradePoint = new double[students.size()];
        double[] totalCreditUnits = new double[students.size()];
        List<Double> studentGPA = new ArrayList<>();

        for (int studentIndex = 0; studentIndex < students.size(); studentIndex++) {
            Student student = students.get(studentIndex);
            Course[] courses = student.getCourses();
            double totalCreditUnit = 0;

            for (Course course : courses) {
                double creditUnit = 0;
                if (course instanceof Module1) {
                    Module1 module = (Module1) course;
                    creditUnit = module.getCreaditUnit();
                    studentSumGradePoint[studentIndex] += gradePointsModule1.get(studentIndex) * creditUnit;
                } else if (course instanceof Module2) {
                    Module2 module = (Module2) course;
                    creditUnit = module.getCreaditUnit();
                    studentSumGradePoint[studentIndex] += gradePointsModule2.get(studentIndex) * creditUnit;
                } else if (course instanceof Module3) {
                    Module3 module = (Module3) course;
                    creditUnit = module.getCreaditUnit();
                    studentSumGradePoint[studentIndex] += gradePointsModule3.get(studentIndex) * creditUnit;
                } else if (course instanceof Module4) {
                    Module4 module = (Module4) course;
                    creditUnit = module.getCreaditUnit();
                    studentSumGradePoint[studentIndex] += gradePointsModule4.get(studentIndex) * creditUnit;
                } else if (course instanceof Module5) {
                    Module5 module = (Module5) course;
                    creditUnit = module.getCreaditUnit();
                    studentSumGradePoint[studentIndex] += gradePointsModule5.get(studentIndex) * creditUnit;
                }
                totalCreditUnit += creditUnit;
            }

            totalCreditUnits[studentIndex] = totalCreditUnit;
        }

        for (int i = 0; i < students.size(); i++) {
            double sumGradePoints = studentSumGradePoint[i];
            studentGPA.add(sumGradePoints / totalCreditUnits[i]);
        }

        return studentGPA;
    }

    // Method to display GPA for each student
    public void displayStudentGPA() {
        List<Double> gpas = getGPA();
        for (int i = 0; i < gpas.size(); i++) {
            Student student = students.get(i);
            System.out.println("ID: " + student.getStudentID());
            System.out.printf("GPA: %.2f\n", gpas.get(i));
        }
    }
}
