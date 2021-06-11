package services;

import java.util.List;

public interface FindByLicensePlate<T> {
    List<T> findByLicensePlate(String licensePlate);
}
