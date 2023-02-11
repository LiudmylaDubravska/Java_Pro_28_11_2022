import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Fruit apple1 = new Apple();
        Fruit apple2 = new Apple();
        Fruit apple3 = new Apple();
        Fruit orange1 = new Orange();
        Fruit orange2 = new Orange();

        List <Fruit> fruits = new ArrayList();
        fruits.add(orange1);
        fruits.add(orange2);
        fruits.add(apple1);

        Box appleBox = new Box();
        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        appleBox.addFruit(orange1);

        System.out.println(appleBox);

        Box orangeBox = new Box();
        orangeBox.addFruits(fruits);
        System.out.println(orangeBox);

        Box appleBox2 = new Box();
        appleBox2.addFruit(apple3);
        appleBox2.addFruit(apple1);

        System.out.println("Weight of apples : " + appleBox.getWeight());
        System.out.println("Weight of apples2 : " + appleBox2.getWeight());
        System.out.println("Weight of oranges : " + orangeBox.getWeight());

        if(appleBox.compare(orangeBox)){
            System.out.println("Boxes have the same weight");
        } else {
            System.out.println("Boxes have different weight");
        }

        if(appleBox.compare(appleBox2)){
            System.out.println("Boxes have the same weight");
        } else {
            System.out.println("Boxes have different weight");
        }

        System.out.println("Before the merge: ");
        System.out.println(appleBox);
        appleBox.merge(appleBox2);
        System.out.println("After the merge: ");
        System.out.println(appleBox);

        System.out.println("Before the merge: ");
        System.out.println(appleBox);
        appleBox.merge(orangeBox);
        System.out.println("After the merge: ");
        System.out.println(appleBox);
    }

    public <T> List<T> toList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

}
