import org.junit.Assert;
import org.junit.Test;

public class DiceTests {

    @Test
    public void testDiceConstructor(){
        int sides = 2;
        Dice dice = new Dice(sides);

        Assert.assertEquals(sides, dice.getSides());
    }
}
