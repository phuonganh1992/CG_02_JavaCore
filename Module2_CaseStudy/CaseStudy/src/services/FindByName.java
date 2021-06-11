package services;

import java.util.List;

public interface FindByName<T> {
    List<T> findByName(String name);
}
