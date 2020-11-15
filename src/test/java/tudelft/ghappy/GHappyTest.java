package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void GHappyT() {
        GHappy g=new GHappy();
        boolean result = g.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void GHappy2() {
        GHappy g=new GHappy();
        boolean result = g.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void GHappy3() {
        GHappy g=new GHappy();
        boolean result = g.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }
}
