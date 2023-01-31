import coffee.order.CoffeeOrderBoard;
import coffee.order.Order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        System.out.println();
        System.out.println("========== add ===========");
        coffeeOrderBoard.add(new Order("Anna"));
        coffeeOrderBoard.add(new Order("Oleh"));
        coffeeOrderBoard.add(new Order("Kirill"));
        coffeeOrderBoard.add(new Order("Katia"));
        System.out.println("Num|Name");
        coffeeOrderBoard.draw();

        System.out.println();
        int deliveryNumber = 3;
        System.out.println("========== deliver " + deliveryNumber + " ===========");
        coffeeOrderBoard.deliver(3);
        System.out.println("Num|Name");
        coffeeOrderBoard.draw();

        System.out.println();
        System.out.println("========== add ===========");
        coffeeOrderBoard.add(new Order("Denis"));
        System.out.println("Num|Name");
        coffeeOrderBoard.draw();
    }
}
