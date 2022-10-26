package TestsAnimal;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalCheckExceptionGetFoodTest {
    final String animalKind;
    final String result;

    public AnimalCheckExceptionGetFoodTest(String animalKind, String result) {
        this.animalKind = animalKind;
        this.result = result;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getAnimalData() {
        return new Object[][]{
                {"Травоядное", "Трава, Различные растения"},
                {"Хищник", "Животные, Птицы, Рыба"},
                {"Всеядное", "Ошибка ввода типа животного"}
        };
    }

    @Test
    public void checkGetFood() {
        String actual;
        try {
            Animal animal = new Animal();
            actual = String.join(", ", animal.getFood(animalKind));
        }
        catch (Exception e){
            actual = "Ошибка ввода типа животного";
        }
        assertEquals("Возвразается неверное значение еды", result, actual);
    }
}
