package testsAnimal;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class AnimalGetFoodCheckExceptionTest {
    final String animalKind;

    public AnimalGetFoodCheckExceptionTest(String animalKind) {
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getAnimalData() {
        return new Object[][]{
                {"Трава"},
                {"Хишник"},
                {"Всеядное"},
                {"Animal"}
        };
    }

    @Test
    public void checkGetFoodException() {
        Animal animal = new Animal();
        Throwable exception = assertThrows(Exception.class, () -> {
            animal.getFood(animalKind);
        });
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}
