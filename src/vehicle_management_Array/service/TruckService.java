package vehicle_management_Array.service;

import vehicle_management_Array.entity.Truck;
import vehicle_management_Array.repository.ITruckRepository;
import vehicle_management_Array.repository.TruckRepository;

public class TruckService implements ITruckService {
    private final ITruckRepository truckRepository = new TruckRepository();

    @Override
    public void add(Truck truck) {
        truckRepository.add(truck);
    }

    @Override
    public Truck[] findAll() {
        return truckRepository.findAll();
    }

    @Override
    public void editByVehiclePlate(String vehiclePlate) {
        truckRepository.editByVehiclePlate(vehiclePlate);
    }

    @Override
    public Truck findByVehiclePlate(String vehiclePlate) {
        return truckRepository.findByVehiclePlate(vehiclePlate);
    }

    @Override
    public boolean checkVehiclePlate(String vehiclePlate) {
        return truckRepository.checkVehiclePlate(vehiclePlate);
    }

    @Override
    public void deleteByVehiclePlate(String vehiclePlate) {
        truckRepository.deleteByVehiclePlate(vehiclePlate);
    }
}
