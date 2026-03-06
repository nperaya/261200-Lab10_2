// Main
public class Lab10_2 {

    public static void main(String[] args) {

        // สร้าง object ของระบบเก่า
        Xpay xpay = new XpayImpl();

        // กำหนดข้อมูลบัตร
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Somchai Jaidee");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);

        // สร้าง Adapter เพื่อแปลง Xpay ไป PayD
        PayD payD = new XpayToPayDAdapter(xpay);

        // เรียกข้อมูลผ่าน interface PayD
        System.out.println("Credit Card Number: " + payD.getCreditCardNo());
        System.out.println("Card Owner Name: " + payD.getCardOwnerName());
        System.out.println("Card Expiry Date: " + payD.getCardExpMonthYear());
        System.out.println("CVV: " + payD.getCVVNo());
        System.out.println("Total Amount: " + payD.getTotalAmount());
    }
}
