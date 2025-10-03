package resort_Furama.entity;

import java.time.LocalDate;


public class Booking {
    private String idBooking;
    private String dayBooking;
    private LocalDate dayStartBooking;
    private LocalDate dayEndBooking;
    private String idOfCustomer;
    private String idService;

    public Booking() {
    }

    public Booking(String idBooking, String dayBooking, LocalDate dayStartBooking, LocalDate dayEndBooking, String idOfCustomer, String idService) {
        this.idBooking = idBooking;
        this.dayBooking = dayBooking;
        this.dayStartBooking = dayStartBooking;
        this.dayEndBooking = dayEndBooking;
        this.idOfCustomer = idOfCustomer;
        this.idService = idService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDayBooking() {
        return dayBooking;
    }

    public void setDayBooking(String dayBooking) {
        this.dayBooking = dayBooking;
    }

    public LocalDate getDayStartBooking() {
        return dayStartBooking;
    }

    public void setDayStartBooking(LocalDate dayStartBooking) {
        this.dayStartBooking = dayStartBooking;
    }

    public LocalDate getDayEndBooking() {
        return dayEndBooking;
    }

    public void setDayEndBooking(LocalDate dayEndBooking) {
        this.dayEndBooking = dayEndBooking;
    }

    public String getIdOfCustomer() {
        return idOfCustomer;
    }

    public void setIdOfCustomer(String idOfCustomer) {
        this.idOfCustomer = idOfCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", dayBooking=" + dayBooking +
                ", dayStartBooking=" + dayStartBooking +
                ", dayEndBooking=" + dayEndBooking +
                ", idOfCustomer=" + idOfCustomer +
                ", idService=" + idService +
                '}';
    }

    public String getInforToCSV(){
        return idBooking+","+dayBooking+","+dayStartBooking+","+dayEndBooking+","+idOfCustomer+","+idService;
    }
}
