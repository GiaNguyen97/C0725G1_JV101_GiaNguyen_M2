package vehicle_management.repository;

import vehicle_management.entity.Car;

public interface ICarRepository {
    void add(Car car);

    Car[] findAll();

    void edit(String vehiclePlate);

    void find(String vehiclePlate);

    boolean deleteByVehiclePlate(String vehiclePlate);
}
