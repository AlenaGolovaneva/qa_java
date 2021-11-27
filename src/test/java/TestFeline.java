import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    final List<String> EXPECT_FOR_EAT_MEAT = List.of("Животные", "Птицы", "Рыба");
    final int EXPECT_FOR_GET_KITTTENS_WITH_ARGUMENT = 2;
    final int EXPECT_FOR_GET_KITTTENS_WITH_OUT_ARGUMENT = 1;
    final String EXPECT_FOR_GET_FAMILY = "Кошачьи";

    @Test
    public void getFamilySuccesses(){
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals(EXPECT_FOR_GET_FAMILY, actual);
    }

    @Test
    public void getKittensWithOutArgumentSuccesses(){
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(EXPECT_FOR_GET_KITTTENS_WITH_OUT_ARGUMENT, actual);
    }

    @Test
    public void getKittensWithArgumentSuccesses(){
        Feline feline = new Feline();
        int actual = feline.getKittens(EXPECT_FOR_GET_KITTTENS_WITH_ARGUMENT);
        assertEquals(EXPECT_FOR_GET_KITTTENS_WITH_ARGUMENT, actual);
    }

    @Test
    public void eatMeatSuccesses() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        assertEquals(EXPECT_FOR_EAT_MEAT, actual);
    }
}
