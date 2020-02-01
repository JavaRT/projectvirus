package pakiet2;

import java.util.ArrayList;
import java.util.List;

public class MyQueue<T> {
    private List<T> underlyingList = new ArrayList<>();

    public void offer(T someObject) {
        underlyingList.add(someObject);

    }

    public T pool() {
        T result = underlyingList.get(0);
        underlyingList.remove(0);
        return result;
    }

    public void printAll() {
        for (T obj : underlyingList) {
            System.out.println(obj.toString());
        }
    }
}

