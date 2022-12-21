public class Main {
    public static void main(String[] args) throws ArraySizeException {
        try{
            ArrayValueCalculator arr = new ArrayValueCalculator();


            System.out.println(arr.doCalc(new String[][] {{"00", "01", "02", "03"}, {"10", "11", "12", "13"}, {"20","21", "22", "23"}, {"20","21", "22", "23"}}));
          //  System.out.println(arr.doCalc(new String[][] {{"0", "1", "2", "3", "4"}, {"10", "11", "12", "13", "14"}, {"20","21", "22", "23", "24"}}));
            System.out.println(arr.doCalc(new String[][] {{"00", "01", "f", "03"}, {"10", "11", "12", "13"}, {"20","21", "22", "23"}, {"20","21", "22", "23"}}));

        } catch(ArraySizeException arraySizeException) {
            arraySizeException.toString();
        } catch (ArrayDataException arrayDataException){
            arrayDataException.toString();
        } catch (Exception e){
            e.toString();
        }

    }
}
