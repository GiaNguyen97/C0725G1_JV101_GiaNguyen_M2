package vehicle_management.service;

import vehicle_management.entity.Truck;
import vehicle_management.repository.ITruckRepository;
import vehicle_management.repository.TruckRepository;

public class TruckService implements ITruckService {
    private ITruckRepository truckRepository = new TruckRepository();
    @Override
    public void add(Truck truck) {
truckRepository.add(truck);
    }

    @Override
    public Truck[] findAll() {
        return truckRepository.findAll();
    }

    @Override
    public void edit(String vehiclePlate) {

    }

    @Override
    public void find(String vehiclePlate) {

    }

    @Override
    public boolean deleteByVehiclePlate(String vehiclePlate) {
        return false;
    }
}
