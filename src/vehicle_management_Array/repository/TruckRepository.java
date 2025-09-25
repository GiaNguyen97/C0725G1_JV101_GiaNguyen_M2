package vehicle_management_Array.repository;


import vehicle_management_Array.entity.Truck;

import java.util.Scanner;

public class TruckRepository implements ITruckRepository {
    private static final Truck[] trucks = new Truck[100];

    static {
        trucks[0] = new Truck("43C-012.34", "Huyndai", (short) 2019, "Nguyễn Văn A", (short) 3);
        trucks[1] = new Truck("43C-476.78", "Dongfeng", (short) 2020, "Nguyễn Văn B", (short) 9);
        trucks[2] = new Truck("43C-452.35", "Hino", (short) 2021, "Nguyễn Văn C", (short) 12);
    }

    public Truck[] findAll() {
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
        System.out.print("Nhập công suất: ");
        short grossTruckWeight = Short.parseShort(scanner.nextLine());


        for (Truck truck : trucks) {
            if (truck != null && truck.getVehiclePlate().equals(vehiclePlate)) {
                System.out.println("Sửa " + truck + " thành " + new Truck(vehiclePlate, manufacturerOfVehicle, manufacturingDateOfVehicle, vehicleOwner, grossTruckWeight));
                if (confirm()) {
                    truck.setManufacturerOfVehicle(manufacturerOfVehicle);
                    truck.setManufacturingDateOfVehicle(manufacturingDateOfVehicle);
                    truck.setVehicleOwner(vehicleOwner);
                    truck.setGrossTruckWeight(grossTruckWeight);
                    System.out.println("Đã sửa thành công!");
                    break;
                } else {
                    break;
                }
            }
        }

    }

    @Override
    public Truck findByVehiclePlate(String vehiclePlate) {
        for (Truck truck : trucks) {
            if (truck != null && truck.getVehiclePlate().equals(vehiclePlate)) {
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
            if (truck != null && vehiclePlate.equals(truck.getVehiclePlate())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteByVehiclePlate(String vehiclePlate) {
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i] != null && trucks[i].getVehiclePlate().equals(vehiclePlate)) {

                System.out.println("Xóa " + trucks[i]);
                if (confirm()) {
                    for (int j = i; j < trucks.length - 1; j++) {
                        if (trucks[j + 1] != null) {
                            trucks[j] = trucks[j + 1];
                        } else {
                            trucks[j] = null;
                            break;
                        }
                    }
                    System.out.println("Đã xóa " + trucks[i] + "thành công!");
                }
                break;
            }
        }
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

    public boolean confirm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xác nhận thực hiện thao tác này: 1.Có 2.Không");
        byte choice = Byte.parseByte(scanner.nextLine());
        return choice == 1;
    }
}
