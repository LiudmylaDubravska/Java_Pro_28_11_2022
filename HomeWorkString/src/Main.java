import  java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("qweqwoeqweqweqweqwe", 'e'));
        System.out.println(findWordPosition("Hello world", "llo"));
        System.out.println(findWordPosition("Hello world", "aaa"));
        System.out.println(stringReverse("Hello world"));
        System.out.println(isPalindrome("Hello world"));
        System.out.println(isPalindrome("ALLA"));
        guessWord();

    }
    public static int findSymbolOccurance(String str, Character ch){
        int counter=0;
        int index = str.indexOf(ch);
        while (index != -1){
            index = str.indexOf(ch, index+1);
            counter++;
        }
        return counter;
    }

    public static int findWordPosition(String source, String target){
        return source.indexOf(target);
    }

    public static String stringReverse(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static boolean isPalindrome(String str){
        boolean isPalindrome=false;
        StringBuilder sb=new StringBuilder(str);
        String str1 = new String(sb.reverse());
        if(str.equals(str1)){
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public static void guessWord(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();

        int randomNum = rand.nextInt(words.length);
        String computerWord = words[randomNum-1];
        boolean isWon = false;
        System.out.println(words[randomNum-1]);
     //   System.out.println(words.length);
        while(isWon == false) {
            Scanner sc = new Scanner(System.in);
            String userWord = sc.next();
            String answerWord = "";
            // String answerWord = "***************";
           // System.out.println(userWord);
            for (int i = 0; i < computerWord.length(); i++) {
                if (computerWord.charAt(i) == userWord.charAt(i)) {
                    answerWord = answerWord + computerWord.charAt(i);
                } else answerWord = answerWord + "#";
            }
            if (answerWord.equals(userWord)) {
                System.out.println("You won!");
                isWon = true;
            } else for (int i = 15 - answerWord.length(); i < 15; i++) {
                answerWord = answerWord + "#";
            }
            System.out.println(answerWord);
        }
      /*  System.out.println(answerWord);
        if ((words[randomNum-1]).equals(userWord)){
            System.out.println("You won!");
        }*/

    }
}


