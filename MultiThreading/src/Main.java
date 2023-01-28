public class Main {
    public static void main(String[] args) {
        ValueCalculator valueCalculator = new ValueCalculator();
        System.out.println(valueCalculator.calculate() + " ms");
        System.out.println(valueCalculator.calculateWithoutThreads() + " ms");
    }
}
