import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class TestSuccessesCat {

    final List<String> EXPECT_FOR_GET_FOOD = List.of("Животные", "Птицы", "Рыба");
    final String EXPECT_FOR_GET_SOUND = "Мяу";

    @Mock
    Feline feline;

    @Test
    public void getSoundSuccesses(){
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertEquals(EXPECT_FOR_GET_SOUND, actual);
    }

    @Test
    public void getFoodSuccesses() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(EXPECT_FOR_GET_FOOD);
        List<String> actual = cat.getFood();
        assertEquals(EXPECT_FOR_GET_FOOD, actual);
    }

}
