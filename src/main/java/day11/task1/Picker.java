package day11.task1;

//“Сборщик” (англ. Picker) с полями salary (заработная плата)
// и isPayed (был выплачен бонус или нет), get методами для обоих полей,
// методом toString() и конструктором.

public class Picker implements Worker {
    private int salary;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;

    }

    public int getSalary() {
        return salary;
    }


    @Override
    public void doWork() {

        salary = salary + 80;
        warehouse.countPickedOrders = warehouse.countPickedOrders + 1;


    }

    @Override
    public void bonus() {

        if (warehouse.countPickedOrders >= 10000 || !isPayed) {
            salary = salary + 70000;
            isPayed = true;
        } else if (warehouse.countPickedOrders < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (warehouse.countPickedOrders >= 10000 || isPayed) {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
