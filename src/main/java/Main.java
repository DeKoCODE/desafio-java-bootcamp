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


        /*System.out.println(courseOne);
        System.out.println(courseTwo);
        System.out.println(mentoringOne);*/

        Bootcamp bootcampJavaDio = new Bootcamp();
        bootcampJavaDio.setName("Java Bootcamp DIO");
        bootcampJavaDio.setDescription("Lear Java coding with us!");
        bootcampJavaDio.getContent().add(courseOne);
        bootcampJavaDio.getContent().add(courseTwo);
        bootcampJavaDio.getContent().add(mentoringOne);

        Developer developerDenison = new Developer();
        developerDenison.setName("Denison");
        developerDenison.subscribeBootcamp(bootcampJavaDio);
        System.out.println("Subscribed content Denison: " + developerDenison.getSubscribedContent());
        developerDenison.progress();
        System.out.println("---------");
        developerDenison.progress();
        developerDenison.progress();
        System.out.println("Subscribed content Denison: " + developerDenison.getSubscribedContent());
        System.out.println("Completed content Denison: " + developerDenison.getCompletedContent());
        System.out.println("XP: " + developerDenison.calculateTotalXp());

        Developer developerAmanda = new Developer();
        developerAmanda.setName("Amanda");
        developerAmanda.subscribeBootcamp(bootcampJavaDio);
        System.out.println("Subscribed content Amanda: " + developerAmanda.getSubscribedContent());
        developerAmanda.progress();
        System.out.println("---------");
        System.out.println("Subscribed content Amanda: " + developerAmanda.getSubscribedContent());
        System.out.println("Completed content Amanda: " + developerAmanda.getCompletedContent());
        System.out.println("XP: " + developerAmanda.calculateTotalXp());



    }
}
