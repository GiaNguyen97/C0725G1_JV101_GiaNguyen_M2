package vehicle_management_TextFile.repository;

import vehicle_management_TextFile.entity.Car;

import java.util.List;

public interface ICarRepository {
    void add(Car car);

    List<Car> findAll();

    void editByVehiclePlate(String vehiclePlate);

    Car findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);

}
