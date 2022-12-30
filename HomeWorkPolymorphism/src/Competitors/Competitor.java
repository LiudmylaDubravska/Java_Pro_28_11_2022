package Competitors;

public abstract class Competitor {
    private int maxLength;
    private int maxHeight;
    private String name;

    public Competitor(int maxLength, int maxHeight, String name) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.name = name;
    }

    public void run(){
        System.out.println(name + " competitor ran" );
    };
    public void jump(){
        System.out.println(name + " competitor jumped" );
        };
    public void lostRun(){
        System.out.println(name + " competitor was lost running" );
    };
    public void lostJump(){
        System.out.println(name + " competitor was lost jumping" );
    };

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
