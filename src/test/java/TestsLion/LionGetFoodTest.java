package TestsLion;

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
public class LionGetFoodTest {

    @Mock // создали мок
    Feline feline;

    @Test
    public void lionGetFood() throws Exception { // сам тест
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Еда"));
        assertEquals(List.of("Еда"), lion.getFood());
    }

}