package TestsFeline;

import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineEatMeatTest {

    @Test
    public void felineGetFood() throws Exception { // сам тест
        Feline feline = new Feline();
        assertEquals("Возвращается неверный список еды хищников", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}
