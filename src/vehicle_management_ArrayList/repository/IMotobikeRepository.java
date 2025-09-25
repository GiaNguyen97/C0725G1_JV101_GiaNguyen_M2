package vehicle_management_ArrayList.repository;

import vehicle_management_ArrayList.entity.Motorbike;

import java.util.List;

public interface IMotobikeRepository {
    void add(Motorbike motorbike);

    List<Motorbike> findAll();

    void editByVehiclePlate(String vehiclePlate);

    Motorbike findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
