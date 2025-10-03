package resort_Furama.controller;

import java.util.Scanner;

public class FuramaController {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        boolean isExit = false;
        do {
            System.out.print("""
                    
                    ********* Furama *********
                    1.	Employee Management
                    2.	Customer Management
                    3.	Facility Management
                    4.	Booking Management
                    5.	Promotion Management
                    6.	Exit
                    Select a function:\s""");
            try {
                byte select = Byte.parseByte(scanner.nextLine());
                switch (select) {
                    case 1 -> employeeManagement();
                    case 2 -> customerManagement();
                    case 3 -> facilityManagement();
                    case 4 -> bookingManagerment();
                    case 5 -> promotionManagement();
                    case 6 -> isExit = true;
                    default -> System.out.println("Invalid function selection. Please try again!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input must be a number. Please try again!");
            }

        } while (!isExit);
    }

    private static void employeeManagement() {
        boolean isReturn = false;
        do {
            System.out.print("""
                    
                    ----- Employee Management -----
                    1.	Display list employees
                    2.	Add new employee
                    3.	Edit employee
                    4.	Return main menu
                    Select a function:\s""");
            try {
                byte select = Byte.parseByte(scanner.nextLine());
                switch (select) {
                    case 1 -> {
                        System.out.println("Display list employees");
                        System.out.println("Chưa phát triển");
                    }
                    case 2 -> {
                        System.out.println("Add new employee");
                        System.out.println("Chưa phát triển");
                    }
                    case 3 -> {
                        System.out.println("Edit employee");
                        System.out.println("Chưa phát triển");
                    }
                    case 4 -> isReturn = true;
                    default -> System.out.println("Invalid function selection. Please try again!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input must be a number. Please try again!");
            }
        } while (!isReturn);
    }

    private static void customerManagement() {
        boolean isReturn = false;
        do {
            System.out.print("""
                    
                    ----- Customer Management -----
                    1.	Display list customers
                    2.	Add new customer
                    3.	Edit customer
                    4.	Return main menu
                    Select a function:\s""");
            try {
                byte select = Byte.parseByte(scanner.nextLine());
                switch (select) {
                    case 1 -> {
                        System.out.println("Display list customers");
                        System.out.println("Chưa phát triển");
                    }
                    case 2 -> {
                        System.out.println("Add new customer");
                        System.out.println("Chưa phát triển");
                    }
                    case 3 -> {
                        System.out.println("Edit customer");
                        System.out.println("Chưa phát triển");
                    }
                    case 4 -> isReturn = true;
                    default -> System.out.println("Invalid function selection. Please try again!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input must be a number. Please try again!");
            }
        } while (!isReturn);
    }

    private static void facilityManagement() {
        boolean isReturn = false;
        do {
            System.out.print("""
                    
                    -------- Facility Management --------
                    1.	Display list facility
                    2.	Add new facility
                    3.	Display list facility maintenance
                    4.	Return main menu
                    Select a function:\s""");
            try {
                byte select = Byte.parseByte(scanner.nextLine());
                switch (select) {
                    case 1 -> {
                        System.out.println("Display list facility");
                        System.out.println("Chưa phát triển");
                    }
                    case 2 -> {
                        System.out.println("Add new facility");
                        System.out.println("Chưa phát triển");
                    }
                    case 3 -> {
                        System.out.println("Display list facility maintenance");
                        System.out.println("Chưa phát triển");
                    }
                    case 4 -> isReturn = true;
                    default -> System.out.println("Invalid function selection. Please try again!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input must be a number. Please try again!");
            }
        } while (!isReturn);
    }

    private static void bookingManagerment() {
        boolean isReturn = false;
        do {
            System.out.print("""
                    
                    -------- Booking Managerment --------
                    1.	Add new booking
                    2.	Display list booking
                    3.	Create new contracts
                    4.	Display list contracts
                    5.	Edit contracts
                    6.	Return main menu
                    Select a function:\s""");
            try {
                byte select = Byte.parseByte(scanner.nextLine());
                switch (select) {
                    case 1 -> {
                        System.out.println("Add new booking");
                        System.out.println("Chưa phát triển");
                    }
                    case 2 -> {
                        System.out.println("Display list booking");
                        System.out.println("Chưa phát triển");
                    }
                    case 3 -> {
                        System.out.println("Create new contracts");
                        System.out.println("Chưa phát triển");
                    }
                    case 4 -> {
                        System.out.println("Display list contracts");
                        System.out.println("Chưa phát triển");
                    }
                    case 5 -> {
                        System.out.println("Edit contracts");
                        System.out.println("Chưa phát triển");
                    }
                    case 6 -> isReturn = true;
                    default -> System.out.println("Invalid function selection. Please try again!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input must be a number. Please try again!");
            }
        } while (!isReturn);
    }

    private static void promotionManagement() {
        boolean isReturn = false;
        do {
            System.out.print("""
                    
                    -------- Promotion Management --------
                    1.	Display list customers use service
                    2.	Display list customers get voucher
                    3.	Return main menu
                    Select a function:\s""");
            try {
                byte select = Byte.parseByte(scanner.nextLine());
                switch (select) {
                    case 1 -> {
                        System.out.println("Display list customers use service");
                        System.out.println("Chưa phát triển");
                    }
                    case 2 -> {
                        System.out.println("Display list customers get voucher");
                        System.out.println("Chưa phát triển");
                    }
                    case 3 -> isReturn = true;
                    default -> System.out.println("Invalid function selection. Please try again!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input must be a number. Please try again!");
            }
        } while (!isReturn);
    }
}
