import phonebook.PhoneDirectory;
import phonebook.Record;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------ countOccurance -------------------------");
        List <String> strList = new ArrayList();
        strList.add("qwer1");
        strList.add("ytr");
        strList.add("oiu");
        strList.add("qwer");
        strList.add("xdf");
        countOccurance(strList, "qwer");
        System.out.println("--------------------------- toList ------------------------------");
        Integer [] arr = new Integer[] { 1, 2, 3 };
        toList(arr);
        System.out.println("------------------------- findUnique ----------------------------");
        List <Integer> intList = new ArrayList();
        intList.add(12);
        intList.add(13);
        intList.add(15);
        intList.add(12);
        intList.add(15);
        intList.add(15);
        intList.add(18);
        intList.add(15);
        findUnique(intList);

        System.out.println("------------------------ calcOccurance --------------------------");
        List <String> linkedList = new LinkedList<>();
        linkedList.add("cat");
        linkedList.add("dog");
        linkedList.add("duck");
        linkedList.add("fish");
        linkedList.add("elephant");
        linkedList.add("dog");
        linkedList.add("cat");
        linkedList.add("dog");
        linkedList.add("duck");
        linkedList.add("fish");
        linkedList.add("dog");
        linkedList.add("cat");
        linkedList.add("dog");
        linkedList.add("duck");
        linkedList.add("dog");
        linkedList.add("dog");
        linkedList.add("dog");
        linkedList.add("monkey");
        calcOccurance(linkedList);

        System.out.println("------------------------ findOccurance --------------------------");
        linkedList.add("cat");
        linkedList.add("dog");
        linkedList.add("duck");
        linkedList.add("fish");
        linkedList.add("elephant");
        linkedList.add("dog");
        linkedList.add("cat");
        linkedList.add("dog");
        linkedList.add("duck");
        linkedList.add("fish");
        linkedList.add("dog");
        linkedList.add("cat");
        linkedList.add("dog");
        linkedList.add("duck");
        linkedList.add("dog");
        linkedList.add("dog");
        linkedList.add("dog");
        linkedList.add("monkey");
        findOccurance(linkedList);

        System.out.println("------------------------ PHONE DIRECTORY ------------------------");
        List <Record> recordList = new LinkedList<>();
        recordList.add(new Record("Oleh", "+380981234323"));
        recordList.add(new Record("Oleh", "+380981234323"));
        recordList.add(new Record("Ira", "+380981234323"));
        recordList.add(new Record("Oleh", "+380969696123"));
        recordList.add(new Record("Ira", "+380980055234"));
        recordList.add(new Record("Denys", "+380631235698"));
        recordList.add(new Record("Maria", "+380502249845"));

        PhoneDirectory phoneDirectory = new PhoneDirectory(recordList);
        phoneDirectory.add("Oleh", "+380981234300");
        phoneDirectory.add("Sveta", "+380937774300");
        phoneDirectory.find("Oleh");
        phoneDirectory.find("Sveta");
        phoneDirectory.find("Kostia");
        phoneDirectory.findAll("Oleh");
        phoneDirectory.findAll("Sveta");
        phoneDirectory.findAll("Kostia");
    }

    public static int countOccurance(List<String> lists, String str){
        System.out.println(lists);
        int count=0;
        for(String list : lists){
            if(list.indexOf(str) != -1) {
                count++;
            }
        }
        System.out.println("String " + str + " meets in the lists " + count + " times");
        return count;
    }

    public static List <Integer> toList(Integer [] arr){
        arr = new Integer[] { 1, 2, 3 };
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);
        return list;
    }

    public static List <Integer> findUnique(List<Integer> lists){
        System.out.println(lists);
        List <Integer> lists2  = new ArrayList();
        lists2.add(lists.get(0));
        for(Integer list : lists){
            int count = 0;
            for(Integer list2 : lists2) {
                if(list == list2) {
                    count = 1;
                    break;
                }
            }
            if(count == 0){
                lists2.add(list);
            }
        }
        System.out.println(lists2);
        return lists2;
    }

    public static void calcOccurance(List<String> lists){
        System.out.println(lists);
        int count = 0;
        String word = "";
        int i = 0;
        while(i < lists.size()){
            word = lists.get(i);
            int j=0;
            while(j < lists.size()){
                if (lists.get(j).equals(word)){
                    count++;
                    lists.remove(j);
                    j = 0;
                } else {
                    j++;
                }
            }
            System.out.println(word + ": " + count);
            count = 0;
            i = 0;
        }
    }
    public static void findOccurance(List<String> lists){
        List <WordOccurance> linkedList = new LinkedList<>();
        System.out.println(lists);
        int count = 0;
        String word = "";
        int i = 0;
        while(i < lists.size()){
            word = lists.get(i);
            int j=0;
            while(j < lists.size()){
                if (lists.get(j).equals(word)){
                    count++;
                    lists.remove(j);
                    j = 0;
                } else {
                    j++;
                }
            }
            linkedList.add(new WordOccurance(word, count));
            count = 0;
            i = 0;
        }
        System.out.println(linkedList);
    }

}
