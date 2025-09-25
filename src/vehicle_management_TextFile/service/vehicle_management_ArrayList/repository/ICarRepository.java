package vehicle_management_TextFile.service.vehicle_management_ArrayList.repository;

import vehicle_management_TextFile.service.vehicle_management_ArrayList.entity.Car;

import java.util.List;

public interface ICarRepository {
    void add(Car car);

    List<Car> findAll();

    void editByVehiclePlate(String vehiclePlate);

    Car findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
