public class Cat extends Animal {
    private final int maxDistance= 200;
    private static int count;

    @Override
    void run(int distance){
    if(distance > maxDistance){
        System.out.println("Cats can't run more then " +  maxDistance + " meters!");
    }
    else {
        System.out.println("The cat ran " + distance + " meters.");
    }
    }
    @Override
    void swim(int distance){
        System.out.println("Sorry, the cat was sink! Cat can't swim!");
    }

    public static void incrementCatCount(){
        count++;
    }

    public static int getCatCount(){
        return count;
    }

    Cat(){
        this.incrementCatCount();
    }
}
