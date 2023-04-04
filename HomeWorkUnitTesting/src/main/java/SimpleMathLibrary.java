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
        for (int i = size - 1; i > -1; i--) {
            if (arr[i] == 4) {
                find4 = i + 1;
                sizeNew = size - find4;
                break;
            }
        }
        if (find4 == -1) {
            throw new RuntimeException("There is no 4 in the array!");
        } else {
            result = new int[sizeNew];
            System.out.println("New array: ");
            for (int i = find4, j = 0; i < size; i++, j++) {
                result[j] = arr[i];
                System.out.print(result[j] + " ");
            }

        }
        System.out.println("");
        return result;
    }

    public boolean isArrayHave1and4(int[] arr) {
        boolean result = false;
        int size = arr.length;
        boolean find4 = false;
        boolean find1 = false;
        for (int i = size - 1; i > 1; i--) {
            if (arr[i] == 4) {
                find4 = true;
            }
            if (arr[i] == 1) {
                find1 = true;
            }
            if (find1 && find4) {
                result = true;
                break;
            }
        }
        if (find1 == false) {
            throw new RuntimeException("There is no 1 in the array");
        }
        if (find4 == false) {
            throw new RuntimeException("There is no 4 in the array");
        }
        return result;
    }
}
