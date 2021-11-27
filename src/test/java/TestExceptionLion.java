import com.example.Lion;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

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
