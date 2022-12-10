import  java.lang.Math;
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords("Orange", "Banana", "Apple");
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(compareNumbers2(5, 6));
        checkNumber(-7);
        System.out.println(checkIfNegative(-6));
        printString("Hello", 10);
        System.out.println("2000 рік високосним " + checkIfLeapYear(2000));
        System.out.println("2400 рік високосним " + checkIfLeapYear(2400));
        System.out.println("2100 рік високосним " + checkIfLeapYear(2100));
        System.out.println("2008 рік високосним " + checkIfLeapYear(2008));
        System.out.println("1912 рік високосним " + checkIfLeapYear(1912));
        System.out.println("1999 рік високосним " + checkIfLeapYear(1999));
        System.out.println("2022 рік високосним " + checkIfLeapYear(2022));
        System.out.println("2024 рік високосним " + checkIfLeapYear(2024));
    }

   public static void printThreeWords(String a, String b, String c){
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
   }

   public static void checkSumSign(){
        int a = 4;
        int b = -5;
        int c = a +b;
        if(c>=0){
            System.out.println(" Сума позитивна");
        }
        else System.out.println("Сума негативна");
   };

    public static void printColor(){
        int value = 100;

        if(value <= 0){
            System.out.println("Червоний");
        }
        if (value >= 0 && value <= 100){
                System.out.println("Жовтий");
        }
        if (value >= 100){
            System.out.println("Зелений");
        }
    }

    public static void compareNumbers(){
        int a = 100;
        int b = 100;
        if(a >= b){
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
    }

    public static boolean compareNumbers2(int a, int b){
        int c = a + b;
        if (c >= 10 && c <= 20){
            return true;
        }
        else return false;
    }

    public static void checkNumber(int a){
        if(a >= 0){
            System.out.println("Чило додатнє");
        }else{
            System.out.println("Чило від’ємне");
        }
    }

    public static boolean checkIfNegative(int a){
        if(a >= 0){
            return false;
        }else{
            return true;
        }
    }

    public static void printString(String s, int a){
        if (a > 0){
        for (int i=0; i <= a; i++) {
            System.out.println(s);
        }
        }else System.out.println("Не можу надрукувати рядок " + a + "разів");
    }

    public static boolean checkIfLeapYear(int year){
        boolean isLeapYear = false;
        if (year%400 == 0){
            isLeapYear = true;
        }else if (year%100 != 0){
            if(year%4 == 0){
                isLeapYear = true;
            }
        }else isLeapYear = false;
        return isLeapYear;
    }

}
