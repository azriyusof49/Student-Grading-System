<<<<<<< HEAD
package Phase2.Course;

public class QuantityTask extends Course {
    private int Quiz, Assignment, Test;

    public QuantityTask() {
    }

    public QuantityTask(String CourseName, int Quiz, int Assignment, int Test) {
        super(CourseName);

        this.Quiz = Quiz;
        this.Assignment = Assignment;
        this.Test = Test;
    }

    public int getNumQuiz() {
        return Quiz;
    }

    public int getNumAssignment() {
        return Assignment;
    }

    public int getNumTest() {
        return Test;
    }
}
=======
package Phase2.Course;

public class QuantityTask extends Course {
    private int Quiz, Assignment, Test;

    public QuantityTask() {
    }

    public QuantityTask(String CourseName, int Quiz, int Assignment, int Test) {
        super(CourseName);

        this.Quiz = Quiz;
        this.Assignment = Assignment;
        this.Test = Test;
    }

    public int getNumQuiz() {
        return Quiz;
    }

    public int getNumAssignment() {
        return Assignment;
    }

    public int getNumTest() {
        return Test;
    }
}
>>>>>>> eabd7a4b3666590e419c1b6567032a848e5f120f
