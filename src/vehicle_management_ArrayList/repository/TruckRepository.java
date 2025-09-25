package vehicle_management_ArrayList.repository;

import vehicle_management_ArrayList.entity.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckRepository implements ITruckRepository {

    private static final List<Truck> trucks = new ArrayList<>();

    static {
        trucks.add(new Truck("43C-012.34", "Huyndai", (short) 2019, "Nguyễn Văn A", (short) 3));
        trucks.add(new Truck("43C-476.78", "Dongfeng", (short) 2020, "Nguyễn Văn B", (short) 9));
        trucks.add(new Truck("43C-452.35", "Hino", (short) 2021, "Nguyễn Văn C", (short) 12));
    }

    @Override
    public List<Truck> findAll() {
        return trucks;
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
        System.out.print("Nhập tải trọng (tấn): ");
        short grossTruckWeight = Short.parseShort(scanner.nextLine());

        for (Truck truck : trucks) {
            if (truck.getVehiclePlate().equals(vehiclePlate)) {
                System.out.println("Sửa " + truck + " thành " +
                        new Truck(vehiclePlate, manufacturerOfVehicle, manufacturingDateOfVehicle, vehicleOwner, grossTruckWeight));
                if (confirm()) {
                    truck.setManufacturerOfVehicle(manufacturerOfVehicle);
                    truck.setManufacturingDateOfVehicle(manufacturingDateOfVehicle);
                    truck.setVehicleOwner(vehicleOwner);
                    truck.setGrossTruckWeight(grossTruckWeight);
                    System.out.println("Đã sửa thành công!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy xe tải có biển số: " + vehiclePlate);
    }

    @Override
    public Truck findByVehiclePlate(String vehiclePlate) {
        for (Truck truck : trucks) {
            if (truck.getVehiclePlate().equals(vehiclePlate)) {
                return truck;
            }
        }
        return null;
    }

    @Override
    public boolean checkVehiclePlate(String vehiclePlate) {
        if (vehiclePlate == null) {
            return false;
        }
        for (Truck truck : trucks) {
            if (vehiclePlate.equals(truck.getVehiclePlate())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteByVehiclePlate(String vehiclePlate) {
        for (Truck truck : trucks) {
            if (truck.getVehiclePlate().equals(vehiclePlate)) {
                System.out.println("Xóa " + truck);
                if (confirm()) {
                    trucks.remove(truck);
                    System.out.println("Đã xóa " + truck + " thành công!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy xe tải có biển số: " + vehiclePlate);
    }

    @Override
    public void add(Truck truck) {
        trucks.add(truck);
    }

    public boolean confirm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xác nhận thực hiện thao tác này: 1.Có  2.Không");
        byte choice = Byte.parseByte(scanner.nextLine());
        return choice == 1;
    }
}
