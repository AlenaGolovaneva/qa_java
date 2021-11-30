import com.example.Feline;
import com.example.Lion;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    final String SEX = "Самка";
    final int EXPECT_KITTENS_ONE = 1;
    final String EXPECT_PREDATOR = "Хищник";

    @Mock
    Feline feline;

    @Test
    public void getKittensOne() throws Exception {
        Lion lion = new Lion(SEX, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        assertEquals(EXPECT_KITTENS_ONE, actual);
    }

    @Test
    public void getFoodPredator() throws Exception {
        Lion lion = new Lion(SEX, feline);
        lion.getFood();
        Mockito.verify(feline).getFood(EXPECT_PREDATOR);

    }
}
