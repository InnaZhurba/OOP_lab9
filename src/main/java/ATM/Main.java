package ATM;

import ATM.Bill;
import ATM.Bill10;
import ATM.Bill20;
import ATM.Bill5;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        int amount = scanner.nextInt();
        //System.out.println(amount);

        ATM atm = new ATM();
        atm.process(amount);
    }
}
