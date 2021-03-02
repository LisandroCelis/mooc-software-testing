package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tudelft.roman.RomanNumeral;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    private TwoNumbersSum suma=new TwoNumbersSum();

    @Test
    public void singleNumber() {
        ArrayList<Integer> NumberA = new ArrayList<>();
        ArrayList<Integer> NumberB = new ArrayList<>();
        NumberA.add(2);
        NumberA.add(0);
        NumberB.add(5);
        ArrayList<Integer> result = suma.addTwoNumbers(NumberA,NumberB);
        ArrayList<Integer> expectResult=new ArrayList<>();
        expectResult.add(2);
        expectResult.add(5);
        Assertions.assertEquals(expectResult,result);
        //Assertions.assertEquals(1,5, result);
    }

    @Test
    public void singleNumber2() {
        ArrayList<Integer> NumberA = new ArrayList<>();
        ArrayList<Integer> NumberB = new ArrayList<>();
        NumberA.add(0);
        NumberA.add(2);
        NumberB.add(5);
        ArrayList<Integer> result = suma.addTwoNumbers(NumberA,NumberB);
        ArrayList<Integer> expectResult=new ArrayList<>();
        expectResult.add(7);
        Assertions.assertEquals(expectResult,result);
        //Assertions.assertEquals(1,5, result);
    }

    @Test
    public void singleNumber3() {
        ArrayList<Integer> NumberA = new ArrayList<>();
        ArrayList<Integer> NumberB = new ArrayList<>();
        NumberA.add(2);
        NumberA.add(2);
        NumberA.add(2);

        NumberB.add(5);
        NumberB.add(5);
        NumberB.add(5);
        NumberB.add(5);
        ArrayList<Integer> result = suma.addTwoNumbers(NumberA,NumberB);
        ArrayList<Integer> expectResult=new ArrayList<>();
        expectResult.add(5);
        expectResult.add(7);
        expectResult.add(7);
        expectResult.add(7);
        Assertions.assertEquals(expectResult,result);
        //Assertions.assertEquals(1,5, result);
    }

}
