package Phase2.Course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MarkModule extends QuantityTask {
    private String filePath;
    private double[] totalMark;
    private List<Double> quiz1 = new ArrayList<>();
    private List<Double> quiz2 = new ArrayList<>();
    private List<Double> assignment1 = new ArrayList<>();
    private List<Double> assignment2 = new ArrayList<>();
    private List<Double> test1 = new ArrayList<>();
    private List<Double> test2 = new ArrayList<>();
    private List<Double> finalexam = new ArrayList<>();
    private List<String> studentId = new ArrayList<>();

    public MarkModule(){
        
    }

    public MarkModule(String filePath) {
        this.filePath = filePath;
    }


    public void importCSV() {
        String line = "";
        try (BufferedReader moduleFile = new BufferedReader(new FileReader(this.filePath))) {
            while ((line = moduleFile.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 8) {
                    studentId.add(values[0]);
                    quiz1.add(Double.parseDouble(values[1]));
                    quiz2.add(Double.parseDouble(values[2]));
                    assignment1.add(Double.parseDouble(values[3]));
                    assignment2.add(Double.parseDouble(values[4]));
                    test1.add(Double.parseDouble(values[5]));
                    test2.add(Double.parseDouble(values[6]));
                    finalexam.add(Double.parseDouble(values[7]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayMark() {
        System.out.println("Importing Mark......\n");
        int numberOfStudents = studentId.size();
        double[] Mark = calculateTotalMark();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((i + 1) + ".");
            System.out.println("Student ID: " + studentId.get(i));
            System.out.println("Quiz 1: " + quiz1.get(i));
            System.out.println("Quiz 2: " + quiz2.get(i));
            System.out.println("Assignment 1: " + assignment1.get(i));
            System.out.println("Assignment 2: " + assignment2.get(i));
            System.out.println("Test 1: " + test1.get(i));
            System.out.println("Test 2: " + test2.get(i));
            System.out.println("Final Exam: " + finalexam.get(i));
           // System.out.println("Total Mark: " + Mark[i] + "%");
            System.out.println();
        }
    }
    

    public double[] calculateTotalMark() {
        totalMark = new double[studentId.size()];
        int numberOfStudents = studentId.size();
        for (int i = 0; i < numberOfStudents; i++) {
            double rowTotal = quiz1.get(i) + quiz2.get(i) + assignment1.get(i) + assignment2.get(i) +
                    test1.get(i) + test2.get(i) + finalexam.get(i);
            totalMark[i] += rowTotal;
        }
        return totalMark;
    }

    public List<Double> getQuiz1() {
        return quiz1;
    }

    public List<Double> getQuiz2() {
        return quiz2;
    }

    public List<Double> getAssignment1() {
        return assignment1;
    }

    public List<Double> getAssignment2() {
        return assignment2;
    }

    public List<Double> getTest1() {
        return test1;
    }

    public List<Double> getTest2() {
        return test2;
    }

    public List<Double> getFinalexam() {
        return finalexam;
    }

    public List<String> getStudentId() {
        return studentId;
    }
}
