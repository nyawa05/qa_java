package TestsAlexTheLion;

import com.example.AlexTheLion;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTheLionGetPlaceOfLivingTest {

    @Mock
    Feline feline;

    @Test
    public void AlexTheLionGetPlaceOfLiving() throws Exception {
        AlexTheLion alex = new AlexTheLion(feline);
        assertEquals("Возвразается неверный адрес", "Нью-Йоркский зоопарк",  alex.getPlaceOfLiving());
    }
}
