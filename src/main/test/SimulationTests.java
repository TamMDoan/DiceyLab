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

    /*@Test // NOT SURE HOW TO TEST THIS YET -- maybe not since void return???
    public void testRunSimulation(){
        int numberOfDies = 2;
        int numberOfTosses = 3;
        Simulation simulation = new Simulation(numberOfDies, numberOfTosses);

        simulation.runSimulation();

    }*/

    @Test
    public void testPrintResults(){
        int numberOfDies = 2;
        int numberOfTosses = 1000000;
        Simulation simulation = new Simulation(numberOfDies, numberOfTosses);

        simulation.runSimulation();

        simulation.printResults();
    }
}
