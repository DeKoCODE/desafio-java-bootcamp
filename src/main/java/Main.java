import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course courseOne = new Course();
        courseOne.setTitle("Java for Begginers");
        courseOne.setDescription("Initial aproach with Java programming.");
        courseOne.setDuration(40);

        Course courseTwo = new Course();
        courseTwo.setTitle("JavaScript for WEB");
        courseTwo.setDescription("Lear JavaScript to develop web applications.");
        courseTwo.setDuration(25);

        Mentoring mentoringOne = new Mentoring();
        mentoringOne.setTitle("How to get more hard skills!");
        mentoringOne.setDescription("Get help to create your path in software development!");
        mentoringOne.setDate(LocalDate.of(2023,3,19));

        System.out.println(courseOne);
        System.out.println(courseTwo);
        System.out.println(mentoringOne);
    }
}
