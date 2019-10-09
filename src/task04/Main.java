package task04;

public class Main {
    public static void main(String args[]) {
        Clock clock = new Clock(24, 60, 60);
        ClockAction clockAction=new ClockAction();
        clockAction.setTime(22,60,49,clock);
        System.out.println(clock.getHour());
    }
}
