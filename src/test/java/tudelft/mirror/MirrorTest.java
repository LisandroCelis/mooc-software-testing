package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.leapyear.LeapYear;

public class MirrorTest {

    @Test
    public void mirrorTest() {
        Mirror mirror=new Mirror();
        String result = mirror.mirrorEnds("abca");
        Assertions.assertEquals("a", result);
    }

}
