package vehicle_management.repository;

import vehicle_management.entity.Truck;

public class TruckRepository implements ITruckRepository {
    private static Truck[] trucks = new Truck[100];

    static {
        trucks[0] = new Truck("43C-012.34", "Huyndai", (short) 2019, "Nguyễn Văn A", (short) 3);
        trucks[1] = new Truck("43C-47.678", "Dongfeng", (short) 2020, "Nguyễn Văn B", (short) 9);
        trucks[2] = new Truck("43C-45.235", "Hino", (short) 2021, "Nguyễn Văn C", (short) 12);
    }

    @Override
    public void add(Truck truck) {
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i] == null) {
                trucks[i] = truck;
                break;
            }
        }
    }

    @Override
    public Truck[] findAll() {
        return trucks;
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
