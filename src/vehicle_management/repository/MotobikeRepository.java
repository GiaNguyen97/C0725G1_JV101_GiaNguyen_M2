package vehicle_management.repository;

import vehicle_management.entity.Motorbike;

public class MotobikeRepository implements IMotobikeRepository {
    private static Motorbike[] motorbikes = new Motorbike[100];

    static {
        motorbikes[0] = new Motorbike("43-K1-678.56", "Yamaha", (short) 2019, "Nguyễn Văn A", (short) 100);
        motorbikes[1] = new Motorbike("43-H1-345.89", "Honda", (short) 2019, "Nguyễn Văn B", (short) 150);
        motorbikes[2] = new Motorbike("43-AK-765.23", "Yamaha", (short) 2019, "Nguyễn Văn C", (short) 50);
    }

    @Override
    public void add(Motorbike motorbike) {
        for (int i = 0; i < motorbikes.length; i++) {
            if (motorbikes[i] == null) {
                motorbikes[i] = motorbike;
                break;
            }
        }
    }

    @Override
    public Motorbike[] findAll() {
        return motorbikes;
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
