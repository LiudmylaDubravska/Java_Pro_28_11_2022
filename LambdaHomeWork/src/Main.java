import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number ");
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        for (int i=0; i<length; i++){
            System.out.println("Enter number for checking");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter number 1, 2 or 3");
            System.out.println("1 - for Odd/Even, 2 - for Prime, or 3 - for Palindrome");
            int executeMethod = Integer.parseInt(scanner.nextLine());
            PerformOperation operation = getOperation(executeMethod);
            boolean isTrue = operation.perform(number);
            switch (executeMethod){
                case 1:
                    if(isTrue) {
                        System.out.println("ODD");
                    }else System.out.println("EVEN");
                    break;
                case 2:
                    if(isTrue) {
                        System.out.println("PRIME");
                    }else System.out.println("COMPOSITE");
                    break;
                case 3:
                    if(isTrue) {
                        System.out.println("PALINDROME");
                    }else System.out.println("NOT PALINDROME");
                    break;
            }
        }
    }

    private static PerformOperation getOperation(int executeMethod) {
        switch (executeMethod){
            case 1:
                return NumberUtils.isOdd();
            case 2:
                return NumberUtils.isPrime();
            case 3:
                return NumberUtils.isPalindrome();
        }
        return null;
    }
}
