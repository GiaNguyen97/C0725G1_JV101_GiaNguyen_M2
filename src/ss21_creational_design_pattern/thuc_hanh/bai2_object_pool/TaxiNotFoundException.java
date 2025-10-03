package ss21_creational_design_pattern.thuc_hanh.bai2_object_pool;

public class TaxiNotFoundException extends RuntimeException {

    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}