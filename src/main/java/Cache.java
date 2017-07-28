import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by JaMachine on 7/28/2017.
 */
public class Cache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public Cache(int capacity) {
        super(capacity + 1, 1.1f, true);
        this.capacity = capacity;
    }


    @Override
    protected boolean removeEldest(Map.Entry eldest) {
        return this.size() > capacity;
    }
}
