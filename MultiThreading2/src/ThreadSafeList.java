import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList<E>{
    private List<E> list = new ArrayList<>();

    public synchronized void add(final E value){
            list.add(value);
    }
    public synchronized E get(final int value){
        return list.get(value);
    }

    public synchronized E remove(final int value){
        return list.remove(value);
    }

    public ThreadSafeList() {
    }

    @Override
    public String toString() {
        return "ThreadSafeList{" +
                "string=" + list +
                '}';
    }
}
