import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------countOccurance-------------------------");
        List <String> strList = new ArrayList();
        strList.add("qwer1");
        strList.add("ytr");
        strList.add("oiu");
        strList.add("qwer");
        strList.add("xdf");
        countOccurance(strList, "qwer");
        System.out.println("---------------------------toList------------------------------");
        Integer [] arr = new Integer[] { 1, 2, 3 };
        toList(arr);
        System.out.println("-------------------------findUnique----------------------------");
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
}
