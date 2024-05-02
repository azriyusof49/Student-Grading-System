package Phase2.Course;

import java.util.Scanner;

public class AssignPercentage extends QuantityTask {
    private int quizCount = super.getNumQuiz();
    private int AssignCount = super.getNumAssignment();
    private int TestCount = super.getNumTest(); // Assuming super.getQuiz() returns the number of quizzes
    private int quiz[] = new int[quizCount];
    private int Assignment[] = new int[AssignCount];
    private int Test[] = new int[TestCount];
    private int FinalExam, totalPercentage;
    private boolean hasFinalExam;

    public AssignPercentage(String CourseName, int Quiz, int Assignment, int Test, boolean hasFinalExam) {
        super(CourseName, Quiz, Assignment, Test);
        this.hasFinalExam = hasFinalExam;

    }

    // Method
    public void getPercentage() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter A Percentage of each Task in (make sure it 100%)");
        for (int i = 0; i < quizCount; i++) {
            System.out.print("Quiz " + (i + 1) + ": ");
            this.quiz[i] = in.nextInt();
        }
        for (int i = 0; i < AssignCount; i++) {
            System.out.print("Assignment " + (i + 1) + ": ");
            this.Assignment[i] = in.nextInt();
        }
        for (int i = 0; i < TestCount; i++) {
            System.out.print("Test " + (i + 1) + ": ");
            this.Test[i] = in.nextInt();
        }
        if (hasFinalExam) {
            System.out.print("Final Exam : ");
            this.FinalExam = in.nextInt();
        }
    }

    public boolean checkPercentage() {
        this.totalPercentage = 0;//reset to zero when incorrect
        for (int i = 0; i < quizCount; i++) {
            this.totalPercentage += this.quiz[i];
        }
        for (int i = 0; i < AssignCount; i++) {
            this.totalPercentage += this.Assignment[i];
        }
        for (int i = 0; i < TestCount; i++) {
            this.totalPercentage += this.Test[i];
        }
        this.totalPercentage += this.FinalExam;
        if (this.totalPercentage == 100) {
            return true;
        }
        System.out.println("Please Make it 100%!");
        return false;
    }

    public void displayPercentage() {
        System.out.println("\nA Percentage of each Task");
        for (int i = 0; i < quizCount; i++) {
            System.out.println("Quiz " + (i + 1) + ": " + this.quiz[i] + "%");
        }
        for (int i = 0; i < AssignCount; i++) {
            System.out.println("Assignment " + (i + 1) + ": " + this.Assignment[i] + "%");
        }
        for (int i = 0; i < TestCount; i++) {
            System.out.println("Test " + (i + 1) + ": " + this.Test[i] + "%");
        }
        if (hasFinalExam) {
            System.out.println("Final Exam : " + this.FinalExam + "%");
        }

    }

    public void displayAssignmentList() {
        super.displayCourseName();
        System.out.println("List Assignment");
        System.out.println("Quiz : " + super.getNumQuiz());
        System.out.println("Test : " + super.getNumTest());
        System.out.println("Assignment : " + super.getNumAssignment());
    }

    // Getter
    public int[] getQuiz() {
        return this.quiz;
    }

    public int[] getAssignment() {
        return this.Assignment;
    }

    public int[] getTest() {
        return this.Test;
    }

    public int getFinalExam() {
        return this.FinalExam;
    }
}
