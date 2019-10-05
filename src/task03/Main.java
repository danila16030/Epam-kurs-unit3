package task03;

public class Main {
    public static void main(String args[]) {
        Counter firstCounter = new Counter();
        CounterAction counterAction=new CounterAction();
        Counter secondCounter = new Counter(1, 15, 8);
        System.out.println(secondCounter.getNumber());
        counterAction.increaseNumber(secondCounter);
        System.out.println(secondCounter.getNumber());
        counterAction.decreaseNumber(secondCounter);
        System.out.println(secondCounter.getNumber());
    }
}
