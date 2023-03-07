import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Developer {

    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    protected Set<Content> completedContent = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContent());
        bootcamp.getSubscribedDevelopers().add(this);
    }

    public void progress(){
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if (content.isPresent()){
            this.completedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        } else {
            System.err.println("Voc6e não está matriculado em nenhum conteúdo!");
        }
    }

    public double calculateTotalXp(){
        return this.completedContent
                .stream()
                .mapToDouble(content -> content.calculateXP())
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }

    public void setCompletedContent(Set<Content> completedContent) {
        this.completedContent = completedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return name.equals(developer.name) && subscribedContent.equals(developer.subscribedContent) && completedContent.equals(developer.completedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, completedContent);
    }
}
