package nordicmotorhomes.project.Repositories;

import java.util.ArrayList;

public interface ICrudRepository <T>{

    ArrayList<T> readAll();
    T read(int id);
    void create(T obj);
    void update(T obj);
    void delete(T obj);

}