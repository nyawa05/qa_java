package testsFeline;

import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void felineGetFood() throws Exception { // сам тест
        Feline feline = new Feline();
        assertEquals("Возвращается неверный список еды хищников", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void felineGetFamily() {
        Feline feline = new Feline();
        assertEquals("Возвращается неверное значение семейства", "Кошачьи", feline.getFamily());
    }

    @Test
    public void felineGetKittens () {
        Feline feline = new Feline();
        assertEquals("Возвращается неверное значение количества котят", 1, feline.getKittens());
    }
}
