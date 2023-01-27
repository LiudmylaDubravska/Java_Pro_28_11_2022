import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {
    Map<String, List<FileData>> fileNavigator = new HashMap<>();

    public FileNavigator(Map<String, List <FileData>> fileNavigator) {
        this.fileNavigator = fileNavigator;
    }

    public FileNavigator() {
    }

    public void add(FileData fileData){
        String filePath = fileData.getFilePath();
        List <FileData> fileDataList = new ArrayList<>();
        fileDataList.add(fileData);
        if(fileNavigator.containsKey(filePath)) {
            List <FileData> fileDataList2 = fileNavigator.get(filePath);
            fileDataList2.add(fileData);
            fileNavigator.put(fileData.getFilePath(), fileDataList2);
        }else {
            fileNavigator.put(fileData.getFilePath(), fileDataList);
        }
    }

    public void addWithPath(String path, FileData fileData){
        String filePath = fileData.getFilePath();
        if(path.equals(filePath)) {
            List<FileData> fileDataList = new ArrayList<>();
            fileDataList.add(fileData);
            if (fileNavigator.containsKey(filePath)) {
                List<FileData> fileDataList2 = fileNavigator.get(filePath);
                fileDataList2.add(fileData);
                fileNavigator.put(fileData.getFilePath(), fileDataList2);
            } else {
                fileNavigator.put(fileData.getFilePath(), fileDataList);
            }
        }
        else System.out.println("Path to file '" + path + "' is different from file's path! Path should be '" +
                fileData.getFilePath() + "' \n" +
                fileData) ;
    }


    public List <FileData> find(String filePath){
        List <FileData> fileDataList = fileNavigator.get(filePath);
        System.out.println(fileDataList);
        return fileDataList;
    }

    public void remove(String filePath){
        fileNavigator.remove(filePath);
    }

    public void  filterBySize (Byte size){

    }
    public void  sortBySize(){

    }
    @Override
    public String toString() {
        return "FileNavigator{" +
                "fileNavigator=" + fileNavigator +
                 "\n" +
                '}';
    }
}
