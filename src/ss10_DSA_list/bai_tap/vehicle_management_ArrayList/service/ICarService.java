package ss10_DSA_list.bai_tap.vehicle_management_ArrayList.service;

import ss10_DSA_list.bai_tap.vehicle_management_ArrayList.entity.Car;

import java.util.List;

public interface ICarService {
    void add(Car car);

    List<Car> findAll();

    void editByVehiclePlate(String vehiclePlate);

    Car findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
