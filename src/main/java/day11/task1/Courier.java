package day11.task1;

//“Курьер” (англ. Courier) с полями salary (заработная плата)
// и isPayed (был выплачен бонус или нет), get методами для обоих полей,
// методом toString() и конструктором.

public class Courier implements Worker {
    private int salary;
    private int isPayed = 1;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary = salary + 100;
        warehouse.countDeliveredOrders = warehouse.countDeliveredOrders + 1;
    }

    @Override
    public void bonus() {
        if (warehouse.countDeliveredOrders >= 10000 * isPayed) {
            salary = salary + 50000;
            isPayed++;
        } else if (warehouse.countDeliveredOrders < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (warehouse.countDeliveredOrders <= 10000 * isPayed || isPayed > 1) {
            System.out.println("Бонус пока не доступен");
        }
    }
}

