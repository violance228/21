package sample;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * created by user violence
 * created on 29.10.2018
 * class created for project 21
 */


//@RunWith(value = Controller21.class)
public class Controller21Test {

    @Test
    public void random() {
        Controller21 controller21 = new Controller21();
        Map<Integer, String> result = new HashMap<>();
        result.put(2, "Два Hearts");
        assertEquals(result, controller21.setRandom());
    }

    @Test
    public void enums() {
        assertEquals(Enums.FIVE, Enums.getEnumByPosition(5));
    }

    @Test
    public void color() {
        Color color = new Color();
        assertEquals("Hearts", color.getSuit());
    }
}
