package ss10_DSA_list.bai_tap.vehicle_management_ArrayList.service;

import ss10_DSA_list.bai_tap.vehicle_management_ArrayList.entity.Motorbike;
import ss10_DSA_list.bai_tap.vehicle_management_ArrayList.repository.IMotobikeRepository;
import ss10_DSA_list.bai_tap.vehicle_management_ArrayList.repository.MotobikeRepository;

import java.util.List;

public class MotobikeService implements IMotobikeService {
    private final IMotobikeRepository motobikeRepository = new MotobikeRepository();

    @Override
    public void add(Motorbike motorbike) {
        motobikeRepository.add(motorbike);
    }

    @Override
    public List<Motorbike> findAll() {
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
