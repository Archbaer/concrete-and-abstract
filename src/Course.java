abstract class Course {
    // Instance variables
    Subject subject;
    String instructor;
    int fee;
    int assignmentMarks;
    int quizMarks;

    // Constructor
    Course(Subject subject, String instructor, int fee) {
        this.subject = subject;
        this.instructor = instructor;
        this.fee = fee;
        this.assignmentMarks = 0;
        this.quizMarks = 0;
    }

    // ToString method for better output
    @Override
    public String toString() {
        return "Subject: " + subject.title + ", Instructor: " + instructor + ", Fee: " + fee;
    }
}