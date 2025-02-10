class OnlineCourse extends Course {
    String videoLessons;
    int weeks;

    // Constructor
    OnlineCourse(Subject subject, String instructor, int fee, String videoLessons, int weeks) {
        super(subject, instructor, fee);
        this.videoLessons = videoLessons;
        this.weeks = weeks;
    }

    // ToString Method
    @Override
    public String toString() {
        return super.toString() + ", Video Lessons: " + videoLessons + ", Weeks: " + weeks;
    }
}