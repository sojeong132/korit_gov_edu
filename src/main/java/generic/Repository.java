package generic;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {    // 제네릭
    private List<T> list;

    public Repository() {
        list = new ArrayList<>();
    }

    public T save(T t) {
        list.add(t);
        return t;
    }

    public List<T> findAll() {
        return list;
    }
}
