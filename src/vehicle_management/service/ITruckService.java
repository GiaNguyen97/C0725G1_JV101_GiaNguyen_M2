package vehicle_management.service;

import vehicle_management.entity.Truck;

public interface ITruckService {
    void add(Truck truck);

    Truck[] findAll();

    void edit(String vehiclePlate);

    void find(String vehiclePlate);

    boolean deleteByVehiclePlate(String vehiclePlate);
}
