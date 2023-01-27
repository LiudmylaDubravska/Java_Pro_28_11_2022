import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

       int [] arr = {3,2,5,6,7,8,9,1,0,4};

        System.out.println("First example: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }

       quickSort(arr, 0, arr.length-1);
        System.out.println();
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
        System.out.println("Second example: ");
        arr = fillTheArray(10);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }
        quickSort(arr, 0, arr.length-1);

        System.out.println();
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }

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
