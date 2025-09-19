package ss10_DSA_list.bai_tap.vehicle_management_ArrayList.service;

import ss10_DSA_list.bai_tap.vehicle_management_ArrayList.entity.Motorbike;
import ss10_DSA_list.bai_tap.vehicle_management_ArrayList.entity.Truck;

import java.util.List;

public interface ITruckService {
    void add(Truck truck);

    List<Truck> findAll();

    void editByVehiclePlate(String vehiclePlate);

    Truck findByVehiclePlate(String vehiclePlate);

    boolean checkVehiclePlate(String vehiclePlate);

    void deleteByVehiclePlate(String vehiclePlate);
}
