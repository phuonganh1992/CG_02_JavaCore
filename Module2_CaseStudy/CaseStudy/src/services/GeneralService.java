package services;

import java.util.List;

public interface GeneralService<T> {
    void create(T t);
    void delete(int id);
    void update(int id, T t);
    T findById(int id);
//    List<T> findByName(String name);
    List<T> findAll();
    void display();
}
