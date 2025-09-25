package vehicle_management_ArrayList.repository;


import vehicle_management_ArrayList.entity.Truck;

import java.util.List;

public interface ITruckRepository {
    void add(Truck truck);

    List<Truck> findAll();

    void editByVehiclePlate(String vehiclePlate);

    Truck findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
