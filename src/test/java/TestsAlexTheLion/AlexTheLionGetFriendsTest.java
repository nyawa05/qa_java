package TestsAlexTheLion;

import com.example.AlexTheLion;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTheLionGetFriendsTest {

    @Mock
    Feline feline;

    @Test
    public void AlexTheLionGetFriends() throws Exception {
        AlexTheLion alex = new AlexTheLion(feline);
        assertEquals("Возвразается неверный список друзей", "Зебра Марти, Бегемотиха Глория, Жираф Мелман", String.join(", ", alex.getFriends()));
    }
}
