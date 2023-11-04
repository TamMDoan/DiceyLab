
public class Bins {
    int start;
    int stop;
    int[] bins;

    public Bins(int start, int stop){
        this.start = start;
        this.stop = stop;
        this.bins = new int[stop - start + 1];
    }

    public int getBin(int number){
        return this.bins[number - this.start];
    }

    public void incrementBins(int binToIncrement){
        this.bins[binToIncrement - this.start]++;
    }
}
