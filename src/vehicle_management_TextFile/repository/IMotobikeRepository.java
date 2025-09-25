package vehicle_management_TextFile.repository;

import vehicle_management_TextFile.entity.Motorbike;

import java.util.List;

public interface IMotobikeRepository {
    void add(Motorbike motorbike);

    List<Motorbike> findAll();

    void editByVehiclePlate(String vehiclePlate);

    Motorbike findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
