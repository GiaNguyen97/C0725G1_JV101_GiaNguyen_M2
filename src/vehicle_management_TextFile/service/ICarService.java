package vehicle_management_TextFile.service;

import vehicle_management_TextFile.entity.Car;

import java.util.List;

public interface ICarService {
    void add(Car car);

    List<Car> findAll();

    void editByVehiclePlate(String vehiclePlate);

    Car findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
