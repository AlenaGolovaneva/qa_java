import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestSuccessLion {

    final String SEX = "Самка";

    @Mock
    Feline feline;

    @Test
    public void getKittensSuccess() throws Exception {
        Lion lion = new Lion(SEX, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        assertEquals(1, actual);
    }

    @Test
    public void getFoodSuccess() throws Exception {
        Lion lion = new Lion(SEX, feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");

    }
}
