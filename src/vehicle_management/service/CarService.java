package vehicle_management.service;

import vehicle_management.entity.Car;
import vehicle_management.repository.CarRepository;
import vehicle_management.repository.ICarRepository;

public class CarService implements ICarService {
    private ICarRepository carRepository = new CarRepository();

    @Override
    public void add(Car car) {
        carRepository.add(car);
    }

    @Override
    public Car[] findAll() {
        return carRepository.findAll();
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
