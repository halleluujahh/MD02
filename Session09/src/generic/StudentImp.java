package ra.generic;

import java.util.List;

public class StudentImp implements IApp<Student> {
    @Override
    public List<Student> read() {
        return null;
    }

    @Override
    public boolean create(Student student) {
        return false;
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public boolean delete(Student student) {
        return false;
    }


}
