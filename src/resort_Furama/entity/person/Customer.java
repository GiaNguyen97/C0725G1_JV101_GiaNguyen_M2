package resort_Furama.entity.person;

import java.time.LocalDate;

public class Customer extends Person {
    private String idOfCustomer;
    private String typeOfCustomer;
    private String addressOfCustomer;

    public Customer() {
    }

    public Customer(String nameOfPerson, LocalDate dayOfBirth, String gender, String idCardNumber, String phoneNumber, String email, String idOfCustomer, String typeOfCustomer, String addressOfCustomer) {
        super(nameOfPerson, dayOfBirth, gender, idCardNumber, phoneNumber, email);
        this.idOfCustomer = idOfCustomer;
        this.typeOfCustomer = typeOfCustomer;
        this.addressOfCustomer = addressOfCustomer;
    }

    public String getIdOfCustomer() {
        return idOfCustomer;
    }

    public void setIdOfCustomer(String idOfCustomer) {
        this.idOfCustomer = idOfCustomer;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddressOfCustomer() {
        return addressOfCustomer;
    }

    public void setAddressOfCustomer(String addressOfCustomer) {
        this.addressOfCustomer = addressOfCustomer;
    }

    @Override
    public String toString() {
        return "Customer{"+idOfCustomer+", "+super.toString()+typeOfCustomer+", "+addressOfCustomer+"}";
    }

    @Override
    public String getInforToCSV() {
        return idOfCustomer+","+super.getInforToCSV()+","+typeOfCustomer+","+addressOfCustomer;
    }
}
