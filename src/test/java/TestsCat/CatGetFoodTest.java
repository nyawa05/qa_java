package TestsCat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatGetFoodTest {

    @Mock
    Feline feline;

    @Test
    public void felineGetFood() throws Exception { // сам тест
        Cat cat = new Cat(feline);
        assertEquals("Возвращается неверный список еды хищников", List.of(), cat.getFood());
    }
}
