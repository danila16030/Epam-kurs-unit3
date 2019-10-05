package task02;

import java.util.Arrays;
import java.util.Comparator;

public class TrainAction {
    public Train findTrain(Train[] masTrain, int trainNumber) {
        for (int i = 0; i < masTrain.length; i++) {
            if (masTrain[i].getTrainNumber() == trainNumber) {
                return masTrain[i];
            }
        }
        return null;
    }

    public Train[] sorOnNumber(Train[] trainMas) {
        for (int i = 0; i < trainMas.length - 1; i++) {
            Train train = trainMas[i];
            Train nextTrain = trainMas[i + 1];
            if (train.getTrainNumber() > nextTrain.getTrainNumber()) {
                trainMas[i] = nextTrain;
                trainMas[i + 1] = train;
            }
        }
        return trainMas;
    }


    public Train[] sorOnDestination(Train[] trainMas) {
        Arrays.sort(trainMas, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if (o1.getDestination().equals(o2.getDestination())) {
                    Integer x1 = ((Train) o1).getDepartureTime();
                    Integer x2 = ((Train) o2).getDepartureTime();
                    return x1.compareTo(x2);

                } else {
                    return o1.getDestination().compareTo(o2.getDestination());
                }
            }
        });
        return trainMas;
    }
}
