import java.util.HashMap;

public class Book<K,V> extends BookDetails<K,V>{
    public Book() {

    }

    public Book(K key, V value) {
        super(key, value);
    }
}
