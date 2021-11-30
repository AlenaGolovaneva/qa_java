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
public class TestCat {

    final List<String> EXPECT_LIST_OF_FOOD = List.of("Животные", "Птицы", "Рыба");
    final String EXPECT_SOUND_MEOW = "Мяу";

    @Mock
    Feline feline;

    @Test
    public void getSoundMeow(){
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertEquals(EXPECT_SOUND_MEOW, actual);
    }

    @Test
    public void getFoodListOfFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(EXPECT_LIST_OF_FOOD);
        List<String> actual = cat.getFood();
        assertEquals(EXPECT_LIST_OF_FOOD, actual);
    }

}
