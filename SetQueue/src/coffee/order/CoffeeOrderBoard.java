package coffee.order;

import java.util.*;

public class CoffeeOrderBoard {
    Set<Order> orderList = new LinkedHashSet<>();
    int currentOrderNumber = 1;
    public void add(Order order) {
        order.setOrderNumber(currentOrderNumber);
        orderList.add(order);
        currentOrderNumber++;
    }

    public void deliver(int naturalOrdering) {

        for (Iterator<Order> iterator = orderList.iterator(); iterator.hasNext(); ) {
            Order order = iterator.next();
            if (order.getOrderNumber() == naturalOrdering) {
                iterator.remove();
            }
        }
    }

    public void draw() {
        for (Order order : orderList) {
            System.out.println(order.getOrderNumber() + "|" + order.getCustomerName());
        }
    }

}
