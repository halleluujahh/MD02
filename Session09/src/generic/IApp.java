package ra.generic;

import java.util.List;

public interface IApp<T> {
    //CRUD: Create - Read - Update - Delete
    List<T> read();
    boolean create(T t);
    boolean update(T t);
    boolean delete(T t);
}
