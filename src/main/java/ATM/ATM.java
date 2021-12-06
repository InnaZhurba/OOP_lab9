package ATM;

public class ATM {
    private Bill firstBill;

    public ATM(){
        Bill bill1 = new Bill1();
        Bill bill5 = new Bill5();
        Bill bill10 = new Bill10();
        Bill bill20 = new Bill20();

        bill20.setNext(bill10);
        bill10.setNext(bill5);
        bill5.setNext(bill1);

        firstBill = bill20;
    }

    public void process(int amount){
        firstBill.process(amount);
    }
}
