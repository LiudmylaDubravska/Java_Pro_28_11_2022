import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

       int [] arr = {3,2,5,6,7,8,9,1,0,4};

        System.out.println("Quick Sort. First example: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }

       quickSort(arr, 0, arr.length-1);
        System.out.println();
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }

        System.out.println();
        System.out.println("Quick Sort. Second example: ");
        arr = fillTheArray(10);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }
        quickSort(arr, 0, arr.length-1);

        System.out.println();
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }

        System.out.println();
        System.out.println("bubble Sort. First example:   ");
        arr = fillTheArray(10);


        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }
        bubbleSort(arr);

        System.out.println();
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }

        System.out.println();
        System.out.println("Cocktail Sort. First example:   ");

        arr[0] = 3; arr[1] = 1; arr[2] = 9; arr[3] = 2; arr[4] = 7;
        arr[5] = 8; arr[6] = 6; arr[7] = 0; arr[8] = 4; arr[9] = 5;

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }
        cocktailSort(arr);

        System.out.println();
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }

    }
    public static void bubbleSort(int[] arr){
        boolean isSwap = true;
        while(isSwap){
            isSwap = false;
            for(int i=0; i < arr.length-1; ++i){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSwap = true;
                }
            }
        }
    }

    public static void cocktailSort(int[] arr) {
        int begin = 0; int end=arr.length-1;
        boolean isSwap = true;
        while(isSwap && begin <= end){
            isSwap = false;
            isSwap = swapCocktailSort(arr, begin, end, isSwap);
            end--;
            isSwap = swapCocktailSortReverse(arr, begin, end, isSwap);
            begin++;

        }
    }

    public static boolean swapCocktailSort(int[] arr, int begin, int end, boolean isSwap) {
        for (int i = begin; i < end; ++i) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                isSwap = true;
            }
        }
        return isSwap;
    }

    public static boolean swapCocktailSortReverse(int[] arr, int begin, int end, boolean isSwap) {
        for (int i = end; i > begin; --i) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                isSwap = true;
            }
        }
        return isSwap;
    }
    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex){
            return;
        }
        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);
        quickSort(arr, lowIndex, leftPointer-1);
        quickSort(arr, leftPointer+1, highIndex);
    }

    private static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    };

    public static int[] fillTheArray(int length){
        int [] arr = new int[length];
        for (int i=0; i < length; i++){
            arr[i] = ThreadLocalRandom.current().nextInt(0, 100);
        }
        return arr;
    }
}
