package vehicle_management_TextFile.service.vehicle_management_ArrayList.service;

import vehicle_management_TextFile.service.vehicle_management_ArrayList.entity.Car;
import vehicle_management_TextFile.service.vehicle_management_ArrayList.repository.CarRepository;
import vehicle_management_TextFile.service.vehicle_management_ArrayList.repository.ICarRepository;

import java.util.List;

public class CarService implements ICarService {
    private final ICarRepository carRepository = new CarRepository();

    @Override
    public void add(Car car) {
        carRepository.add(car);
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void editByVehiclePlate(String vehiclePlate) {
        carRepository.editByVehiclePlate(vehiclePlate);
    }

    @Override
    public Car findByVehiclePlate(String vehiclePlate) {
        return carRepository.findByVehiclePlate(vehiclePlate);
    }

    @Override
    public boolean checkVehiclePlate(String vehiclePlate) {
        return carRepository.checkVehiclePlate(vehiclePlate);
    }

    @Override
    public void deleteByVehiclePlate(String vehiclePlate) {
       carRepository.deleteByVehiclePlate(vehiclePlate);
    }
}
