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
        // IT IS UNIFORM DISTRIBUTION
        // FIGURE OUT HOW TO MAKE IT NORMAL
        Random random = new Random();
        int binToIncrement;
        int dice1;
        int dice2;

        for(int i = 0; i < numberOfThrows; i++){
                // .random returns a number between [0, 1)
                // multiply by 6, you'll get number between [0, 6)
                // cast to int -> [0, 5]
                // add 1 -> [1, 6]
            dice1 = (int) (Math.random()*6) + 1;
            dice2 = (int) (Math.random()*6) + 1;
            binToIncrement = dice1 + dice2;
            bins.incrementBins(binToIncrement);
        }
    }

    public void printResults(){
        int binNumber;
        System.out.println(String.format("***\nSimulation of %d dice tossed for %d times.\n***\n", numberOfDies, numberOfThrows));
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
