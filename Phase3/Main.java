import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Course.*;
import Report.*;
import User.*;

public class Main {

    private ArrayList<String> studentNames = new ArrayList<>();
    private ArrayList<String> studentIDs = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    List<Double> MarkModule1 = new ArrayList<>();
    List<Double> studentTotalMarkModule1 = new ArrayList<>();
    List<Double> studentTotalMarkModule2 = new ArrayList<>();
    List<Double> studentTotalMarkModule3 = new ArrayList<>();
    List<Double> studentTotalMarkModule4 = new ArrayList<>();
    List<Double> studentTotalMarkModule5 = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    int count = 0;
    int countStudent = 0;
    Course[] softwareEngineering = new Course[5];

    String nameCourse[] = new String[] {
            "Module 1",
            "Module 2",
            "Module 3",
            "Module 4",
            "Module 5"
    };
    String hasImport[] = new String[] {
            "| FILE IMPORT : Null",
            "| FILE IMPORT : Null",
            "| FILE IMPORT : Null",
            "| FILE IMPORT : Null",
            "| FILE IMPORT : Null",
            "| FILE IMPORT : Null"
    };
    String menu[] = new String[] {
            "Manage Course | EMPTY",
            "Assign Percentage | NOT ASSIGN YET",
            "Import Student File | FILE IMPORT : NULL",
            "Import Mark Student | [0/5]",
            "Display GPA",
            "Display Info Student"
    };
    String hasAssign[] = new String[] {
            "",
            "",
            "",
            "",
            "",
    };

    public void run() {
        boolean exit = false;

        while (!exit) {

            System.out.println("----------- Student Grading System (Software Engineering)-----------");
            System.out.println("Number of Student : " + countStudent);
            System.out.printf(
                    "1. %s\n2. %s \n3. %s\n4. %s\n5. %s\n6. %s\n0. Exit\n", menu[0], menu[1], menu[2], menu[3], menu[4],
                    menu[5]);
            System.out.print("Select an option: ");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    // Manage Course functionality
                    manageCourse();
                    menu[0] = "Manage Course | DONE";
                    break;
                case 2:
                    AssignPercentage();
                    menu[1] = "Assign Percentage | DONE";
                    break;
                case 3:
                    if (studentIDs != null && studentNames != null) {
                        studentIDs.clear();
                        studentNames.clear();
                    }
                    readStudentFile();
                    displayStudentInfo();
                    menu[2] = "Import Student File | FILE IMPORT : DONE";
                    // Import Module File functionality
                    break;
                case 4:
                    importMarkModule();
                    // Assign Percentage functionality
                    break;
                case 5:
                    displayStudentGPA();
                    // Assign Percentage functionality
                    break;
                case 6:
                    displayStudentInfo();
                    break;
                case 0:
                    System.out.println("System Exiting....");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    public void manageCourse() {
        boolean exit = false;
        while (!exit) {
            int input;
            int CreaditUnit, Quiz, Assignment, Test, practicalTest, VideoAssignment;
            int FinalExam = 0;
            String hasfinalexam;
            System.out.println("----------- Student Grading System (Software Engineering)-----------");
            System.out.println("## COURSE MANAGEMENT ##");
            System.out.printf(
                    "1. %s %s\n2. %s %s\n3. %s %s\n4. %s %s\n5. %s %s\n0. Back\n", nameCourse[0], hasImport[0],
                    nameCourse[1], hasImport[1], nameCourse[2], hasImport[2],
                    nameCourse[3], hasImport[3],
                    nameCourse[4], hasImport[4]);
            System.out.print("Select an option: ");
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    System.out.println("Enter Course Name: ");
                    nameCourse[0] = scanner.nextLine();
                    System.out.println("Enter Creadit Unit: ");
                    CreaditUnit = scanner.nextInt();
                    System.out.println("Enter Quantity Quiz: ");
                    Quiz = scanner.nextInt();
                    System.out.println("Enter Quantity Assignment: ");
                    Assignment = scanner.nextInt();
                    System.out.println("Enter Quantity Test: ");
                    Test = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Did has a Final Exam (Y/N): ");
                    hasfinalexam = scanner.nextLine();
                    if (hasfinalexam.equalsIgnoreCase("Y")) {
                        FinalExam = 1;
                    }

                    softwareEngineering[0] = new Module1(nameCourse[0], CreaditUnit, Quiz, Assignment, Test, FinalExam);
                    break;
                case 2:
                    System.out.println("Enter Course Name: ");
                    nameCourse[1] = scanner.nextLine();
                    System.out.println("Enter Creadit Unit: ");
                    CreaditUnit = scanner.nextInt();
                    System.out.println("Enter Quantity Quiz: ");
                    Quiz = scanner.nextInt();
                    System.out.println("Enter Quantity Assignment: ");
                    Assignment = scanner.nextInt();
                    System.out.println("Enter Quantity Test: ");
                    Test = scanner.nextInt();
                    System.out.println("Enter Quantity Practical Test: ");
                    practicalTest = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Did has a Final Exam (Y/N): ");
                    hasfinalexam = scanner.nextLine();
                    if (hasfinalexam.equalsIgnoreCase("Y")) {
                        FinalExam = 1;
                    }
                    softwareEngineering[1] = new Module2(nameCourse[1], CreaditUnit, Quiz, Assignment, Test, FinalExam,
                            practicalTest);
                    break;
                case 3:
                    System.out.println("Enter Course Name: ");
                    nameCourse[2] = scanner.nextLine();
                    System.out.println("Enter Creadit Unit: ");
                    CreaditUnit = scanner.nextInt();
                    System.out.println("Enter Quantity Quiz: ");
                    Quiz = scanner.nextInt();
                    System.out.println("Enter Quantity Assignment: ");
                    Assignment = scanner.nextInt();
                    System.out.println("Enter Quantity Test: ");
                    Test = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Did has a Final Exam (Y/N): ");
                    hasfinalexam = scanner.nextLine();
                    if (hasfinalexam.equalsIgnoreCase("Y")) {
                        FinalExam = 1;
                    }
                    softwareEngineering[2] = new Module3(nameCourse[2], CreaditUnit, Quiz, Assignment, Test, FinalExam);
                    break;
                case 4:
                    System.out.println("Enter Course Name: ");
                    nameCourse[3] = scanner.nextLine();
                    System.out.println("Enter Creadit Unit: ");
                    CreaditUnit = scanner.nextInt();
                    System.out.println("Enter Quantity Quiz: ");
                    Quiz = scanner.nextInt();
                    System.out.println("Enter Quantity Assignment: ");
                    Assignment = scanner.nextInt();
                    System.out.println("Enter Quantity Test: ");
                    Test = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Did has a Final Exam (Y/N): ");
                    hasfinalexam = scanner.nextLine();
                    if (hasfinalexam.equalsIgnoreCase("Y")) {
                        FinalExam = 1;
                    }
                    softwareEngineering[3] = new Module4(nameCourse[3], CreaditUnit, Quiz, Assignment, Test, FinalExam);
                    break;
                case 5:
                    System.out.println("Enter Course Name: ");
                    nameCourse[4] = scanner.nextLine();
                    System.out.println("Enter Creadit Unit: ");
                    CreaditUnit = scanner.nextInt();
                    System.out.println("Enter Quantity Quiz: ");
                    Quiz = scanner.nextInt();
                    System.out.println("Enter Quantity Assignment: ");
                    Assignment = scanner.nextInt();
                    System.out.println("Enter Quantity Test: ");
                    Test = scanner.nextInt();
                    System.out.println("Enter Quantity Video Assignment: ");
                    VideoAssignment = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Did has a Final Exam (Y/N): ");
                    hasfinalexam = scanner.nextLine();
                    if (hasfinalexam.equalsIgnoreCase("Y")) {
                        FinalExam = 1;
                    }
                    softwareEngineering[3] = new Module5(nameCourse[4], CreaditUnit, Quiz, Assignment, Test, FinalExam,
                            VideoAssignment);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    break;
            }
        }
    }

    public void AssignPercentage() {
        int input;
        System.out.println("----------- Student Grading System (Software Engineering)-----------");
        System.out.println("## ASSIGN PERCENTAGE FOR EACH MODULE ##");
        System.out.printf(
                "1. %s %s\n2. %s %s\n3. %s %s\n4. %s %s\n5. %s %s\n0. Back\n", nameCourse[0], hasAssign[0],
                nameCourse[1], hasAssign[1], nameCourse[2], hasAssign[2], nameCourse[3], hasAssign[3], nameCourse[4],
                hasAssign[4]);
        System.out.print("Select an option: ");
        input = scanner.nextInt();
        scanner.nextLine();
        switch (input) {
            case 1:
                if (softwareEngineering[0] instanceof Module1) {
                    Module1 info = (Module1) softwareEngineering[0];
                    info.assignPercentage();
                    hasAssign[0] = "| DONE";
                }

                break;
            case 2:
                if (softwareEngineering[1] instanceof Module2) {
                    Module2 module2 = (Module2) softwareEngineering[1];
                    module2.assignPercentage();
                    hasAssign[1] = "| DONE";
                }

                break;
            case 3:
                if (softwareEngineering[2] instanceof Module3) {
                    Module3 module3 = (Module3) softwareEngineering[2];
                    module3.assignPercentage();
                    hasAssign[2] = "| DONE";
                }

                break;
            case 4:
                if (softwareEngineering[3] instanceof Module4) {
                    Module4 module4 = (Module4) softwareEngineering[3];
                    module4.assignPercentage();
                    hasAssign[3] = "| DONE";
                }

                break;
            case 5:
                if (softwareEngineering[4] instanceof Module5) {
                    Module5 module5 = (Module5) softwareEngineering[4];
                    module5.assignPercentage();
                    hasAssign[4] = "DONE";
                }
                break;
            default:
                break;
        }

    }

    public void displayStudentGPA() {
        Report info = new Report(students, studentTotalMarkModule1, studentTotalMarkModule2,
                studentTotalMarkModule3, studentTotalMarkModule4, studentTotalMarkModule5);

        //info.displayStudentGPA();
        info.displayReport();

    }

    public void readStudentFile() {

        String filepath;
        scanner.nextLine();
        System.out.println("Please enter the file location of StudentList.csv (path/to/your/[fileName].csv) : ");
        filepath = scanner.nextLine();
        System.out.println();
        String line = "";
        try (BufferedReader studentFile = new BufferedReader(new FileReader(filepath))) {
            while ((line = studentFile.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 2) {
                    studentIDs.add(values[0]);
                    studentNames.add(values[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (students != null) {
            students.clear();
            countStudent = 0;
        }
        for (int i = 0; i < studentNames.size(); i++) {
            students.add(new Student(studentNames.get(i), studentIDs.get(i), softwareEngineering));
            countStudent++;
        }
    }

    public void displayStudentInfo() {

        // Assign Student to Class
        for (Student info : students) {
            info.displayInfoCourse();

        }
        System.out.println("Total Student : " + countStudent);
    }

    public void importMarkModule() {
        boolean exit = false;
        int input;

        String filepath;
        while (!exit) {
            System.out.println("\n----------- Student Grading System (Software Engineering)-----------");
            System.out.println("IMPORT MARK FOR EACH MODULE");
            System.out.printf(
                    "1. %s %s\n2. %s %s\n3. %s %s\n4. %s %s\n5. %s %s\n0. Back\n", nameCourse[0], hasImport[0],
                    nameCourse[1], hasImport[1], nameCourse[2], hasImport[2],
                    nameCourse[3], hasImport[3],
                    nameCourse[4], hasImport[4]);
            System.out.print("Select an option: ");
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    System.out.printf("Please enter the file location of Mark %s.csv (path/to/your/[fileName].csv): \n",
                            nameCourse[0]);
                    filepath = scanner.nextLine();
                    if (softwareEngineering[0] instanceof Module1) {
                        Module1 info = (Module1) softwareEngineering[0];
                        info.getTotalMark(filepath);
                        studentTotalMarkModule1 = info.getStudentTotalMark();
                        hasImport[0] = "| FILE IMPORT : DONE";
                        count++;
                        menu[3] = "Import Mark Student | [" + count + "/5]";
                    }

                    break;
                case 2:
                    System.out.printf("Please enter the file location of Mark %s.csv(path/to/your/[fileName].csv): \n",
                            nameCourse[1]);
                    filepath = scanner.nextLine();
                    if (softwareEngineering[1] instanceof Module2) {
                        Module2 info = (Module2) softwareEngineering[1];
                        info.getTotalMark(filepath);
                        studentTotalMarkModule2 = info.getStudentTotalMark();
                        hasImport[1] = "| FILE IMPORT : DONE";
                        count++;
                        menu[3] = "Import Mark Student | [" + count + "/5]";
                    }
                    break;
                case 3:
                    System.out.printf("Please enter the file location of Mark %s.csv(path/to/your/[fileName].csv): \n",
                            nameCourse[2]);
                    filepath = scanner.nextLine();
                    if (softwareEngineering[2] instanceof Module3) {
                        Module3 info = (Module3) softwareEngineering[2];
                        info.getTotalMark(filepath);
                        studentTotalMarkModule3 = info.getStudentTotalMark();
                        hasImport[2] = "| FILE IMPORT : DONE";
                        count++;
                        menu[3] = "Import Mark Student | [" + count + "/5]";
                    }
                    break;
                case 4:
                    System.out.printf("Please enter the file location of Mark %s.csv(path/to/your/[fileName].csv): \n",
                            nameCourse[3]);
                    filepath = scanner.nextLine();
                    if (softwareEngineering[3] instanceof Module4) {
                        Module4 info = (Module4) softwareEngineering[3];
                        info.getTotalMark(filepath);
                        studentTotalMarkModule4 = info.getStudentTotalMark();
                        hasImport[3] = "| FILE IMPORT : DONE";
                        count++;
                        menu[3] = "Import Mark Student | [" + count + "/5]";
                    }
                    break;
                case 5:
                    System.out.printf("Please enter the file location of Mark %s.csv(path/to/your/[fileName].csv): \n",
                            nameCourse[4]);
                    filepath = scanner.nextLine();
                    if (softwareEngineering[4] instanceof Module5) {
                        Module5 info = (Module5) softwareEngineering[4];
                        info.getTotalMark(filepath);
                        studentTotalMarkModule5 = info.getStudentTotalMark();
                        hasImport[4] = "| FILE IMPORT : DONE";
                        count++;
                        menu[3] = "Import Mark Student | [" + count + "/5]";
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    break;
            }
        }

    }

    public static void main(String[] args) {
        Main mainApp = new Main();
        mainApp.run();
    }
}
