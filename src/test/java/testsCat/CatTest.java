package testsCat;

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
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void catGetFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> listOfFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(cat.getFood()).thenReturn(listOfFood);
        assertEquals("Возвращается неверный список еды хищников", listOfFood, cat.getFood());
    }

    @Test
    public void catGetSound() {
        Cat cat = new Cat(feline);
        assertEquals("Возвращается неверное значение издаваемого звука", "Мяу", cat.getSound());
    }
}
