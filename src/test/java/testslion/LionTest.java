package testslion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock // создали мок
    Feline feline;

    @Test
    public void lionGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(500);
        assertEquals("Возвращается неверное значение количества котят", 500, lion.getKittens());
    }

    @Test
    public void lionGetFood() throws Exception {
        List<String> listOfFood = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(listOfFood);
        assertEquals("Возвращается неверный список еды хищников", listOfFood, lion.getFood());
    }
}