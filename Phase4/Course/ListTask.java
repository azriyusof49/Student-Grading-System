package Course;

public class ListTask extends Course{

    private int Quiz, CreaditUnit,Assignment, Test, FinalExam;

    public ListTask(String courseName, int CreaditUnit, int Quiz, int Assignment, int Test, int FinalExam) {
        super(courseName);
        this.CreaditUnit = CreaditUnit;
        this.Quiz = Quiz;
        this.Assignment = Assignment;
        this.Test = Test;
        this.FinalExam = FinalExam;
    }

    public int getCreaditUnit(){
        return CreaditUnit;
    }

    public int getQuiz() {
        return Quiz;
    }

    public int getAssignment() {
        return Assignment;
    }

    public int getTest() {
        return Test;
    }

    public int getFinalExam() {
        return FinalExam;
    }
    
}
