package ATM;

import static org.junit.jupiter.api.Assertions.*;

class DefaultBillTest {
Bill bill20 = new Bill20();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Bill bill1 = new Bill1();
        Bill bill5 = new Bill5();
        Bill bill10 = new Bill10();

        bill20.setNext(bill10);
        bill10.setNext(bill5);
        bill5.setNext(bill1);
    }

    @org.junit.jupiter.api.Test
    void process() {
        assertEquals(1,bill20.process(148));
    }
}