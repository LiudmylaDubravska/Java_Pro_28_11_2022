public interface Human extends SportsMan {
    void eat();
    default void run(){
        System.out.println("Людина бігає");
    };
    void speak();
    void sleep();
    void fire();
}
