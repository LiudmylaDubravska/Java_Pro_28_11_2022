public class NumberUtils {

    public static PerformOperation isOdd(){
        return number -> {
            if(number%2 == 1){
                return true;
            }
            return false;
        };
    }

    public static PerformOperation isPrime(){
        return number -> {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome(){
        return number -> {
            String str = String.valueOf(number);
            String rev = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            if (str.equals(rev)) {
                return true;
            }
            return false;
        };
    }
}
