import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FileData file = new FileData("doc.txt",  10, "C://projects");
        FileData file1 = new FileData("doc2.txt", 20, "C://projects");
        FileData file2 = new FileData("doc3.txt", 100, "D://projects");
        FileData file3 = new FileData("doc4.txt", 30, "C://System");
        FileData file4 = new FileData("doc5.txt", 50, "C://projects");
        FileData file5 = new FileData("doc6.txt",  45, "C://projects");
        FileData file6 = new FileData("doc7.txt", 5, "D://projects");
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(file);
        fileNavigator.add(file1);
        fileNavigator.add(file2);
        fileNavigator.add(file3);
        fileNavigator.add(file4);
        fileNavigator.addWithPath("K://projects", file5);
        fileNavigator.addWithPath("D://projects", file6);
        System.out.println(fileNavigator);
        System.out.println("====================================");
        System.out.println("Find files with path ");
        fileNavigator.find("C://projects");
        System.out.println("====================================");
        System.out.println("Remove files with path ");
        fileNavigator.remove("D://projects");
        System.out.println(fileNavigator);
        System.out.println("=============filterBySize===================");
        fileNavigator.filterBySize(35);
        System.out.println("=============sortBySize===================");
        fileNavigator.sortBySize();
    }
}
