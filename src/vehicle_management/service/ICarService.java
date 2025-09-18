package vehicle_management.service;

import vehicle_management.entity.Car;

public interface ICarService {
    void add(Car car);

    Car[] findAll();

    void edit(String vehiclePlate);

    void find(String vehiclePlate);

    boolean deleteByVehiclePlate(String vehiclePlate);
}
