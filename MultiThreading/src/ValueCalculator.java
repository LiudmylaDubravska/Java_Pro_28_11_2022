public class ValueCalculator {
    private final int fullLength = 1_000_000;
    private final int halfLength = fullLength/2;
    private final float[] fullArray = new float[fullLength];

    public long calculate(){
        long start = System.currentTimeMillis();
        printArray(fullArray);
        for(int i=0; i< fullLength; i++){
            fullArray[i] = i;
        }
        printArray(fullArray);

        float[] firstPartArray = new float[halfLength];
        float[] secondPartArray = new float[halfLength];
        System.arraycopy(fullArray, 0, firstPartArray, 0, halfLength);
        System.arraycopy(fullArray, halfLength-1, secondPartArray, 0, halfLength);
        CalculateTread tr1 = new CalculateTread(firstPartArray);
        CalculateTread tr2 = new CalculateTread(secondPartArray);

        tr1.start();
        tr2.start();

        while (tr1.isAlive() || tr2.isAlive());
        final float[] result = new float[fullLength];
        System.arraycopy(firstPartArray, 0, result, 0, halfLength);
        System.arraycopy(secondPartArray, 0, result, halfLength, halfLength);
        printArray(result);
        return System.currentTimeMillis() - start;

    }
public long calculateWithoutThreads(){
        float[] testArray = new float[fullLength];
        long start = System.currentTimeMillis();
        printArray(testArray);
        for(int i = 0; i < testArray.length; i++){
            testArray[i] = 1;
        }
        printArray(testArray);
        for(int i = 0; i < testArray.length; i++){
            testArray[i] = (float)(testArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        printArray(testArray);
        return System.currentTimeMillis()-start;
}
public void printArray(final float[] array){
    System.out.println("1: " + array[0]);
    System.out.println("500_000: " + array[halfLength-1]);
    System.out.println("500_001: " + array[halfLength]);
    System.out.println("1_000_000: " + array[fullLength-1]);
}
}
