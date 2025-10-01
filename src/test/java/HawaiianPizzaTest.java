import org.example.HawaiianPizzaBuilder;
import org.example.PizzaBuilder;
import org.junit.jupiter.api.Test;
import org.example.Pizza;
import static org.junit.jupiter.api.Assertions.*;

public class HawaiianPizzaTest {

    @Test
    public void testHawaiianPizza(){
        PizzaBuilder builder = new HawaiianPizzaBuilder();
        Pizza pizza = builder
                .setSize("Medium")
                .setDough("Thin")
                .addTopping("Ham")
                .addTopping("Tomato")
                .addTopping("Cheese")
                .addTopping("Pineapple")
                .build();

        assertEquals("Medium", pizza.getSize());
        assertEquals("Thin", pizza.getDough());
        assertTrue(pizza.getToppings().contains("Ham"));
        assertTrue(pizza.getToppings().contains("Tomato"));
        assertTrue(pizza.getToppings().contains("Cheese"));
        assertTrue(pizza.getToppings().contains("Pineapple"));
        }
    }

