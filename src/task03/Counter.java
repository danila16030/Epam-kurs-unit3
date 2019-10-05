package task03;

public class Counter {
   private int lowerRangeLimit;
   private int upperRangeLimit;
   private int number;

    public Counter() {
        this.lowerRangeLimit = 1;
        this.upperRangeLimit = 55;
        this.number = 27;
    }

    public Counter(int lowerRangeLimit, int upperRangeLimit, int number) {
        this.lowerRangeLimit = lowerRangeLimit;
        this.upperRangeLimit = upperRangeLimit;
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLowerRangeLimit() {
        return lowerRangeLimit;
    }

    public int getUpperRangeLimit() {
        return upperRangeLimit;
    }

    public int getNumber() {
        return number;
    }
}
