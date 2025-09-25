package vehicle_management_Array.service;

import vehicle_management_Array.entity.Motorbike;

public interface IMotobikeService {
    void add(Motorbike motorbike);

    Motorbike[] findAll();

    void editByVehiclePlate(String vehiclePlate);

    Motorbike findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
