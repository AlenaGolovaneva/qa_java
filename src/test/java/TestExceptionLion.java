import com.example.Lion;
import static org.junit.Assert.assertTrue;
import com.example.Feline;
import org.junit.Test;

public class TestExceptionLion {

    @Test
    public void exceptionLionDoesHaveMane() throws Exception {
        try {
            Feline feline = new Feline();
            Lion lion = new Lion("Exception", feline);
            lion.doesHaveMane();
        } catch (Exception exception) {
            assertTrue(exception.getMessage().equals("Используйте допустимые значения пола животного - самей или самка"));
        }
    }
}
