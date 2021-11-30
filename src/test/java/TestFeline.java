import com.example.Feline;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFeline {

    final List<String> EXPECT_LIST_OF_FOOD = List.of("Животные", "Птицы", "Рыба");
    final int EXPECT_KITTENS_TWO = 2;
    final int EXPECT_KITTENS_ONE = 1;
    final String EXPECT_FAMILY_FELINE = "Кошачьи";

    @Test
    public void getFamilyFeline(){
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals(EXPECT_FAMILY_FELINE, actual);
    }

    @Test
    public void getKittensOne(){
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(EXPECT_KITTENS_ONE, actual);
    }

    @Test
    public void getKittensTwoCountTwoCount(){
        Feline feline = new Feline();
        int actual = feline.getKittens(EXPECT_KITTENS_TWO);
        assertEquals(EXPECT_KITTENS_TWO, actual);
    }

    @Test
    public void eatMeatListOfFood() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        assertEquals(EXPECT_LIST_OF_FOOD, actual);
    }
}
