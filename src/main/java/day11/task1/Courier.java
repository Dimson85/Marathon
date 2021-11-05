package day11.task1;

//“Курьер” (англ. Courier) с полями salary (заработная плата)
// и isPayed (был выплачен бонус или нет), get методами для обоих полей,
// методом toString() и конструктором.

public class Courier implements Worker {
    private int salary;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }



    @Override
    public void doWork() {
        salary = salary + 100;
        warehouse.countDeliveredOrders++;
    }

    @Override
    public void bonus() {
        if (warehouse.countDeliveredOrders >= 10000 || !isPayed ) {
            salary = salary + 50000;
            isPayed = true;
        } else if (warehouse.countDeliveredOrders < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (warehouse.countDeliveredOrders <= 10000 || isPayed) {
            System.out.println("Бонус уже был выплачен");
        }
    }
}

