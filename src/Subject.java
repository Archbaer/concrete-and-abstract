class Subject {
    String title;
    double credits;

    // Constructor
    Subject(String title, double credits) {
        this.title = title;
        this.credits = credits;
    }

    // ToString Method
    @Override
    public String toString() {
        return "Title: " + this.title + ", Credits: " + this.credits;
    }
}