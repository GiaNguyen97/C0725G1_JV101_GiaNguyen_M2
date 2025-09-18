package vehicle_management.repository;


import vehicle_management.entity.Motorbike;

import java.util.Scanner;

public class MotobikeRepository implements IMotobikeRepository {
    private static final Motorbike[] motorbikes = new Motorbike[100];

    static {
        motorbikes[0] = new Motorbike("43-K1-678.56", "Yamaha", (short) 2019, "Nguyễn Văn A", (short) 100);
        motorbikes[1] = new Motorbike("43-H1-345.89", "Honda", (short) 2019, "Nguyễn Văn B", (short) 150);
        motorbikes[2] = new Motorbike("43-AK-765.23", "Yamaha", (short) 2019, "Nguyễn Văn C", (short) 50);
    }

    @Override
    public Motorbike[] findAll() {
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
                motorbike.setManufacturerOfVehicle(manufacturerOfVehicle);
                motorbike.setManufacturingDateOfVehicle(manufacturingDateOfVehicle);
                motorbike.setVehicleOwner(vehicleOwner);
                motorbike.setEnginePowerofMotobike(enginePowerofMotobike);
                break;
            }
        }

    }

    @Override
    public Motorbike findByVehiclePlate(String vehiclePlate) {
        byte i;
        for (i = 0; i < motorbikes.length; i++) {
            if (motorbikes[i].getVehiclePlate().equals(vehiclePlate)) {
                break;
            }
        }
        return motorbikes[i];
    }

    @Override
    public boolean checkVehiclePlate(String vehiclePlate) {
        if (vehiclePlate == null) {
            return false;
        }
        for (Motorbike motorbike : motorbikes) {
            if (motorbike != null && vehiclePlate.equals(motorbike.getVehiclePlate())) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void deleteByVehiclePlate(String vehiclePlate) {
        for (byte i=0; i<motorbikes.length; i++) {
            if (motorbikes[i].getVehiclePlate().equals(vehiclePlate)) {
                for (byte j = i; j<motorbikes.length; j++){
                    boolean isNoNull = true;
                    if (motorbikes[i+1]!=null) {
                        motorbikes[i].setManufacturerOfVehicle(motorbikes[i+1].getManufacturerOfVehicle());
                        motorbikes[i].setEnginePowerofMotobike(motorbikes[i+1].getEnginePowerofMotobike());
                        motorbikes[i].setVehicleOwner(motorbikes[i+1].getVehicleOwner());
                        motorbikes[i].setManufacturerOfVehicle(motorbikes[i+1].getManufacturerOfVehicle());
                    } else {
                        motorbikes[i] = null;
                        isNoNull = false;
                    }
                    if (isNoNull) {
                        motorbikes[motorbikes.length-1] = null;
                    }
                }
                break;
            }
        }
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
}
