package task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        Train[] trainMas = new Train[5];
        trainMas[0] = new Train("Гомель", 115, 15);

        trainMas[1] = new Train("Альбукерки", 125, 14);

        trainMas[2] = new Train("Гомель", 139, 13);

        trainMas[3] = new Train("Гомель", 1119, 12);

        trainMas[4] = new Train("Минск", 116, 11);
        TrainAction trainAction = new TrainAction();
        trainMas = trainAction.sorOnNumber(trainMas);
        trainMas = trainAction.sorOnDestination(trainMas);
        int trainNumber = in.nextInt();
        Train foundTrain = trainAction.findTrain(trainMas, trainNumber);
        System.out.println(foundTrain.getTrainNumber() + " " + foundTrain.getDestination() + " " + foundTrain.getDepartureTime());
    }
}
