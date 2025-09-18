package vehicle_management.service;

import vehicle_management.entity.Motorbike;
import vehicle_management.repository.IMotobikeRepository;
import vehicle_management.repository.MotobikeRepository;

public class MotobikeService implements IMotobikeService {
    private IMotobikeRepository motobikeRepository = new MotobikeRepository();

    @Override
    public void add(Motorbike motorbike) {
        motobikeRepository.add(motorbike);
    }

    @Override
    public Motorbike[] findAll() {
        return motobikeRepository.findAll();
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
