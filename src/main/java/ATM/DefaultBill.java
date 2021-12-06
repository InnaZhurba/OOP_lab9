package ATM;

public class DefaultBill implements Bill {
    private final int billAmount;
    private Bill bill;

    public DefaultBill(int billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public void setNext(Bill bill) {
        this.bill = bill;
    }

    @Override
    public int process(int amount) {
        if(amount<=0)
            return 0;
        int left = amount/billAmount;

        int nextAmount = (left>0)?(amount-left*billAmount):amount;
        System.out.println(billAmount+"x"+left+" : left - "+nextAmount);

        if(bill!=null)
            bill.process(nextAmount);
        return 1;
    }
}
