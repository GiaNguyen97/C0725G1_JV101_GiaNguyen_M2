package vehicle_management.service;

import vehicle_management.entity.Car;

public interface ICarService {
    void add(Car car);

    Car[] findAll();

    void editByVehiclePlate(String vehiclePlate);

    Car findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
