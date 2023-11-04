import java.util.Random;

public class Simulation {
    int numberOfDies;
    int numberOfThrows;

    Bins bins;

    public Simulation(int numberOfDies, int numberOfThrows){
        this.numberOfDies = numberOfDies;
        this.numberOfThrows = numberOfThrows;
        this.bins = new Bins(numberOfDies, numberOfDies*6);

    }

    public void runSimulation(){
        // loop? a MILLION TIMES???? -- use numberOfThrows
        // randomly choose a number between the range for bins
        // increment said number
        Random random = new Random();
        int binToIncrement;

        for(int i = 0; i < numberOfThrows; i++){
            binToIncrement = random.nextInt(((numberOfDies * 6) - numberOfDies +1)) + numberOfDies;
            bins.incrementBins(binToIncrement);
        }
    }

    public void printResults(){
        int binNumber;
        for(int i = 0; i < bins.binLength(); i++){
            binNumber = numberOfDies + i;
            String str = String.format("%2d : %8d: %1.2f ", binNumber, bins.getBin(binNumber), (double) bins.getBin(binNumber)/numberOfThrows);
            // take bins.getBins(#)/numberOfThrows, floor it, and that's how many stars you need to add
            // but how to add?
            double repeated = (double) bins.getBin(binNumber) / numberOfThrows * 100;
            String stars = "*".repeat((int) repeated);
            System.out.println(str + stars);
        }
    }



}
