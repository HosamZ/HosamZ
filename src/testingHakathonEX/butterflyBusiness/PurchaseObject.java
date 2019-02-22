package testingHakathonEX.butterflyBusiness;

public class PurchaseObject {
    private String dateOfPayment;
    private Integer cardNumber;
    private Double amountPaid;

    public PurchaseObject(String dateOfPayment, Integer cardNumber, Double amountPaid) {
        this.dateOfPayment = dateOfPayment;
        this.cardNumber = cardNumber;
        this.amountPaid = amountPaid;
    }

    public String getDateOfPayment() {
        return dateOfPayment;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setDateOfPayment(String dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }
}
