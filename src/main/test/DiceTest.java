import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testDiceConstructor(){
        int numberOfDice = 2;
        Dice dice = new Dice(numberOfDice);

        Assert.assertNotNull(dice);
    }

    @Test
    public void testTossAndSum(){
        int numberOfDice = 2;
        Dice dice = new Dice(numberOfDice);

        Integer actual = dice.tossAndSum();

        Assert.assertTrue(actual <= numberOfDice * 6);
        Assert.assertTrue(actual >= numberOfDice);

    }

}