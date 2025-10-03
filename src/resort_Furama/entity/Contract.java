package resort_Furama.entity;

public class Contract {
    private int numberContract;
    private String idBooking;
    private int depositOfContract;
    private int totalPaymentOfContract;

    public Contract() {
    }

    public Contract(int numberContract, String idBooking, int depositOfContract, int totalPaymentOfContract) {
        this.numberContract = numberContract;
        this.idBooking = idBooking;
        this.depositOfContract = depositOfContract;
        this.totalPaymentOfContract = totalPaymentOfContract;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public int getDepositOfContract() {
        return depositOfContract;
    }

    public void setDepositOfContract(int depositOfContract) {
        this.depositOfContract = depositOfContract;
    }

    public int getTotalPaymentOfContract() {
        return totalPaymentOfContract;
    }

    public void setTotalPaymentOfContract(int totalPaymentOfContract) {
        this.totalPaymentOfContract = totalPaymentOfContract;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract=" + numberContract +
                ", idBooking='" + idBooking + '\'' +
                ", depositOfContract=" + depositOfContract +
                ", totalPaymentOfContract=" + totalPaymentOfContract +
                '}';
    }

    public String getInforToCSV (){
        return numberContract+","+idBooking+","+depositOfContract+","+totalPaymentOfContract;
    }
}
