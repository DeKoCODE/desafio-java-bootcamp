public class Course extends Content {

    private int duration;

    @Override
    public double calculateXP() {
        return standardXP * duration;
    }

    public Course() {
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", duration=" + duration +
                '}';
    }
}