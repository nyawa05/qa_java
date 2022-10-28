package testslion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionConstructorCheckExceptionTest {
    final String sex;

    @Mock
    Feline feline;

    public LionConstructorCheckExceptionTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getLionsData() {
        return new Object[][]{
                {"М"},
                {"Ж"},
                {"Мальчик"},
                {"Девочка"},
                {"Лев"},
                {"Львица"}
        };
    }

    @Test
    public void shouldBeException() {
        Throwable exception = assertThrows(Exception.class, () -> {
            Lion lion = new Lion(sex, feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());

    }
}