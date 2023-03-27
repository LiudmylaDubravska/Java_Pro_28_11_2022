public class SimpleMathLibrary {


    public double add(double a, double b) {
        return a + b;
    }

    ;

    public double minus(double a, double b) {
        return a - b;
    }

    ;

    public int[] arrayAfter4(int[] arr) {
        int size = arr.length;
        int find4 = -1;
        int sizeNew = 0;
        int[] result = null;
        for (int i = size-1; i > 1; i--) {
            if (arr[i] == 4) {
                find4 = i+1;
                sizeNew = size - find4;
                break;
            }
        }
        if (find4 == -1) {
            System.out.println("RuntimeException");
        } else {
            result = new int[sizeNew];
            System.out.println("New array: ");
            for (int i = find4, j=0; i < size; i++, j++) {
                result[j]=arr[i];
                System.out.print(result[j] + " ");
            }

        }
        return result;
    }
}
