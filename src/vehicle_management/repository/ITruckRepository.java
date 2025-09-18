package vehicle_management.repository;


import vehicle_management.entity.Truck;

public interface ITruckRepository {
    void add(Truck truck);

    Truck[] findAll();

    void edit(String vehiclePlate);

    void find(String vehiclePlate);

    boolean deleteByVehiclePlate(String vehiclePlate);
}
