<<<<<<< HEAD
package Phase2;

import java.util.Scanner;

import Phase2.Course.*;//Course Module
import Phase2.Report.Calculate;
import Phase2.Report.Report;
import Phase2.User.*;

public class Main {
    public static void main(String[] args) {
        // TODO : DEBUG,JUST MAKE 1 module
        final int moduleCount = 1;
        String[] moduleName;
        String username, password, StudentFilePath, ModuleFilePath,printReport,filePath;
        String[] holdText;
        int[] quiz, assignment, test, CreaditUnit;
        double TotalCreaditUnit = 0;
        boolean[] hasFinalExam;
        Scanner in = new Scanner(System.in);

        // Assign to quantity module
        moduleName = new String[moduleCount];
        holdText = new String[moduleCount];
        quiz = new int[moduleCount];
        assignment = new int[moduleCount];
        test = new int[moduleCount];
        CreaditUnit = new int[moduleCount];
        hasFinalExam = new boolean[moduleCount];

        // User Enter username and passoword
        System.out.print("Enter Username: ");
        username = in.nextLine();
        System.out.print("Enter Password: ");
        password = in.nextLine();

        Admin Auth = new Admin("Admin", "", username, password);

        if (Auth.check()) {

            for (int i = 0; i < moduleCount; i++) {
                System.out.print("Enter Name Module: ");
                moduleName[i] = in.nextLine();
                System.out.print("It has a Final Exam? (Y/N): ");
                holdText[i] = in.nextLine();
                System.out.print("Enter a Creadit Unit: ");
                CreaditUnit[i] = in.nextInt();
                System.out.print("Enter Quantity Quiz: ");
                quiz[i] = in.nextInt();
                System.out.print("Enter Quantity Assignment: ");
                assignment[i] = in.nextInt();
                System.out.print("Enter Quantity Test: ");
                test[i] = in.nextInt();
                in.nextLine();

                TotalCreaditUnit += CreaditUnit[i];

                if (holdText[i].equalsIgnoreCase("Y")) {
                    hasFinalExam[i] = true;
                } else {
                    hasFinalExam[i] = false;
                }
                System.out.println(" ");
            }
            AssignPercentage[] setPersentage = new AssignPercentage[moduleCount];

            // TODO : MAKE A SPECIFIC TASK FOR EACH MODULE
            // User Assign Percentage of Assignment
            for (int i = 0; i < moduleCount; i++) {
                setPersentage[i] = new AssignPercentage(moduleName[i], quiz[i], assignment[i], test[i], hasFinalExam[i],
                        CreaditUnit[i]);
                setPersentage[i].displayAssignmentList();
                setPersentage[i].getPercentage();

                // check if percentage is over 100 or below
                while (!setPersentage[i].checkPercentage()) {
                    setPersentage[i].getPercentage();
                }
                setPersentage[i].displayPercentage();

                System.out.println(" ");
            }

            // import file name student and id
            // Value in File : STUDENTID , STUDENT NAME
            System.out.println("Please enter the file location of StudentList.csv (path/to/your/[fileName].csv) : ");
            StudentFilePath = in.nextLine();
            Student studentInfo = new Student(StudentFilePath);
            studentInfo.importCSV();
            studentInfo.displayStudent();

            System.out.println("Total of Student : " + studentInfo.getStudentCount());
            System.out.println(TotalCreaditUnit);
            System.out.println();

            // Import Mark for each module
            MarkModule[] MarkModule = new MarkModule[moduleCount];
            Calculate[] Mark = new Calculate[moduleCount];
            for (int i = 0; i < moduleCount; i++) {
                // Value in File : STUDENTID , QUIZ 1, QUIZ 2, Assignment 1, Assignment 2, Tes 1, Test 2, Final Exam
                System.out.println("Please enter the file location of MarkModule" + (i + 1) + ".csv (path/to/your/[fileName].csv): ");
                ModuleFilePath = in.nextLine();
                MarkModule[i] = new MarkModule(ModuleFilePath);
                MarkModule[i].importCSV();
                MarkModule[i].displayMark();
                
                System.out.println("-----------Total Mark for Module " + (i + 1) + "-------------");
                //formula ((totalmark/100 * creaditModule)/totalCreadit) : Total Creadit is sum of creaditModule
                Mark[i] = new Calculate(MarkModule[i],TotalCreaditUnit, ModuleFilePath, setPersentage[i]);
                Mark[i].displayGpa();
            }
            
            System.out.println("Would U Like to Print Report? (Y/N) : ");
            printReport = in.nextLine();

            if(printReport.equalsIgnoreCase("Y")){
                Report[] generateReport = new Report[moduleCount];
                System.out.println("Please Enter a file path (path/to/your/[fileName].csv) : ");
                filePath = in.nextLine();
                for(int i = 0; i < moduleCount; i++){
                    generateReport[i] = new Report(studentInfo, setPersentage[i], Mark[i]);
                    System.out.println();
                    generateReport[i].displayReport();
                    generateReport[i].generateCSVReport(filePath);
                }
            }

        }
    }
}
=======
package Phase2;

import java.util.Scanner;

import Phase2.Course.*;//Course Module
import Phase2.Report.Calculate;
import Phase2.Report.Report;
import Phase2.User.*;

public class Main {
    public static void main(String[] args) {
        // TODO : DEBUG,JUST MAKE 1 module
        final int moduleCount = 1;
        String[] moduleName;
        String username, password, StudentFilePath, ModuleFilePath,printReport,filePath;
        String[] holdText;
        int[] quiz, assignment, test, CreaditUnit;
        double TotalCreaditUnit = 0;
        boolean[] hasFinalExam;
        Scanner in = new Scanner(System.in);

        // Assign to quantity module
        moduleName = new String[moduleCount];
        holdText = new String[moduleCount];
        quiz = new int[moduleCount];
        assignment = new int[moduleCount];
        test = new int[moduleCount];
        CreaditUnit = new int[moduleCount];
        hasFinalExam = new boolean[moduleCount];

        // User Enter username and passoword
        System.out.print("Enter Username: ");
        username = in.nextLine();
        System.out.print("Enter Password: ");
        password = in.nextLine();

        Admin Auth = new Admin("", "", username, password);

        if (Auth.check()) {

            for (int i = 0; i < moduleCount; i++) {
                System.out.print("Enter Name Module: ");
                moduleName[i] = in.nextLine();
                System.out.print("It has a Final Exam? (Y/N): ");
                holdText[i] = in.nextLine();
                System.out.print("Enter a Creadit Unit: ");
                CreaditUnit[i] = in.nextInt();
                System.out.print("Enter Quantity Quiz: ");
                quiz[i] = in.nextInt();
                System.out.print("Enter Quantity Assignment: ");
                assignment[i] = in.nextInt();
                System.out.print("Enter Quantity Test: ");
                test[i] = in.nextInt();
                in.nextLine();

                TotalCreaditUnit += CreaditUnit[i];

                if (holdText[i].equalsIgnoreCase("Y")) {
                    hasFinalExam[i] = true;
                } else {
                    hasFinalExam[i] = false;
                }
                System.out.println(" ");
            }
            AssignPercentage[] setPersentage = new AssignPercentage[moduleCount];

            // TODO : MAKE A SPECIFIC TASK FOR EACH MODULE
            // User Assign Percentage of Assignment
            for (int i = 0; i < moduleCount; i++) {
                setPersentage[i] = new AssignPercentage(moduleName[i], quiz[i], assignment[i], test[i], hasFinalExam[i],
                        CreaditUnit[i]);
                setPersentage[i].displayAssignmentList();
                setPersentage[i].getPercentage();

                // check if percentage is over 100 or below
                while (!setPersentage[i].checkPercentage()) {
                    setPersentage[i].getPercentage();
                }
                setPersentage[i].displayPercentage();

                System.out.println(" ");
            }

            // import file name student and id
            // Value in File : STUDENTID , STUDENT NAME
            System.out.println("Please enter the file location of StudentList.csv : ");
            StudentFilePath = in.nextLine();
            Student studentInfo = new Student(StudentFilePath);
            studentInfo.importCSV();
            studentInfo.displayStudent();

            System.out.println("Total of Student : " + studentInfo.getStudentCount());
            System.out.println(TotalCreaditUnit);
            System.out.println();

            // Import Mark for each module
            MarkModule[] MarkModule = new MarkModule[moduleCount];
            Calculate[] Mark = new Calculate[moduleCount];
            for (int i = 0; i < moduleCount; i++) {
                // Value in File : STUDENTID , QUIZ 1, QUIZ 2, Assignment 1, Assignment 2, Tes 1, Test 2, Final Exam
                System.out.println("Please enter the file location of MarkModule" + (i + 1) + ".csv : ");
                ModuleFilePath = in.nextLine();
                MarkModule[i] = new MarkModule(ModuleFilePath);
                MarkModule[i].importCSV();
                MarkModule[i].displayMark();
                
                System.out.println("-----------Total Mark for Module " + (i + 1) + "-------------");
                //formula ((totalmark/100 * creaditModule)/totalCreadit) : Total Creadit is sum of creaditModule
                Mark[i] = new Calculate(MarkModule[i],TotalCreaditUnit, ModuleFilePath, setPersentage[i]);
                Mark[i].displayGpa();
            }
            
            System.out.println("Would U Like to Print Report? (Y/N) : ");
            printReport = in.nextLine();

            if(printReport.equalsIgnoreCase("Y")){
                Report[] generateReport = new Report[moduleCount];
                System.out.println("Please Enter a file path (path/to/your/[fileName].csv) : ");
                filePath = in.nextLine();
                for(int i = 0; i < moduleCount; i++){
                    generateReport[i] = new Report(studentInfo, setPersentage[i], Mark[i]);
                    System.out.println();
                    generateReport[i].displayReport();
                    generateReport[i].generateCSVReport(filePath);
                }
            }

        }
    }
}
>>>>>>> eabd7a4b3666590e419c1b6567032a848e5f120f
