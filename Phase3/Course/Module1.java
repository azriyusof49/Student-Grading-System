package Course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1 extends ListTask{
    private int quiz[] = new int[super.getQuiz()];
    private int Assignment[] = new int[super.getAssignment()];
    private int Test[] = new int[super.getTest()];
    private int FinalExam[] = new int[super.getFinalExam()];
    private List<Double> studentTotalMarks = new ArrayList<>();

    // Constructor
    public Module1(String courseName, int CreaditUnit, int Quiz, int Assignment, int Test, int FinalExam) {
        super(courseName, CreaditUnit, Quiz, Assignment, Test, FinalExam);
        
    }
    // Getter for student total marks
    public List<Double> getStudentTotalMark() {
        return studentTotalMarks;
    }

    public int[] getQuizPercentage() {
        return quiz;
    }

    public int[] getAssignmentPercentage() {
        return Assignment;
    }

    public int[] getTestPercentage() {
        return Test;
    }

    public int[] getFinalExamPercentage() {
        return FinalExam;
    }

    // Method to assign percentage for each task
    @Override
    public void assignPercentage() {
        int TotalPercentage;
        Scanner in = new Scanner(System.in);
        System.out.printf("------ Percentage For %s ---------", super.getCourseName());
        System.out.println("\nEnter A Percentage of each Task in (make sure it 100%)");
        while (true) {
            TotalPercentage = 0;
            for (int i = 0; i < quiz.length; i++) {
                System.out.print("Quiz " + (i + 1) + ": ");
                quiz[i] = in.nextInt();
                TotalPercentage += quiz[i];
            }
            for (int i = 0; i < Assignment.length; i++) {
                System.out.print("Assignment " + (i + 1) + ": ");
                Assignment[i] = in.nextInt();
                TotalPercentage += Assignment[i];
            }
            for (int i = 0; i < Test.length; i++) {
                System.out.print("Test " + (i + 1) + ": ");
                Test[i] = in.nextInt();
                TotalPercentage += Test[i];
            }
            for (int i = 0; i < FinalExam.length; i++) {
                System.out.print("Final Exam " + (i + 1) + ": ");
                FinalExam[i] = in.nextInt();
                TotalPercentage += FinalExam[i];
            }

            in.nextLine(); // Clear the buffer

            if (TotalPercentage == 100) {
                break;
            } else {
                System.out.printf("Total Percentage %d | The total percentage must equal 100. Please try again.\n",
                        TotalPercentage);
            }
        }
        System.out.println("Percentage has assign!");
    }

    // Method to get total marks for each student from a file
    @Override
    public void getTotalMark(String filePath) {
        int totalAssessment = super.getTest() + super.getAssignment() + super.getQuiz() + super.getFinalExam();
        String line = "";
        double totalMark;
        try (BufferedReader moduleFile = new BufferedReader(new FileReader(filePath))) {
            while ((line = moduleFile.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= totalAssessment + 1) { // +1 for student ID
                    int countLine = 1; // Assuming the first column is student ID
                    totalMark = 0;

                    for (int i = 0; i < quiz.length; i++) {
                        double mark = Double.parseDouble(values[countLine]);
                        totalMark += (mark / 100.0) * getQuizPercentage()[i];
                        countLine++;
                    }

                    for (int i = 0; i < Assignment.length; i++) {
                        double mark = Double.parseDouble(values[countLine]);
                        totalMark += (mark / 100.0) * getAssignmentPercentage()[i];
                        countLine++;
                    }

                    for (int i = 0; i < Test.length; i++) {
                        double mark = Double.parseDouble(values[countLine]);
                        totalMark += (mark / 100.0) * getTestPercentage()[i];
                        countLine++;
                    }

                    for (int i = 0; i < FinalExam.length; i++) {
                        double mark = Double.parseDouble(values[countLine]);
                        totalMark += (mark / 100.0) * getFinalExamPercentage()[i];
                        countLine++;
                    }
                    studentTotalMarks.add(totalMark); // Add total mark for this line
                } else {
                    System.out.println("File does not meet the requirements.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
