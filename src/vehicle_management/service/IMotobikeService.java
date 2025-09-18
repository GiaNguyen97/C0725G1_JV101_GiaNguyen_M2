package vehicle_management.service;

import vehicle_management.entity.Motorbike;

public interface IMotobikeService {
    void add(Motorbike motorbike);

    Motorbike[] findAll();

    void editByVehiclePlate(String vehiclePlate);

    Motorbike findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
