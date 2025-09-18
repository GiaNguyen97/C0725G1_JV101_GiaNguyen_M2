package vehicle_management.repository;


import vehicle_management.entity.Truck;

public interface ITruckRepository {
    void add(Truck truck);

    Truck[] findAll();

    void editByVehiclePlate(String vehiclePlate);

    Truck findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
