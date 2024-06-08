package Report;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Course.*;
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

    public String getGrade(double gradePoints) {
        String grade = "";
        if (gradePoints == 4.0) {
            grade = "A";
        } else if (gradePoints > 3.5 && gradePoints < 4.0) {
            grade = "B+";
        } else if (gradePoints > 3.0 && gradePoints <= 3.5) {
            grade = "B";
        } else if (gradePoints > 2.5 && gradePoints <= 3.0) {
            grade = "C+";
        } else if (gradePoints > 2.0 && gradePoints <= 2.5) {
            grade = "C";
        } else if (gradePoints > 1.5 && gradePoints <= 2.0) {
            grade = "D+";
        } else if (gradePoints > 1.0 && gradePoints <= 1.5) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
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
                        System.out.printf("%s : %.2f | %s\n", info.getCourseName(),
                                super.gradePointsModule1.get(studentIndex),
                                getGrade(super.gradePointsModule1.get(studentIndex)));

                    } else {
                        System.out.println("Module 1: Grade Point Not Available");
                    }
                } else if (course instanceof Module2) {
                    Module2 info = (Module2) course;
                    // Ensure gradePointsModule1 has elements before accessing it
                    if (super.gradePointsModule2.size() > studentIndex) {
                        System.out.printf("%s : %.2f | %s\n", info.getCourseName(),
                                super.gradePointsModule2.get(studentIndex),
                                getGrade(super.gradePointsModule2.get(studentIndex)));
                    } else {
                        System.out.println("Module 2: Grade Point Not Available");
                    }
                } else if (course instanceof Module3) {
                    Module3 info = (Module3) course;
                    // Ensure gradePointsModule1 has elements before accessing it
                    if (super.gradePointsModule3.size() > studentIndex) {
                        System.out.printf("%s : %.2f | %s\n", info.getCourseName(),
                                super.gradePointsModule3.get(studentIndex),
                                getGrade(super.gradePointsModule3.get(studentIndex)));
                    } else {
                        System.out.println("Module 3: Grade Point Not Available");
                    }
                } else if (course instanceof Module4) {
                    Module4 info = (Module4) course;
                    // Ensure gradePointsModule1 has elements before accessing it
                    if (super.gradePointsModule4.size() > studentIndex) {
                        System.out.printf("%s : %.2f | %s\n", info.getCourseName(),
                                super.gradePointsModule4.get(studentIndex),
                                getGrade(super.gradePointsModule4.get(studentIndex)));
                    } else {
                        System.out.println("Module 4: Grade Point Not Available");
                    }
                } else if (course instanceof Module5) {
                    Module5 info = (Module5) course;
                    // Ensure gradePointsModule1 has elements before accessing it
                    if (super.gradePointsModule5.size() > studentIndex) {
                        System.out.printf("%s : %.2f| %s\n", info.getCourseName(),
                                super.gradePointsModule5.get(studentIndex),
                                getGrade(super.gradePointsModule5.get(studentIndex)));
                    } else {
                        System.out.println("Module 5: Grade Point Not Available");
                    }
                }
            }
            System.out.printf("GPA : %.2f", super.getGPA().get(studentIndex));
            System.out.println();

        }
    }

    public void generateCSVReport(String filePath) {
        try {
            FileWriter csvWriter = new FileWriter(filePath);
            csvWriter.append("Student ID,Name,Course Name,Grade Point,Grade,GPA\n");

            List<Student> students = getStudents();

            for (int studentIndex = 0; studentIndex < students.size(); studentIndex++) {
                Student student = students.get(studentIndex);
                Course[] courses = student.getCourses();
                boolean isFirstCourse = true;
                boolean appendGPA = true;
                StringBuilder row = new StringBuilder();
                for (Course course : courses) {
                    if (isFirstCourse) {
                        row.append(student.getStudentID())
                                .append(',')
                                .append(student.getName())
                                .append(',');
                        isFirstCourse = false;
                    }
                    if (course instanceof Module1) {
                        Module1 info = (Module1) course;
                        if (super.gradePointsModule1.size() > studentIndex) {
                            row.append(info.getCourseName())
                                    .append(',')
                                    .append(String.valueOf(String.format("%.2f",super.gradePointsModule1.get(studentIndex))))
                                    .append(',')
                                    .append(getGrade(super.gradePointsModule1.get(studentIndex)))
                                    .append('\n');
                            if (isFirstCourse != true) {
                                row.append(",,");
                            }
                        } else {
                            System.out.println("Module 1: Grade Point Not Available");
                        }
                    } else if (course instanceof Module2) {
                        Module2 info = (Module2) course;
                        if (super.gradePointsModule2.size() > studentIndex) {
                            row.append(info.getCourseName())
                                    .append(',')
                                    .append(String.valueOf(String.format("%.2f",super.gradePointsModule2.get(studentIndex))))
                                    .append(',')
                                    .append(getGrade(super.gradePointsModule2.get(studentIndex)))
                                    .append('\n');
                            if (isFirstCourse != true) {
                                row.append(",,");
                            }
                        } else {
                            System.out.println("Module 2: Grade Point Not Available");
                        }
                    } else if (course instanceof Module3) {
                        Module3 info = (Module3) course;
                        if (super.gradePointsModule3.size() > studentIndex) {
                            row.append(info.getCourseName())
                                    .append(',')
                                    .append(String.valueOf(String.format("%.2f",super.gradePointsModule3.get(studentIndex))))
                                    .append(',')
                                    .append(getGrade(super.gradePointsModule3.get(studentIndex)))
                                    .append('\n');
                            if (isFirstCourse != true) {
                                row.append(",,");
                            }
                        } else {
                            System.out.println("Module 3: Grade Point Not Available");
                        }
                    } else if (course instanceof Module4) {
                        Module4 info = (Module4) course;
                        if (super.gradePointsModule4.size() > studentIndex) {
                            row.append(info.getCourseName())
                                    .append(',')
                                    .append(String.valueOf(String.format("%.2f",super.gradePointsModule4.get(studentIndex))))
                                    .append(',')
                                    .append(getGrade(super.gradePointsModule4.get(studentIndex)))
                                    .append('\n');
                            if (isFirstCourse != true) {
                                row.append(",,");
                            }
                        } else {
                            System.out.println("Module 4: Grade Point Not Available");
                        }
                    } else if (course instanceof Module5) {
                        Module5 info = (Module5) course;
                        if (super.gradePointsModule5.size() > studentIndex) {
                            row.append(info.getCourseName())
                                    .append(',')
                                    .append(String.valueOf(String.format("%.2f",super.gradePointsModule5.get(studentIndex))))
                                    .append(',')
                                    .append(getGrade(super.gradePointsModule5.get(studentIndex)))
                                    .append('\n');
                            if (isFirstCourse != true) {
                                row.append(",,");
                            }
                        } else {
                            System.out.println("Module 5: Grade Point Not Available");
                        }
                    }
                }
                if (appendGPA) {
                    row.append(",,,")
                            .append(String.valueOf(String.format("%.2f", super.getGPA().get(studentIndex))))
                            .append('\n');
                    appendGPA = false;
                    isFirstCourse = true;
                }
                csvWriter.append(row.toString());
            }

            csvWriter.flush();
            csvWriter.close();
            System.out.println("CSV file created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
