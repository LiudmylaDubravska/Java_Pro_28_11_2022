public class UkrainimanMan  implements Human{
    private int age;
    private String name;
    @Override
    public void eat() {
        System.out.println("Українеть їсть");
    }

    @Override
    public void sleep() {
        System.out.println("Українеть спить");
    }

    @Override
    public void speak() {
        System.out.println("Українеть говорить");
    }

    @Override
    public void fire() {
        System.out.println("Українеть захищає країну");
    }

    @Override
    public void doSport() {

    }
}
