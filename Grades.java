public class Grades {
    int correct;
    int wrong;
    Grades(int correct, int wrong ) {
        this.correct = correct;
        this.wrong = wrong;
    }
    public String toString() {
        return "That wasn't so bad! You got " + this.correct + " correct and " + this.wrong + " wrong for a score of ";
    }
}

