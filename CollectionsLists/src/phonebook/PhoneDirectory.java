package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {
    List<Record> phoneLists = new ArrayList<>();

    public PhoneDirectory(List<Record> phoneLists) {
        this.phoneLists = phoneLists;
    }

    public void add(String name, String phoneNumber){
        phoneLists.add(new Record(name, phoneNumber));
    };

    public Record find(String name){
        Record foundRecord = new Record(null, null);
        for(Record phoneList : phoneLists){
            if (phoneList.name.equals(name)){
                foundRecord = phoneList;
            }
        }
        System.out.println(foundRecord);
        return foundRecord;
    }
    public List<Record> findAll(String name){
        List<Record> phoneListsNew = new ArrayList<>();
        for(Record phoneList : phoneLists){
            if (phoneList.name.equals(name)){
                phoneListsNew.add(phoneList);
            }
        }
        System.out.println(phoneListsNew);
        return phoneListsNew;
    }

}
