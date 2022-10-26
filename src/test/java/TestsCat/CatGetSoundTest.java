package TestsCat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatGetSoundTest {

    @Mock
    Feline feline;

    @Test
    public void checkCatGetSound () {
        Cat cat = new Cat(feline);
        assertEquals("Возвращается неверное значение издаваемого звука", "Мяу", cat.getSound());
    }
}
