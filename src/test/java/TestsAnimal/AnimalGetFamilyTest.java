package TestsAnimal;

import com.example.Animal;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnimalGetFamilyTest {
    @Test
    public void getFamilyCheck() {
        Animal animal = new Animal();
        assertEquals("Возвращается неверное значение семейств", "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}
