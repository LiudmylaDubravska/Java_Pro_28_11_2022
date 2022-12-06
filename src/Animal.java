public abstract class Animal {
    private static int animalCount;
    void run(int distance){};
    void swim(int distance){};

    public void incrementAnimalCount(){
        this.animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    Animal(){
        this.incrementAnimalCount();
    }
}
