
import org.example.VegetarianPizzaBuilder;
import org.example.PizzaBuilder;
import org.junit.jupiter.api.Test;
import org.example.Pizza;
import static org.junit.jupiter.api.Assertions.*;

public class VegetarianPizzaTest {

    @Test
    public void testVegetarianPizza(){
        PizzaBuilder builder = new VegetarianPizzaBuilder();
        Pizza pizza = builder
                .setSize("Large")
                .setDough("Thick")
                .addTopping("Tomato")
                .addTopping("Cheese")
                .addTopping("Mushrooms")
                .addTopping("Pepper")
                .build();

        assertEquals("Large", pizza.getSize());
        assertEquals("Thick", pizza.getDough());
        assertTrue(pizza.getToppings().contains("Tomato"));
        assertTrue(pizza.getToppings().contains("Cheese"));
        assertTrue(pizza.getToppings().contains("Mushrooms"));
        assertTrue(pizza.getToppings().contains("Pepper"));
    }
}
