import java.util.*;

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

    public List<FileData>   filterBySize (long size){
        List<FileData> result = new ArrayList<>();
        Collection <List <FileData>> fileDataCollections = fileNavigator.values();
        for (List<FileData> fileDataCollection: fileDataCollections) {
            for (FileData fileData: fileDataCollection) {
                if (fileData.getFileSize() <= size){
                    result.add(fileData);
                }
            }
        }
        System.out.println(result);
        return result;
    }
    public List<FileData>  sortBySize(){
        List<FileData> result = new ArrayList<>();
        Collection <List <FileData>> fileDataCollections = fileNavigator.values();
        for (List<FileData> fileDataCollection: fileDataCollections) {
            result.addAll(fileDataCollection);
        }
        Collections.sort(result, new Comparator<FileData>() {
            @Override
            public int compare(FileData o1, FileData o2) {
                if(o1.getFileSize() > o2.getFileSize()){
                    return 1;
                } else if(o1.getFileSize() < o2.getFileSize()) {
                    return -1;
                } else return 0;
            }
        });
        System.out.println(result);
        return result;
    }
    @Override
    public String toString() {
        return "FileNavigator{" +
                "fileNavigator=" + fileNavigator +
                 "\n" +
                '}';
    }
}
