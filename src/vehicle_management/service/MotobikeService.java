package vehicle_management.service;

import vehicle_management.entity.Motorbike;
import vehicle_management.repository.IMotobikeRepository;
import vehicle_management.repository.MotobikeRepository;

public class MotobikeService implements IMotobikeService {
    private final IMotobikeRepository motobikeRepository = new MotobikeRepository();

    @Override
    public void add(Motorbike motorbike) {
        motobikeRepository.add(motorbike);
    }

    @Override
    public Motorbike[] findAll() {
        return motobikeRepository.findAll();
    }

    @Override
    public void editByVehiclePlate(String vehiclePlate) {
        motobikeRepository.editByVehiclePlate(vehiclePlate);
    }

    @Override
    public Motorbike findByVehiclePlate(String vehiclePlate) {
        return motobikeRepository.findByVehiclePlate(vehiclePlate);
    }

    @Override
    public boolean checkVehiclePlate(String vehiclePlate) {
        return motobikeRepository.checkVehiclePlate(vehiclePlate);
    }

    @Override
    public void deleteByVehiclePlate(String vehiclePlate) {
        motobikeRepository.deleteByVehiclePlate(vehiclePlate);
    }
}
