package TestsAlexTheLion;

import com.example.AlexTheLion;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTheLionGetKittensTest {

    @Mock
    Feline feline;

    @Test
    public void AlexTheCatGetKittens() throws Exception {
        AlexTheLion alex = new AlexTheLion(feline);
        assertEquals("Возвращается неверное значение количества котят", 0, alex.getKittens());
    }
}
