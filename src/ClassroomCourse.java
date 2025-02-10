class ClassroomCourse extends Course {
    String school;
    String session;

    // Constructor
    ClassroomCourse(Subject subject, String instructor, int fee, String school, String session) {
        super(subject, instructor, fee);
        this.school = school;
        this.session = session;
    }

    // ToString Method
    @Override
    public String toString() {
        return super.toString() + ", School: " + school + ", Session: " + session;
    }
}