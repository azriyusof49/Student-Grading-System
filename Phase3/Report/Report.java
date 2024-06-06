package Report;

import java.util.ArrayList;
import java.util.List;

import Course.Course;
import Course.Module1;
import Course.Module2;
import Course.Module3;
import Course.Module4;
import Course.Module5;
import User.Student;

/**
 * Report
 */
public class Report extends Calculate {

    public Report(ArrayList<Student> students, List<Double> totalMark1, List<Double> totalMark2,
            List<Double> totalMark3, List<Double> totalMark4,
            List<Double> totalMark5) {
        super(students, totalMark1, totalMark2, totalMark3, totalMark4, totalMark5);
        

    }

    public void displayReport() {
        System.out.println("----- LIST STUDENT -------");
        for (int studentIndex = 0; studentIndex < super.getStudents().size(); studentIndex++) {
            Student student = super.getStudents().get(studentIndex);
            Course[] courses = student.getCourses();
            System.out.println("---- STUDENT RESULT --- ");
            System.out.println("Student ID : " + student.getStudentID());
            System.out.println("Name : " + student.getName());
            for (Course course : courses) {
                if (course instanceof Module1) {
                    Module1 info = (Module1) course;
                    // Ensure gradePointsModule1 has elements before accessing it
                    if (super.gradePointsModule1.size() > studentIndex) {
                        System.out.printf("%s : %.2f\n", info.getCourseName(),
                                super.gradePointsModule1.get(studentIndex));
                    } else {
                        System.out.println("Module 1: Grade Point Not Available");
                    }
                } else if (course instanceof Module2) {
                    Module2 info = (Module2) course;
                    // Ensure gradePointsModule1 has elements before accessing it
                    if (super.gradePointsModule2.size() > studentIndex) {
                        System.out.printf("%s : %.1f\n", info.getCourseName(),
                                super.gradePointsModule2.get(studentIndex));
                    } else {
                        System.out.println("Module 2: Grade Point Not Available");
                    }
                } else if (course instanceof Module3) {
                    Module3 info = (Module3) course;
                    // Ensure gradePointsModule1 has elements before accessing it
                    if (super.gradePointsModule3.size() > studentIndex) {
                        System.out.printf("%s : %.1f\n", info.getCourseName(),
                                super.gradePointsModule3.get(studentIndex));
                    } else {
                        System.out.println("Module 3: Grade Point Not Available");
                    }
                } else if (course instanceof Module4) {
                    Module4 info = (Module4) course;
                    // Ensure gradePointsModule1 has elements before accessing it
                    if (super.gradePointsModule4.size() > studentIndex) {
                        System.out.printf("%s : %.1f\n", info.getCourseName(),
                                super.gradePointsModule4.get(studentIndex));
                    } else {
                        System.out.println("Module 4: Grade Point Not Available");
                    }
                } else if (course instanceof Module5) {
                    Module5 info = (Module5) course;
                    // Ensure gradePointsModule1 has elements before accessing it
                    if (super.gradePointsModule5.size() > studentIndex) {
                        System.out.printf("%s : %.1f\n", info.getCourseName(),
                                super.gradePointsModule5.get(studentIndex));
                    } else {
                        System.out.println("Module 5: Grade Point Not Available");
                    }
                }
            }
            System.out.printf("GPA : %.2f",super.getGPA().get(studentIndex));
            System.out.println();

        }
    }

}
