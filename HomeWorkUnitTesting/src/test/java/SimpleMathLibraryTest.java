import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathLibraryTest {
    @Test
    void verifyAdd() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();

        Double result = simpleMathLibrary.add(10.2, 12.5);
        Assertions.assertTrue(result.equals(22.7));
        result = simpleMathLibrary.add(100.0, 200.0);
        Assertions.assertTrue(result.equals(300.0));
        result = simpleMathLibrary.add(0.0, 0.0);
        Assertions.assertTrue(result.equals(0.0));
        result = simpleMathLibrary.add(-100.0, 200.0);
        Assertions.assertTrue(result.equals(100.0));

    }

    @Test
    void verifyMinus() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();

        Double result = simpleMathLibrary.minus(10.2, -12.5);
        Assertions.assertTrue(result.equals(22.7));
        result = simpleMathLibrary.minus(100.0, 200.0);
        Assertions.assertTrue(result.equals(-100.0));
        result = simpleMathLibrary.minus(0.0, 0.0);
        Assertions.assertTrue(result.equals(0.0));
        result = simpleMathLibrary.minus(-100.0, 200.0);
        Assertions.assertTrue(result.equals(-300.0));

    }

    @Test
    void verifyArrayAfter4(){}

    @Test
    void verifyIsArrayHave1or4(){}
}