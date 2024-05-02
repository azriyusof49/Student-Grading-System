package Phase2;

import java.util.Scanner;

import Phase2.Course.*;//Course Module
import Phase2.User.*;

public class Main {
    public static void main(String[] args) {
        final int moduleCount = 1;
        String[] moduleName;
        String username, password,filePath;
        String[] holdText;
        int[] quiz, assignment, test;
        boolean[] hasFinalExam;
        Scanner in = new Scanner(System.in);

        // Assign to quantity module
        moduleName = new String[moduleCount];
        holdText = new String[moduleCount];
        quiz = new int[moduleCount];
        assignment = new int[moduleCount];
        test = new int[moduleCount];
        hasFinalExam = new boolean[moduleCount];

        // User Enter username and passoword
        System.out.print("Enter Username: ");
        username = in.nextLine();
        System.out.print("Enter Password: ");
        password = in.nextLine();

        Admin Auth = new Admin("Aiman","Hakim",username, password);

        if (Auth.check()) {
            
            for (int i = 0; i < moduleCount; i++) {
                System.out.print("Enter Name Module: ");
                moduleName[i] = in.nextLine();
                System.out.print("It has a Final Exam? (Y/N): ");
                holdText[i] = in.nextLine();
                System.out.print("Enter Quantity Quiz: ");
                quiz[i] = in.nextInt();
                System.out.print("Enter Quantity Assignment: ");
                assignment[i] = in.nextInt();
                System.out.print("Enter Quantity Test: ");
                test[i] = in.nextInt();
                in.nextLine();

                if (holdText[i].equalsIgnoreCase("Y")) {
                    hasFinalExam[i] = true;
                } else {
                    hasFinalExam[i] = false;
                }
                System.out.println(" ");
            }
            AssignPercentage[] modules = new AssignPercentage[moduleCount];
            // User Assign Percentage of Assignment
            for (int i = 0; i < moduleCount; i++) {
                modules[i] = new AssignPercentage(moduleName[i], quiz[i], assignment[i], test[i], hasFinalExam[i]);
                modules[i].displayAssignmentList();
                modules[i].getPercentage();

                //check if percentage is over 100 or below
                while (!modules[i].checkPercentage()) {
                    modules[i].getPercentage();
                }
                modules[i].displayPercentage();

                System.out.println(" ");
            }

            //importing file
            System.out.print("Please enter the file location of Student List: ");
            filePath = in.nextLine();
            Student studentInfo = new Student(filePath);
            studentInfo.importCSV();
            studentInfo.displayStudent();

            System.out.println("Total of Student : " + studentInfo.getStudentCount());
            
            
        }
    }
}
