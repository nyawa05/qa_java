package TestsLion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionCheckExceptionTest {
    final String sex;
    final String result;

    @Mock
    Feline feline;

    public LionCheckExceptionTest(String sex, String result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getLionsData() {
        return new Object[][]{
                {"Самец", "true"},
                {"Самка", "false"},
                {"М", "Ошибка ввода пола"}
        };
    }

    @Test
    public void shouldBeException() {

        String actual;
        try {
        Lion lion = new Lion(sex,feline);
        actual = Boolean.toString(lion.doesHaveMane());
        }
        catch (Exception e)
        {actual = "Ошибка ввода пола"; }
        assertEquals("Значение " + result + " и значение " + actual + " совпадают?", result, actual);
    }
}