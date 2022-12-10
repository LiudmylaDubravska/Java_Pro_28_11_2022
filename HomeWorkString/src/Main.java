public class Main {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("qweqwoeqweqweqweqwe", 'e'));
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
}


