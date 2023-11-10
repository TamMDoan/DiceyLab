public class Simulation {

    int numberOfDies;
    int numberOfTosses;

    // create constructor(int numberOfDies, int numberOfTosses)
    public Simulation(int numberOfDies, int numberOfTosses){
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }

    // create runSimulation method
    // use the values in constructor
    // to simulate the toss throwing
    public void runSimulation(){
        Dice dice = new Dice(this.numberOfDies);
        Bins bins = new Bins(this.numberOfDies, this.numberOfDies * 6);

        for(int i = 0; i < this.numberOfTosses; i++){
            bins.incrementBin(dice.tossAndSum());
        }

        // to see if our thing is working
//        for(int i = 2; i <= numberOfDies * 6; i++){
//            System.out.println("Value at bin number " + i + ": " +bins.getBin(i));
//        }

        printResults(bins);

    }

    // printResults
    public void printResults(Bins bins) {
        int binNumber;
        int lengthOfBin = numberOfDies * 6 - numberOfDies + 1;
        System.out.println(String.format("***\nSimulation of %d dice tossed for %d times.\n***\n", numberOfDies, numberOfTosses));
        for (int i = 0; i < lengthOfBin; i++) {
            binNumber = numberOfDies + i;
            String str = String.format("%2d : %8d: %1.2f ", binNumber, bins.getBin(binNumber), (double) bins.getBin(binNumber) / numberOfTosses);
            // take bins.getBins(#)/numberOfThrows, floor it, and that's how many stars you need to add
            // but how to add?
            double repeated = (double) bins.getBin(binNumber) / numberOfTosses * 100;
            String stars = "*".repeat((int) repeated);
            System.out.println(str + stars);
        }
    }

}
