package task03;

public class CounterAction {
    public void increaseNumber(Counter counter) {
        if (counter.getNumber() + 1
        <counter.getUpperRangeLimit()) {
            counter.setNumber(counter.getNumber() + 1);
        }
    }

    public void decreaseNumber(Counter counter) {
        if (counter.getLowerRangeLimit() -1 < counter.getNumber()) {
            counter.setNumber(counter.getNumber() - 1);
        }
    }

}
