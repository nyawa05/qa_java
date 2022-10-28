package testslion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionConstructorCheckNoExceptionTest {
    final String sex;
    final boolean result;

    @Mock
    Feline feline;

    public LionConstructorCheckNoExceptionTest(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getLionsData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void shouldNotBeException() throws Exception {
        Lion lion = new Lion(sex,feline);
        boolean actual = lion.doesHaveMane();
        assertEquals("Возвращается неверное значение", result, actual);
    }
}
