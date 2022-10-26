package TestsLion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensTest {

    @Mock // создали мок
    Feline feline;

    @Test
    public void lionGetKittens() throws Exception { // сам тест
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(500);
        assertEquals(500, lion.getKittens());
    }
}