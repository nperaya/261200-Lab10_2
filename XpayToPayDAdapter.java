// Adapter class
// ทำหน้าที่แปลง Xpay ไป PayD
public class XpayToPayDAdapter implements PayD {

    // reference ไปยังระบบเก่า
    private Xpay xpay;

    // Constructor รับ Xpay object
    public XpayToPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
    }

    // Adapter
    // แปลงข้อมูลจาก Xpay ให้เป็นรูปแบบของ PayD

    @Override
    public long getCreditCardNo() {
        // แปลง String → long
        return Long.parseLong(xpay.getCreditCardNo());
    }

    @Override
    public String getCardOwnerName() {
        // เปลี่ยนชื่อ method
        return xpay.getCustomerName();
    }

    @Override
    public String getCardExpMonthYear() {
        // รวมเดือนและปี
        return xpay.getCardExpMonth() + "/" + xpay.getCardExpYear();
    }

    @Override
    public Integer getCVVNo() {
        // แปลง Short → Integer
        return Integer.valueOf(xpay.getCardCVVNo());
    }

    @Override
    public Double getTotalAmount() {
        return xpay.getAmount();
    }

    // =Setter

    @Override
    public void setCreditCardNo(long creditCardNo) {
        // แปลง long → String
        xpay.setCreditCardNo(String.valueOf(creditCardNo));
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        xpay.setCustomerName(cardOwnerName);
    }

    @Override
    public void setCardExpMonthYear(String cardExpMonthYear) {
        // แยกเดือนและปี
        String[] parts = cardExpMonthYear.split("/");
        xpay.setCardExpMonth(parts[0]);
        xpay.setCardExpYear(parts[1]);
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        xpay.setCardCVVNo(cVVNo.shortValue());
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        xpay.setAmount(totalAmount);
    }
}
