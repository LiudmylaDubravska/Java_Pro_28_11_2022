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
    void verifyArrayAfter4(){
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        int[] arr = {1,2,3,4,5,3,2,1,4,6,3};
        int[] result = simpleMathLibrary.arrayAfter4(arr);
        Assertions.assertArrayEquals(result ,  new int[] {6, 3});
        int[] arr1 = {4,2,3,5,3,2,1,6,3};
        result = simpleMathLibrary.arrayAfter4(arr1);
        Assertions.assertArrayEquals(result, new int[] {2,3,5,3,2,1,6,3});
        int[] arr2 = {9,2,3,5,3,2,1,6,4};
        result = simpleMathLibrary.arrayAfter4(arr2);
        Assertions.assertArrayEquals(result, new int[] {});
    }

    @Test
    public void verifyArrayAfter4ThrowsException() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        int[] arr3 = {1,2,3,5,3,2,1,6,3};
        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            simpleMathLibrary.arrayAfter4(arr3);
        });
        String expectedMessage = "There is no 4 in the array!";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void verifyIsArrayHave1and4(){
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        int[] arr = {1,2,3,4,5,3,2,1,4,6,3};
        boolean result = simpleMathLibrary.isArrayHave1and4(arr);
        Assertions.assertTrue(result);

        int[] arr1 = {2,3,4,5,3,2,1,4,6,3,1};
        result = simpleMathLibrary.isArrayHave1and4(arr1);
        Assertions.assertTrue(result);

        int[] arr2 = {4,5,3,2,1,4,6,3,1};
        result = simpleMathLibrary.isArrayHave1and4(arr2);
        Assertions.assertTrue(result);
    }

    @Test
    public void verifyIsArrayHave1and4ThrowsException() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        int[] arr = {1,2,3,5,3,2,1,6,3};
        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            simpleMathLibrary.isArrayHave1and4(arr);
        });
        String expectedMessage = "There is no 4 in the array";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));

        int[] arr1 = {2,3,4,5,3,2,6,3};
        exception = Assertions.assertThrows(RuntimeException.class, () -> {
            simpleMathLibrary.isArrayHave1and4(arr1);
        });
        expectedMessage = "There is no 1 in the array";
        actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }


}