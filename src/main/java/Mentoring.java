import java.time.LocalDate;

public class Mentoring extends Content{
    private String title;
    private String description;
    private LocalDate date;

    @Override
    public double calculateXP() {
        return standardXP + 20d;
    }

    public Mentoring() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
