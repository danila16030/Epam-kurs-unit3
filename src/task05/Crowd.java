package task05;

import task02.Train;

import java.util.Arrays;
import java.util.Comparator;

public class Crowd {
    private Customer[] customers;

    public Crowd(Customer[] customers) {
        this.customers = customers;
    }


    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }


}
