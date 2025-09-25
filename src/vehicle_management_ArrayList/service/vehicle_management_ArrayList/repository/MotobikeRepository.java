package vehicle_management_ArrayList.service.vehicle_management_ArrayList.repository;

import vehicle_management_ArrayList.service.vehicle_management_ArrayList.entity.Motorbike;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotobikeRepository implements IMotobikeRepository {
    private static final List<Motorbike> motorbikes = new ArrayList<>();

    static {
        motorbikes.add(new Motorbike("43-K1-678.56", "Yamaha", (short) 2019, "Nguyễn Văn A", (short) 100));
        motorbikes.add(new Motorbike("43-H1-345.89", "Honda", (short) 2019, "Nguyễn Văn B", (short) 150));
        motorbikes.add(new Motorbike("43-AK-765.23", "Yamaha", (short) 2019, "Nguyễn Văn C", (short) 50));
    }

    @Override
    public List<Motorbike> findAll() {
        return motorbikes;
    }

    @Override
    public void editByVehiclePlate(String vehiclePlate) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên hãng sản xuất: ");
        String manufacturerOfVehicle = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        short manufacturingDateOfVehicle = Short.parseShort(scanner.nextLine());
        System.out.print("Nhập tên chủ sở hữu: ");
        String vehicleOwner = scanner.nextLine();
        System.out.print("Nhập công suất: ");
        short enginePowerofMotobike = Short.parseShort(scanner.nextLine());

        for (Motorbike motorbike : motorbikes) {
            if (motorbike.getVehiclePlate().equals(vehiclePlate)) {
                System.out.println("Sửa " + motorbike + " thành " +
                        new Motorbike(vehiclePlate, manufacturerOfVehicle,
                                manufacturingDateOfVehicle, vehicleOwner, enginePowerofMotobike));
                if (confirm()) {
                    motorbike.setManufacturerOfVehicle(manufacturerOfVehicle);
                    motorbike.setManufacturingDateOfVehicle(manufacturingDateOfVehicle);
                    motorbike.setVehicleOwner(vehicleOwner);
                    motorbike.setEnginePowerofMotobike(enginePowerofMotobike);
                    System.out.println("Đã sửa thành công!");
                }
                break;
            }
        }
    }

    @Override
    public Motorbike findByVehiclePlate(String vehiclePlate) {
        for (Motorbike motorbike : motorbikes) {
            if (motorbike.getVehiclePlate().equals(vehiclePlate)) {
                return motorbike;
            }
        }
        return null;
    }

    @Override
    public boolean checkVehiclePlate(String vehiclePlate) {
        if (vehiclePlate == null) return false;
        for (Motorbike motorbike : motorbikes) {
            if (vehiclePlate.equals(motorbike.getVehiclePlate())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteByVehiclePlate(String vehiclePlate) {
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i).getVehiclePlate().equals(vehiclePlate)) {
                System.out.println("Xóa " + motorbikes.get(i));
                if (confirm()) {
                    motorbikes.remove(i);
                    System.out.println("Đã xóa thành công!");
                }
                break;
            }
        }
    }

    @Override
    public void add(Motorbike motorbike) {
        motorbikes.add(motorbike);
    }

    public boolean confirm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xác nhận thực hiện thao tác này: 1.Có 2.Không");
        byte choice = Byte.parseByte(scanner.nextLine());
        return choice == 1;
    }
}
