package task02;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Train {
    private String destination;
    private int trainNumber;
    private int departureTime;

    public Train(String destination, int trainNumber, int departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public int getDepartureTime() {
        return departureTime;
    }


}
