package vehicle_management.service;

import vehicle_management.entity.Motorbike;

public interface IMotobikeService {
    void add(Motorbike motorbike);

    Motorbike[] findAll();

    void edit(String vehiclePlate);

    void find(String vehiclePlate);

    boolean deleteByVehiclePlate(String vehiclePlate);
}
