package day11.task1;

// “Склад” (англ. Warehouse) c полями countPickedOrders (количество собранных заказов),
// countDeliveredOrders (количество доставленных заказов), get методами для обоих полей
// и методом toString() для получения информации о значениях полей склада.

public class Warehouse {
    public int countPickedOrders;
    public int countDeliveredOrders;



    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
}
