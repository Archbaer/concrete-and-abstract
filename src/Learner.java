public class Learner implements Assessments {
    // Instance variables
    String name;
    Course course;
    double gradeScore;

    // Constructor
    Learner(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    // ToString Method
    @Override
    public String toString() {
        return "Name: " + this.name + " | Course: " + this.course.subject.title;
    }

    // Implementing assignmentScore method
    @Override
    public void assignmentScore(int marks) {
        this.course.assignmentMarks = marks;
    }

    // Fix: Assigning to quizMarks instead of assignmentMarks
    @Override
    public void quizScore(int marks) {
        this.course.quizMarks = marks;
    }

    // Method to calculate gradeScore
    public double calculateGrade() {
        int maxAssignmentMarks, maxQuizMarks;

        if (this.course.subject.title.contains("Online")) {
            maxAssignmentMarks = 30;
            maxQuizMarks = 10;
        } else {
            maxAssignmentMarks = 100;
            maxQuizMarks = 30;
        }

        double assignmentGrade = (double) this.course.assignmentMarks * 10 / maxAssignmentMarks;
        double quizGrade = (double) this.course.quizMarks * 10 / maxQuizMarks;
        this.gradeScore = (assignmentGrade + quizGrade) / 2;
        return this.gradeScore;
    }
}