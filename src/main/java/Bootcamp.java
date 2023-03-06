import java.time.LocalDate;

public class Bootcamp {
    private String name;
    private String description;
    private LocalDate initialDate;
    private LocalDate endDate;

    public Bootcamp(String name, String description, LocalDate initialDate, LocalDate endDate) {
        this.name = name;
        this.description = description;
        this.initialDate = initialDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "name='" + name + '\'' +
                ", bootcampDescription='" + description + '\'' +
                ", initialDate=" + initialDate +
                ", endDate=" + endDate +
                '}';
    }
}
