package vehicle_management.repository;


import vehicle_management.entity.Truck;

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
            if (truck.getVehiclePlate().equals(vehiclePlate)) {
                truck.setManufacturerOfVehicle(manufacturerOfVehicle);
                truck.setManufacturingDateOfVehicle(manufacturingDateOfVehicle);
                truck.setVehicleOwner(vehicleOwner);
                truck.setGrossTruckWeight(grossTruckWeight);
                break;
            }
        }

    }

    @Override
    public Truck findByVehiclePlate(String vehiclePlate) {
        byte i;
        for (i = 0; i < trucks.length; i++) {
            if (trucks[i].getVehiclePlate().equals(vehiclePlate)) {
                break;
            }
        }
        return trucks[i];
    }

    @Override
    public boolean checkVehiclePlate(String vehiclePlate) {
        boolean ischeckVehiclePlate = false;
        for (Truck truck : trucks) {
            if (truck.getVehiclePlate().equals(vehiclePlate)) {
                ischeckVehiclePlate = true;
                break;
            }
        }
        return ischeckVehiclePlate;
    }

    @Override
    public void deleteByVehiclePlate(String vehiclePlate) {
        for (byte i=0; i<trucks.length; i++) {
            if (trucks[i].getVehiclePlate().equals(vehiclePlate)) {
                for (byte j = i; j<trucks.length; j++){
                    boolean isNoNull = true;
                    if (trucks[i+1]!=null) {
                        trucks[i].setManufacturerOfVehicle(trucks[i+1].getManufacturerOfVehicle());
                        trucks[i].setGrossTruckWeight(trucks[i+1].getGrossTruckWeight());
                        trucks[i].setVehicleOwner(trucks[i+1].getVehicleOwner());
                        trucks[i].setManufacturerOfVehicle(trucks[i+1].getManufacturerOfVehicle());
                    } else {
                        trucks[i] = null;
                        isNoNull = false;
                    }
                    if (isNoNull) {
                        trucks[trucks.length-1] = null;
                    }
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
}
