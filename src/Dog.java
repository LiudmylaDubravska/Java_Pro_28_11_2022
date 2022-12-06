public class Dog extends Animal{

    private final int maxRunDistance= 500;
    private final int maxSwimDistance= 50;
    private static int count;
    @Override
    void run(int distance){
        if(distance > maxRunDistance){
            System.out.println("Dogs can't run more then " + maxRunDistance + " meters!");
        }
        else {
            System.out.println("The dog ran " + distance + " meters.");
        }
    }
    @Override
    void swim(int distance){
        if(distance > maxSwimDistance){
            System.out.println("Dogs can't swim more then " + maxSwimDistance + " meters!");
        }
        else {
            System.out.println("The dog swam " + distance + " meters.");
        }
    }

    Dog(){
        this.incrementDogCount();
    }

    public static void incrementDogCount(){
        count++;
    }

    public static int getDogCount(){
        return count;
    }
}
