package vehicle_management_Array.repository;


import vehicle_management_Array.entity.Motorbike;

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
            if (motorbike != null && motorbike.getVehiclePlate().equals(vehiclePlate)) {
                System.out.println("Sửa " + motorbike + " thành " + new Motorbike(vehiclePlate, manufacturerOfVehicle, manufacturingDateOfVehicle, vehicleOwner, enginePowerofMotobike));
                if (confirm()) {
                    motorbike.setManufacturerOfVehicle(manufacturerOfVehicle);
                    motorbike.setManufacturingDateOfVehicle(manufacturingDateOfVehicle);
                    motorbike.setVehicleOwner(vehicleOwner);
                    motorbike.setEnginePowerofMotobike(enginePowerofMotobike);
                    System.out.println("Đã sửa thành công!");
                    break;
                } else {
                    break;
                }
            }
        }

    }

    @Override
    public Motorbike findByVehiclePlate(String vehiclePlate) {
        for (Motorbike motorbike : motorbikes) {
            if (motorbike != null && motorbike.getVehiclePlate().equals(vehiclePlate)) {
                return motorbike;
            }
        }
        return null;
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
        for (int i = 0; i < motorbikes.length; i++) {
            if (motorbikes[i] != null && motorbikes[i].getVehiclePlate().equals(vehiclePlate)) {
                System.out.println("Xóa " + motorbikes[i]);
                if (confirm()) {
                    for (int j = i; j < motorbikes.length - 1; j++) {
                        if (motorbikes[j + 1] != null) {
                            motorbikes[j] = motorbikes[j + 1];
                        } else {
                            motorbikes[j] = null;
                            break;
                        }
                    }
                    System.out.println("Đã xóa " + motorbikes[i] + "thành công!");
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

    public boolean confirm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xác nhận thực hiện thao tác này: 1.Có 2.Không");
        byte choice = Byte.parseByte(scanner.nextLine());
        return choice == 1;
    }
}
