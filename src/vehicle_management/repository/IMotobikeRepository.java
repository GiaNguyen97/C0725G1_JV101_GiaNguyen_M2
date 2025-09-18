package vehicle_management.repository;

import vehicle_management.entity.Motorbike;

public interface IMotobikeRepository {
    void add(Motorbike motorbike);

    Motorbike[] findAll();

    void edit(String vehiclePlate);

    void find(String vehiclePlate);

    boolean deleteByVehiclePlate(String vehiclePlate);
}
