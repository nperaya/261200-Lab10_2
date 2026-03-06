// Interface ของระบบจ่ายเงินแบบเก่า (Old Payment System)
public interface Xpay {

    // ===== Getter methods =====
    String getCreditCardNo();     // หมายเลขบัตรเครดิต
    String getCustomerName();     // ชื่อลูกค้า
    String getCardExpMonth();     // เดือนหมดอายุ
    String getCardExpYear();      // ปีหมดอายุ
    Short getCardCVVNo();         // CVV
    Double getAmount();           // จำนวนเงิน

    // ===== Setter methods =====
    void setCreditCardNo(String creditCardNo);
    void setCustomerName(String customerName);
    void setCardExpMonth(String cardExpMonth);
    void setCardExpYear(String cardExpYear);
    void setCardCVVNo(Short cardCVVNo);
    void setAmount(Double amount);
}
