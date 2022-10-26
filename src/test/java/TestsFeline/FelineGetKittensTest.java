package TestsFeline;

import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineGetKittensTest {

    @Test
    public void FelineGetKittens () {
        Feline feline = new Feline();
        assertEquals("Возвращается неверное значение количества котят", 1, feline.getKittens());
    }

}
