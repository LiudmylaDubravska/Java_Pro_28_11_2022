import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    public Box() {
    }

    List<T> fruits = new ArrayList<>();

    public List<T> getFruits() {
        return fruits;
    }

    public void addFruit(T fruit) {
        if (fruits.isEmpty()) {
            fruits.add(fruit);
        } else {
            if (checkClass(fruits.get(0), fruit)) {
                fruits.add(fruit);
            } else System.out.println("Different fruits!");
        }
    }

    public void addFruits(List<T> fruits2) {
        for (T fruit : fruits2) {
            addFruit(fruit);
        }
    }

    public float getWeight() {
        if (!fruits.isEmpty()) {
            return fruits.get(0).getWeight() * fruits.size();
        } else {
            return 0;
        }
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void merge(Box box) {
        List<Fruit> fruits2 = box.getFruits();
        if (fruits.isEmpty()) {
            addFruits((List<T>) fruits2);
        } else {
            if (!fruits2.isEmpty()) {
                if (checkClass(fruits.get(0), fruits2.get(0))) {
                    addFruits((List<T>) fruits2);
                } else System.out.println("Different fruits!");
            }
        }
    }
    private boolean checkClass(Fruit fruit1, Fruit fruit2){
        return fruit1.getClass().equals(fruit2.getClass());
    }

    @Override
    public String toString() {
        return "Box{" +
                "Class = " + (!fruits.isEmpty() ? fruits.get(0).getClass() : "") +
                ", Weight = " + getWeight() +
                ", Size = " + fruits.size() +
                '}';
    }
}
