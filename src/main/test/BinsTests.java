import org.junit.Assert;
import org.junit.Test;

public class BinsTests {

    @Test
    public void testBinsConstructor(){
        int start = 3;
        int stop = 14;
        Bins bins = new Bins(start, stop);

        Assert.assertNotNull(bins);
    }

    @Test
    public void testGetBin(){
        int start = 3;
        int stop = 14;
        Bins bins = new Bins(start, stop);

        int expected = bins.getBin(3);

        Assert.assertEquals(expected, 0);
    }

    @Test
    public void testIncrementBin(){
        int start = 3;
        int stop = 14;
        Bins bins = new Bins(start, stop);

        bins.incrementBins(4);

        int expected = bins.getBin(4);

        Assert.assertEquals(expected, bins.getBin(4));
    }


}
