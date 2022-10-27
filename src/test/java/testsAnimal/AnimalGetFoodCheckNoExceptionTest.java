package testsAnimal;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalGetFoodCheckNoExceptionTest {
    final String animalKind;
    final String result;

    public AnimalGetFoodCheckNoExceptionTest(String animalKind, String result) {
        this.animalKind = animalKind;
        this.result = result;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getAnimalData() {
        return new Object[][]{
                {"Травоядное", "Трава, Различные растения"},
                {"Хищник", "Животные, Птицы, Рыба"},
        };
    }

    @Test
    public void checkGetFood() throws Exception {
        String actual;
        Animal animal = new Animal();
        actual = String.join(", ", animal.getFood(animalKind));
        assertEquals("Возвразается неверное значение еды", result, actual);
    }
}
