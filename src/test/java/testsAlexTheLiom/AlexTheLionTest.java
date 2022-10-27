package testsAlexTheLiom;

import com.example.AlexTheLion;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTheLionTest {

    @Mock
    Feline feline;

    @Test
    public void alexTheLionGetFriends() throws Exception {
        AlexTheLion alex = new AlexTheLion(feline);
        assertEquals("Возвразается неверный список друзей", "Зебра Марти, Бегемотиха Глория, Жираф Мелман", String.join(", ", alex.getFriends()));
    }

    @Test
    public void alexTheCatGetKittens() throws Exception {
        AlexTheLion alex = new AlexTheLion(feline);
        assertEquals("Возвращается неверное значение количества котят", 0, alex.getKittens());
    }

    @Test
    public void alexTheLionGetPlaceOfLiving() throws Exception {
        AlexTheLion alex = new AlexTheLion(feline);
        assertEquals("Возвразается неверный адрес", "Нью-Йоркский зоопарк",  alex.getPlaceOfLiving());
    }
}
