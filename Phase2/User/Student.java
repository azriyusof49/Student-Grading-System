package Phase2.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<String> studentIDs;
    private List<String> studentNames;
    private String filePath;
    private int StudentCount;

    public Student(){
    }
    
    public Student(String filePath) {
        this.filePath = filePath;
        studentIDs = new ArrayList<>();
        studentNames = new ArrayList<>();
    }

    public List<String> getStudentIDs() {
        return studentIDs;
    }

    public List<String> getStudentNames() {
        return studentNames;
    }

    public int getStudentCount(){
        return this.StudentCount;
    }

    public void importCSV() {
        String line = "";
        try (BufferedReader studentFile = new BufferedReader(new FileReader(this.filePath))) {
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
    }

    public void displayStudent() {
        this.StudentCount = 0;
        System.out.println("Importing List Student.....");
        for (int i = 0; i < studentIDs.size(); i++) {
            System.out.println((i+1) +".");
            System.out.println("Student ID: " + studentIDs.get(i));
            System.out.println("Name: " + studentNames.get(i));
            System.out.println();
            this.StudentCount++;
        }
    }
}
