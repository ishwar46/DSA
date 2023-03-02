package ExamPractice;
import java.util.LinkedHashMap;
import java.util.Map;
public class ShortLRU<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public ShortLRU(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(2);
        cache.put(1, "one");
        cache.put(2, "two");
        System.out.println(cache.get(1)); // Output: one
        cache.put(3, "three");
        System.out.println(cache.get(2)); // Output: null
        System.out.println(cache.get(3)); // Output: three
    }
}
