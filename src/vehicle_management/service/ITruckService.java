package vehicle_management.service;

import vehicle_management.entity.Truck;

public interface ITruckService {
    void add(Truck truck);

    Truck[] findAll();

    void editByVehiclePlate(String vehiclePlate);

    Truck findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
