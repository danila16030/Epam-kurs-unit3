package task05;

public class Main {
    static public void main(String args[]) {
        Customer customers[] = new Customer[5];
        customers[0] = new Customer(1195, "Чечитов", "Данила", "Викторович",
                "ул. Пушкина", 7895, 7895);
        customers[1] = new Customer(1175, "Вечитов", "Данила", "Викторович",
                "ул. Мушкина", 7795, 7512);
        customers[2] = new Customer(1295, "Мечитов", "Данила", "Викторович",
                "ул. Кушкина", 8895, 7995);
        customers[3] = new Customer(2195, "Речитов", "Данила", "Викторович",
                "ул. Лушкина", 7125, 8955);
        customers[4] = new Customer(3595, "Нечитов", "Данила", "Викторович",
                "ул. Вушкина", 9895, 1015);
        Crowd crowd = new Crowd(customers);
        CrowdAction crowdAction = new CrowdAction();
        crowd = crowdAction.sort(crowd);
        for (int i = 0; i < crowd.getCustomers().length; i++) {
            System.out.println(crowd.getCustomers()[i].toString());
        }
        System.out.println("В диапазоне");
        crowd = crowdAction.findCustomers(crowd, 0, 7993);
        for (int i = 0; i < crowd.getCustomers().length; i++) {
            try {
                System.out.println(crowd.getCustomers()[i].toString());
            }catch (NullPointerException e){
              return;
            }

        }
    }
}
