package services;

import java.util.List;

public interface FindByUsername<T> {
    List<T> findByUsername(String userName);
}
