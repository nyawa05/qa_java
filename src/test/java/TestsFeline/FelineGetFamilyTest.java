package TestsFeline;

import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineGetFamilyTest {

    @Test
    public void FelineGetKittens () {
        Feline feline = new Feline();
        assertEquals("Возвращается неверное значение семейства", "Кошачьи", feline.getFamily());
    }
}
