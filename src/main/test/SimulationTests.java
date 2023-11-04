import org.junit.Assert;
import org.junit.Test;

public class SimulationTests {

    @Test
    public void testSimulationConstructor(){
        int numberOfDies = 2;
        int numberOfTosses = 3;

        Simulation simulation = new Simulation(numberOfDies, numberOfTosses);

        Assert.assertNotNull(simulation);
    }

    @Test
    public void testRunSimulation(){
        int numberOfDies = 2;
        int numberOfTosses = 3;
        Simulation simulation = new Simulation(numberOfDies, numberOfTosses);


    }
}
