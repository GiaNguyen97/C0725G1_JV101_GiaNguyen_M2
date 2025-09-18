package vehicle_management.repository;

import vehicle_management.entity.Motorbike;

public interface IMotobikeRepository {
    void add(Motorbike motorbike);

    Motorbike[] findAll();

    void editByVehiclePlate(String vehiclePlate);

    Motorbike findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
