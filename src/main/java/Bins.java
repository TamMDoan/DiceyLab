
public class Bins {

    int min;
    int max;

    int[] possibleValues;

    public Bins(int min, int max) {
        this.min = min;
        this.max = max;
        possibleValues = new int[max - min + 1]; // size 11
    }


    // create getBin(int binNumber)
    // find the value at binnumber
    // return value
    public Integer getBin(int binNumber){
        return this.possibleValues[binNumber - this.min];

    }

    // create incrementBin(int binNumber)
    // increment value at binNumber + 1
    public void incrementBin(int binNumber){
        this.possibleValues[binNumber - this.min]++;
    }


}
