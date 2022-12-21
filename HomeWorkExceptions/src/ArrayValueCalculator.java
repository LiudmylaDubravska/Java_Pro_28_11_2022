public class ArrayValueCalculator {


    public ArrayValueCalculator() {
    }

    public int doCalc(String[][] str) throws ArraySizeException, ArrayDataException {
        int i = 0;
        int j = 0;
        try {
            int result = 0;

            for (i = 0; i < str.length; i++) {
                for (j = 0; j < str[i].length; j++) {
                    result = result + Integer.parseInt(str[i][j]);
                }
                if(j != 4){
                    throw new ArraySizeException();
                }
            }
            if(i != 4){
                throw new ArraySizeException();
            }
            System.out.println("The sum = ");
            return result;
        } catch (Exception e){
            throw new ArrayDataException("ArrayDataException in [" + i + "][" + j + "] element of the array. Tha value cannot be " + str[i][j]);
        }

    }
}
