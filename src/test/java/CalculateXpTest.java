import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateXpTest {
    @Test
    void validateCalculateXP(){
        Course newCourse = new Course();
        newCourse.setDuration(10);

        Assertions.assertEquals(100, newCourse.calculateXP());

    }
}
