public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        cat1.run(201);
        cat2.run(100);
        cat2.swim(10);
        dog1.swim(40);
        dog1.run(500);
        dog2.swim(51);
        dog2.run(501);

        System.out.println("On competitions participated: ");
        System.out.println( Cat.getCatCount() + " cats");
        System.out.println( Dog.getDogCount() + " dogs");
        System.out.println("Summarize: " + Cat.getAnimalCount() + " animals");
    }
}
