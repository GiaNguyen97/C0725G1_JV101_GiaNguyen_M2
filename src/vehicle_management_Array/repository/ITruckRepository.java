package vehicle_management_Array.repository;


import vehicle_management_Array.entity.Truck;

public interface ITruckRepository {
    void add(Truck truck);

    Truck[] findAll();

    void editByVehiclePlate(String vehiclePlate);

    Truck findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
