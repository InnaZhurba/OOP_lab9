package ATM;

public interface Bill {
    void setNext(Bill bill);
    int process(int amount);
}
