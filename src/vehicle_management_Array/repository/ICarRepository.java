package vehicle_management_Array.repository;

import vehicle_management_Array.entity.Car;

public interface ICarRepository {
    void add(Car car);

    Car[] findAll();

    void editByVehiclePlate(String vehiclePlate);

    Car findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
