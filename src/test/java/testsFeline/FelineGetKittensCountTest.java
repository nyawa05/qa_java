package testsFeline;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensCountTest {
    final int kittensCount;

    public FelineGetKittensCountTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getKittensCount () {
        return new Object[][]{
                {1},
                {0},
                {999},
                {666},
                {-1}
        };
    }

    @Test
    public void felineGetKittens () {
        Feline feline = new Feline();
        assertEquals("Значение котят не совпадает с заданным значением", kittensCount, feline.getKittens(kittensCount));
    }
}
