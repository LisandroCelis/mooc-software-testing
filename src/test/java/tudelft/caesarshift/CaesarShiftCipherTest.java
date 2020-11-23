package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.mirror.Mirror;

public class CaesarShiftCipherTest {
    @Test
    public void CaesarTest() {
        CaesarShiftCipher caesar=new CaesarShiftCipher();
        String result = caesar.CaesarShiftCipher("def",3);
        Assertions.assertEquals("ghi", result);
    }

    @Test
    public void CaesarTestAbc() {
        CaesarShiftCipher caesar=new CaesarShiftCipher();
        String result = caesar.CaesarShiftCipher("abc",3);
        Assertions.assertEquals("def", result);
    }
    @Test
    public void CaesarTestxyz() {
        CaesarShiftCipher caesar=new CaesarShiftCipher();
        String result = caesar.CaesarShiftCipher("xyz",3);
        Assertions.assertEquals("abc", result);
    }
}
